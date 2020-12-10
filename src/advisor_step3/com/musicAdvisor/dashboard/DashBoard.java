package advisor_step3.com.musicAdvisor.dashboard;

import advisor_step3.api.AuthorizationServiceImpl;
import advisor_step3.api.Constants;
import advisor_step3.com.musicAdvisor.model.MusicAdvisor;

public class DashBoard {
    public static void currentDashBoard(MusicAdvisor advisor) {
        boolean exit = false;
        do {
            String userChoice = Constants.SCANNER.nextLine();
            switch (userChoice){
                case "new":
                    MusicAdvisor.newTubes(advisor);
                    for (int i = 0; i < advisor.get_new().size(); i++) {
                        System.out.println(advisor.get_new().get(i));
                    }
                    break;
                case "featured":
                    MusicAdvisor.featuredNow(advisor);
                    for (int i = 0; i < advisor.getFeatured().size(); i++) {
                        System.out.println(advisor.getFeatured().get(i));
                    }
                    break;
                case "categories":
                    MusicAdvisor.allCategories(advisor);
                    for (int i = 0; i < advisor.getCategories().size(); i++) {
                        System.out.println(advisor.getCategories().get(i));
                    }
                    break;
                case "playlists Mood":
                    MusicAdvisor.moodPlaylist(advisor);
                    for (int i = 0; i < advisor.getMoodPlaylist().size(); i++) {
                        System.out.println(advisor.getMoodPlaylist().get(i));
                    }
                    break;
                case "playlists Latin":
                    MusicAdvisor.latinPlaylist(advisor);
                    for (int i = 0; i < advisor.getLatinPlaylist().size(); i++) {
                        System.out.println(advisor.getLatinPlaylist().get(i));
                    }
                    break;
                case "playlists Pop":
                    MusicAdvisor.popPlaylist(advisor);
                    for (int i = 0; i < advisor.getPopPlaylist().size(); i++) {
                        System.out.println(advisor.getPopPlaylist().get(i));
                    }
                    break;
                case "playlists Top Lists":
                    MusicAdvisor.topListsPlaylist(advisor);
                    for (int i = 0; i < advisor.getTopListsPlaylist().size(); i++) {
                        System.out.println(advisor.getTopListsPlaylist().get(i));
                    }
                    break;
                case "exit":
                    System.out.println("---GOODBYE!---");
                    exit = true;
                    Constants.SCANNER.close();
                    break;
                default:
                    System.out.println(Constants.UNKNOWN_COMMAND);
            }
        }while (!exit);
    }

    public static void authentication() {
        boolean exit = false;
        do {
            switch (Constants.SCANNER.nextLine()){
                case "auth":
                    new AuthorizationServiceImpl().getAuthorized();
                    MusicAdvisor advisor = new MusicAdvisor();
                    currentDashBoard(advisor);
                    exit = true;
                    Constants.SCANNER.close();
                    break;
                case "exit":
                    System.out.println("---GOODBYE!---");
                    exit = true;
                    Constants.SCANNER.close();
                    break;
                default:
                    System.out.println(Constants.PROVIDE_ACCESS);
            }
        }while (!exit);
    }
}
