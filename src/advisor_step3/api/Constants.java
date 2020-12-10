package advisor_step3.api;

import java.util.Scanner;

public class Constants {
    public static final String REDIRECT_URI = "http://localhost:8080";
    public static final String GRANT_TYPE = "authorization_code";
    public static final String RESPONSE_TYPE = "code";
    public static String AUTHORIZATION_CODE;
    public static final String PROVIDE_ACCESS = "Please, provide access for application.";
    public static final String UNKNOWN_COMMAND = "Unknown Command, choose between <auth>, <new>, <featured>, <categories>, <playlists 'name'> or 0 to exit the program";
    public static final Scanner SCANNER = new Scanner(System.in);

    public static String AUTHORIZATION_SERVER_URL = "https://accounts.spotify.com";
    private static final String CLIENT_ID = "28decf2ea8ed4e4eaebc8929fab87073";
    private static final String CLIENT_SECRET = "d0a7a168f158401fb0e662b0a2868ac8";

    public static String getClientId() {
        return CLIENT_ID;
    }

    public static String getClientSecret() {
        return CLIENT_SECRET;
    }
}
