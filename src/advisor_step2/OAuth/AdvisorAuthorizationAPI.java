package advisor_step2.OAuth;

public class AdvisorAuthorizationAPI {
    private String authorizationLink;

    private String getAuthorizationLink() {
        return authorizationLink;
    }

    private void setAuthorizationLink() {
        this.authorizationLink = "https://accounts.spotify.com/authorize?client_id=28decf2ea8ed4e4eaebc8929fab87073&redirect_uri=https://hyperskill.org/&response_type=code";
    }

    public static String authorizationValidator(){
        AdvisorAuthorizationAPI advisorAuthorizationAPI = new AdvisorAuthorizationAPI();
        advisorAuthorizationAPI.setAuthorizationLink();
        return advisorAuthorizationAPI.getAuthorizationLink();
    }
}
