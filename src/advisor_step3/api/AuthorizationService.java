package advisor_step3.api;

public interface AuthorizationService {
    void authorize(String s);
    void getAccessToken(String s);
    void getRequest();
    void getAuthorized();
}
