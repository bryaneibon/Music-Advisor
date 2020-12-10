package advisor_step1;

/* Below is a brief example of the described program. */

import java.util.ArrayList;
import java.util.Scanner;

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
        do {
            String userChoice = scanner.nextLine();
            switch (userChoice){
                case "new":
                    newTubes(musicAdvisor);
                    for (int i = 0; i < musicAdvisor.get_new().size(); i++) {
                        System.out.println(musicAdvisor.get_new().get(i));
                    }
                    break;
                case "featured":
                    featuredNow(musicAdvisor);
                    for (int i = 0; i < musicAdvisor.getFeatured().size(); i++) {
                        System.out.println(musicAdvisor.getFeatured().get(i));
                    }
                    break;
                case "categories":
                    allCategories(musicAdvisor);
                    for (int i = 0; i < musicAdvisor.getCategories().size(); i++) {
                        System.out.println(musicAdvisor.getCategories().get(i));
                    }
                    break;
                case "playlists Mood":
                    moodPlaylist(musicAdvisor);
                    for (int i = 0; i < musicAdvisor.getMoodPlaylist().size(); i++) {
                        System.out.println(musicAdvisor.getMoodPlaylist().get(i));
                    }
                    break;
                case "playlists Latin":
                    latinPlaylist(musicAdvisor);
                    for (int i = 0; i < musicAdvisor.getLatinPlaylist().size(); i++) {
                        System.out.println(musicAdvisor.getLatinPlaylist().get(i));
                    }
                    break;
                case "playlists Pop":
                    popPlaylist(musicAdvisor);
                    for (int i = 0; i < musicAdvisor.getPopPlaylist().size(); i++) {
                        System.out.println(musicAdvisor.getPopPlaylist().get(i));
                    }
                    break;
                case "playlists Top Lists":
                    topListsPlaylist(musicAdvisor);
                    for (int i = 0; i < musicAdvisor.getTopListsPlaylist().size(); i++) {
                        System.out.println(musicAdvisor.getTopListsPlaylist().get(i));
                    }
                    break;
                case "exit":
                    System.out.println("---GOODBYE!---");
                    exit = true;
                    scanner.close();
                    break;
                default:
                    System.out.println("Unknown Command, choose between <new>, <featured>, <categories>, <playlists 'name'> or 0 to exit the program");
            }
        }while (!exit);
    }

    public static void main(String[] args) {
        MusicAdvisor musicAdvisor = new MusicAdvisor();
        computeSelection(musicAdvisor);
    }
}
