package advisor_step3.com.musicAdvisor.model;

import java.util.ArrayList;

public class MusicAdvisor {
    private ArrayList<String> _new = new ArrayList<>();
    private ArrayList<String> featured = new ArrayList<>();
    private ArrayList<String> categories = new ArrayList<>();
    private ArrayList<String> moodPlaylist = new ArrayList<>();
    private ArrayList<String> latinPlaylist = new ArrayList<>();
    private ArrayList<String> popPlaylist = new ArrayList<>();
    private ArrayList<String> topListsPlaylist = new ArrayList<>();

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

    public static void newTubes(MusicAdvisor advisor){
        System.out.println("---NEW RELEASES---");
        advisor.get_new().add("Mountains [Sia, Diplo, Labrinth]");
        advisor.get_new().add("Runaway [Lil Peep]");
        advisor.get_new().add("The Greatest Show [Panic! At The Disco]");
        advisor.get_new().add("All Out Life [Slipknot]");
    }

    public static void featuredNow(MusicAdvisor advisor){
        System.out.println("---FEATURED---");
        advisor.getFeatured().add("Mellow Morning");
        advisor.getFeatured().add("Wake Up and Smell the Coffee");
        advisor.getFeatured().add("Monday Motivation");
        advisor.getFeatured().add("Songs to Sing in the Shower");
    }

    public static void allCategories(MusicAdvisor advisor){
        System.out.println("---CATEGORIES---");
        advisor.getCategories().add("Top Lists");
        advisor.getCategories().add("Pop");
        advisor.getCategories().add("Mood");
        advisor.getCategories().add("Latin");
    }

    public static void moodPlaylist(MusicAdvisor advisor){
        System.out.println("---MOOD PLAYLISTS---");
        advisor.getMoodPlaylist().add("Walk Like A Badass");
        advisor.getMoodPlaylist().add("Rage Beats");
        advisor.getMoodPlaylist().add("Arab Mood Booster");
        advisor.getMoodPlaylist().add("Sunday Stroll");
    }

    public static void latinPlaylist(MusicAdvisor advisor){
        System.out.println("---LATIN PLAYLISTS---");
        advisor.getLatinPlaylist().add("Walk Like A Badass");
        advisor.getLatinPlaylist().add("Rage Beats");
        advisor.getLatinPlaylist().add("Arab Mood Booster");
        advisor.getLatinPlaylist().add("Sunday Stroll");
    }

    public static void popPlaylist(MusicAdvisor advisor){
        System.out.println("---POP PLAYLISTS---");
        advisor.getPopPlaylist().add("Walk Like A Badass");
        advisor.getPopPlaylist().add("Rage Beats");
        advisor.getPopPlaylist().add("Arab Mood Booster");
        advisor.getPopPlaylist().add("Sunday Stroll");
    }

    public static void topListsPlaylist(MusicAdvisor advisor){
        System.out.println("---TOP LISTS - PLAYLISTS---");
        advisor.getTopListsPlaylist().add("Walk Like A Badass");
        advisor.getTopListsPlaylist().add("Rage Beats");
        advisor.getTopListsPlaylist().add("Arab Mood Booster");
        advisor.getTopListsPlaylist().add("Sunday Stroll");
    }
}
