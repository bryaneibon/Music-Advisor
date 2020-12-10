package advisor_step2;

import advisor_step2.OAuth.AdvisorAuthorizationAPI;

import java.util.ArrayList;
import java.util.Scanner;
/* Here we will introduce OAuth basics and register your application on the Spotify site.
*
* You can find more information in the authorization guide (look at Authorization Code Flow section):
* https://developer.spotify.com/documentation/general/guides/authorization-guide/
*
* #Objectives
* So, in this stage, you must go to the Spotify Web site for developers and create your application.
* To create an application, you should select Dashboard tab on the site, log in to Spotify, and click the button Create an App.
* Add one more command to your program: an auth command that will print the auth link and allow us to use another command (no real authorization required, just print a workable link and make some Boolean field true). Don't forget to put your client id in this link.
* Make commands unavailable if user access for your program is not confirmed (if they did not call the auth command).
Remember that you should add your redirect_uri in the settings of your application.
*/
public class MusicAdvisor {
    private ArrayList<String> _new = new ArrayList<>();
    private ArrayList<String> featured = new ArrayList<>();
    private ArrayList<String> categories = new ArrayList<>();
    private ArrayList<String> moodPlaylist = new ArrayList<>();
    private ArrayList<String> latinPlaylist = new ArrayList<>();
    private ArrayList<String> popPlaylist = new ArrayList<>();
    private ArrayList<String> topListsPlaylist = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public ArrayList<String> get_new() {
        return _new;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public ArrayList<String> getFeatured() {
        return featured;
    }

    public ArrayList<String> getMoodPlaylist() {
        return moodPlaylist;
    }

    public ArrayList<String> getLatinPlaylist() {
        return latinPlaylist;
    }

    public ArrayList<String> getPopPlaylist() {
        return popPlaylist;
    }

    public ArrayList<String> getTopListsPlaylist() {
        return topListsPlaylist;
    }

    public void setLatinPlaylist(ArrayList<String> latinPlaylist) {
        this.latinPlaylist = latinPlaylist;
    }

    public void setPopPlaylist(ArrayList<String> popPlaylist) {
        this.popPlaylist = popPlaylist;
    }

    public void setTopListsPlaylist(ArrayList<String> topListsPlaylist) {
        this.topListsPlaylist = topListsPlaylist;
    }

    public void set_new(ArrayList<String> _new) {
        this._new = _new;
    }

    public void setCategories(ArrayList<String> categories) {
        this.categories = categories;
    }

    public void setFeatured(ArrayList<String> featured) {
        this.featured = featured;
    }

    public void setMoodPlaylist(ArrayList<String> moodPlaylist) {
        this.moodPlaylist = moodPlaylist;
    }

    protected static void newTubes(MusicAdvisor musicAdvisor){
        System.out.println("---NEW RELEASES---");
        musicAdvisor.get_new().add("Mountains [Sia, Diplo, Labrinth]");
        musicAdvisor.get_new().add("Runaway [Lil Peep]");
        musicAdvisor.get_new().add("The Greatest Show [Panic! At The Disco]");
        musicAdvisor.get_new().add("All Out Life [Slipknot]");
    }

    protected static void featuredNow(MusicAdvisor musicAdvisor){
        System.out.println("---FEATURED---");
        musicAdvisor.getFeatured().add("Mellow Morning");
        musicAdvisor.getFeatured().add("Wake Up and Smell the Coffee");
        musicAdvisor.getFeatured().add("Monday Motivation");
        musicAdvisor.getFeatured().add("Songs to Sing in the Shower");
    }

    protected static void allCategories(MusicAdvisor musicAdvisor){
        System.out.println("---CATEGORIES---");
        musicAdvisor.getCategories().add("Top Lists");
        musicAdvisor.getCategories().add("Pop");
        musicAdvisor.getCategories().add("Mood");
        musicAdvisor.getCategories().add("Latin");
    }

    protected static void moodPlaylist(MusicAdvisor musicAdvisor){
        System.out.println("---MOOD PLAYLISTS---");
        musicAdvisor.getMoodPlaylist().add("Walk Like A Badass");
        musicAdvisor.getMoodPlaylist().add("Rage Beats");
        musicAdvisor.getMoodPlaylist().add("Arab Mood Booster");
        musicAdvisor.getMoodPlaylist().add("Sunday Stroll");
    }

    protected static void latinPlaylist(MusicAdvisor musicAdvisor){
        System.out.println("---LATIN PLAYLISTS---");
        musicAdvisor.getLatinPlaylist().add("Walk Like A Badass");
        musicAdvisor.getLatinPlaylist().add("Rage Beats");
        musicAdvisor.getLatinPlaylist().add("Arab Mood Booster");
        musicAdvisor.getLatinPlaylist().add("Sunday Stroll");
    }

    protected static void popPlaylist(MusicAdvisor musicAdvisor){
        System.out.println("---POP PLAYLISTS---");
        musicAdvisor.getPopPlaylist().add("Walk Like A Badass");
        musicAdvisor.getPopPlaylist().add("Rage Beats");
        musicAdvisor.getPopPlaylist().add("Arab Mood Booster");
        musicAdvisor.getPopPlaylist().add("Sunday Stroll");
    }

    protected static void topListsPlaylist(MusicAdvisor musicAdvisor){
        System.out.println("---TOP LISTS - PLAYLISTS---");
        musicAdvisor.getTopListsPlaylist().add("Walk Like A Badass");
        musicAdvisor.getTopListsPlaylist().add("Rage Beats");
        musicAdvisor.getTopListsPlaylist().add("Arab Mood Booster");
        musicAdvisor.getTopListsPlaylist().add("Sunday Stroll");
    }

    public static void computeSelection(MusicAdvisor musicAdvisor) {
        boolean exit = false;
        boolean isValidLink = false;
        do {
            String userChoice = scanner.nextLine();
            switch (userChoice){
                case "auth":
                    isValidLink = "https://accounts.spotify.com/authorize?client_id=28decf2ea8ed4e4eaebc8929fab87073&redirect_uri=https://hyperskill.org/&response_type=code".equals(AdvisorAuthorizationAPI.authorizationValidator());
                    String outputAuthorizationMessage = isValidLink ? "https://accounts.spotify.com/authorize?client_id=28decf2ea8ed4e4eaebc8929fab87073&redirect_uri=https://hyperskill.org/&response_type=code\n---SUCCESS---" : "Please, provide access for application.";
                    System.out.println(outputAuthorizationMessage);
                    break;
                case "new":
                    if (isValidLink){
                        newTubes(musicAdvisor);
                        for (int i = 0; i < musicAdvisor.get_new().size(); i++) {
                            System.out.println(musicAdvisor.get_new().get(i));
                        }
                    } else{
                        System.out.println("Please, provide access for application.");
                    }
                    break;
                case "featured":
                    if (isValidLink){
                        featuredNow(musicAdvisor);
                        for (int i = 0; i < musicAdvisor.getFeatured().size(); i++) {
                            System.out.println(musicAdvisor.getFeatured().get(i));
                        }
                    } else {
                        System.out.println("Please, provide access for application.");
                    }
                    break;
                case "categories":
                    if (isValidLink){
                        allCategories(musicAdvisor);
                        for (int i = 0; i < musicAdvisor.getCategories().size(); i++) {
                            System.out.println(musicAdvisor.getCategories().get(i));
                        }
                    } else {
                        System.out.println("Please, provide access for application.");
                    }
                    break;
                case "playlists Mood":
                    if (isValidLink){
                        moodPlaylist(musicAdvisor);
                        for (int i = 0; i < musicAdvisor.getMoodPlaylist().size(); i++) {
                            System.out.println(musicAdvisor.getMoodPlaylist().get(i));
                        }
                    } else {
                        System.out.println("Please, provide access for application.");
                    }

                    break;
                case "playlists Latin":
                    if (isValidLink){
                        latinPlaylist(musicAdvisor);
                        for (int i = 0; i < musicAdvisor.getLatinPlaylist().size(); i++) {
                            System.out.println(musicAdvisor.getLatinPlaylist().get(i));
                        }
                    } else {
                        System.out.println("Please, provide access for application.");
                    }
                    break;
                case "playlists Pop":
                    if (isValidLink){
                        popPlaylist(musicAdvisor);
                        for (int i = 0; i < musicAdvisor.getPopPlaylist().size(); i++) {
                            System.out.println(musicAdvisor.getPopPlaylist().get(i));
                        }
                    } else {
                        System.out.println("Please, provide access for application.");
                    }
                    break;
                case "playlists Top Lists":
                    if (isValidLink){
                        topListsPlaylist(musicAdvisor);
                        for (int i = 0; i < musicAdvisor.getTopListsPlaylist().size(); i++) {
                            System.out.println(musicAdvisor.getTopListsPlaylist().get(i));
                        }
                    } else {
                        System.out.println("Please, provide access for application.");
                    }
                    break;
                case "exit":
                    System.out.println("---GOODBYE!---");
                    exit = true;
                    isValidLink = false;
                    scanner.close();
                    //linkEntry.close();
                    break;
                default:
                    System.out.println("Unknown Command, choose between <auth>, <new>, <featured>, <categories>, <playlists 'name'> or 0 to exit the program");
            }
        }while (!exit);
    }

    public static void main(String[] args) {
        MusicAdvisor musicAdvisor = new MusicAdvisor();
        computeSelection(musicAdvisor);
    }
}
