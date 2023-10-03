import java.util.ArrayList;
import java.util.List;

public class Album {
    private String title;
    private int year;
    private List<Song> songs;

    public Album() {
        this.title = "Untitled";
        this.year = 1991;
        this.songs = new ArrayList<>();
    }

    public Album(String title, int year, List<Song> songs) {
        this.title = title;
        this.year = year;
        this.songs = songs;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }

    public void displayInfo() {
        System.out.println("Album Info");
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
        System.out.println("Song List:");

        int count = 1;
        for (Song song : songs) {
            System.out.println(count + ". Title: " + song.getTitle());
            System.out.println("   Artist: " + String.join(",", song.getArtist()));
            System.out.println("   Duration: " + song.getDuration());
            count++;
        }
    }
}
