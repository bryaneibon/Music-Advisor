package advisor_step3.api;

import com.sun.net.httpserver.HttpServer;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.InetSocketAddress;
import java.net.URI;

import java.io.IOException;
import java.net.http.HttpResponse;

public class AuthorizationServiceImpl implements AuthorizationService {
    /* Authorize the connexion by clicking on the link */
    @Override
    public void authorize(String authorizationServerUrl) {
        System.out.println("use this link to request the access code:");
        System.out.println(authorizationServerUrl
                + "/authorize"
                + "?client_id=" + Constants.getClientId()
                + "&redirect_uri=" + Constants.REDIRECT_URI
                + "&response_type=" + Constants.RESPONSE_TYPE);
        getRequest();
    }

    /* Create the server and the context in order to get the AUTHORIZATION_CODE, which will be used to get the access_token */
    @Override
    public void getRequest() {
        try {
            HttpServer server = HttpServer.create();
            server.bind(new InetSocketAddress(8080), 0);
            server.start();
            server.createContext("/",
                    exchange -> {
                        String query = exchange.getRequestURI().getQuery();
                        String request;
                        if (query != null && query.contains("code")) {
                            Constants.AUTHORIZATION_CODE = query.substring(5);
                            System.out.println("code received");
                            System.out.println(Constants.AUTHORIZATION_CODE);
                            request = "Got the code. Return back to your program.";
                        } else {
                            request = "Authorization code not found. Try again.";
                        }
                        exchange.sendResponseHeaders(200, request.length());
                        exchange.getResponseBody().write(request.getBytes());
                        exchange.getResponseBody().close();
                    });

            System.out.println("waiting for code...");
            while (Constants.AUTHORIZATION_CODE == null) {
                Thread.sleep(100);
            }
            server.stop(5);

        } catch (IOException | InterruptedException e) {
            System.out.println("Server error");
        }
    }

    @Override
    public void getAccessToken(String accessPoint) {
        System.out.println("making http request for access_token...\nresponse:");
        HttpRequest request = HttpRequest.newBuilder()
                .header("Content-Type", "application/x-www-form-urlencoded")
                .uri(URI.create(accessPoint + "/api/token"))
                .POST(HttpRequest.BodyPublishers.ofString(
                        "grant_type=" + Constants.GRANT_TYPE
                                + "&code=" + Constants.AUTHORIZATION_CODE
                                + "&client_id=" + Constants.getClientId()
                                + "&client_secret=" + Constants.getClientSecret()
                                + "&redirect_uri=" + Constants.REDIRECT_URI))
                .build();

        try {
            HttpClient client = HttpClient.newBuilder().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            assert response != null;
            System.out.println(response.body() + "\n---SUCCESS---");
        } catch (InterruptedException | IOException e) { System.out.println("Error response"); }
    }

    @Override
    public void getAuthorized() {
        authorize(Constants.AUTHORIZATION_SERVER_URL);
        getAccessToken(Constants.AUTHORIZATION_SERVER_URL);
    }
}
