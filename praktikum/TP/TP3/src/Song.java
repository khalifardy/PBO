import java.util.ArrayList;
import java.util.List;

public class Song {
    private String title;
    private List<String> artist;
    private int duration;

    public Song() {
        this.title = "untitled";
        this.artist = new ArrayList<>();
        this.duration = 0;
    }

    public Song(String title, List<String> artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(List<String> artists) {
        this.artist.clear();
        this.artist.addAll(artists);
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getArtist() {
        return artist;
    }

    public String getDuration() {
        int jam = duration / 3600;
        int sisa = duration % 3600;
        int menit = sisa / 60;
        int detik = sisa % 60;

        if (jam == 0) {
            return String.format("%02d:%02d", menit, detik);
        } else {
            return String.format("%02d:%02d:%02d", jam, menit, detik);
        }
    }
}
