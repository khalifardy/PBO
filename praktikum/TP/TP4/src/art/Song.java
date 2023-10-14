package art;
import job.Artist;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Song {
    private String title;
    private Artist artist; // Objek kelas Artist
    private String release;

    public Song(String title, Artist artist, String release) {
        this.title = title;
        this.artist = artist;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date releaseDate = dateFormat.parse(release);
            SimpleDateFormat outputFormat = new SimpleDateFormat("dd MMMM yyyy");
            this.release = outputFormat.format(releaseDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void setRelease(String release) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date releaseDate = dateFormat.parse(release);
            SimpleDateFormat outputFormat = new SimpleDateFormat("dd MMMM yyyy");
            this.release = outputFormat.format(releaseDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public String getTitle() {
        return title;
    }

    public Artist getArtist() {
        return artist;
    }

    public String getRelease() {
        return release;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist.getName());
        System.out.println("Release: " + release);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        try {
            Date birthDate = dateFormat.parse(artist.getBirthdate());
            Date releaseDate = dateFormat.parse(release);

            Calendar calendarBirth = Calendar.getInstance();
            calendarBirth.setTime(birthDate);

            Calendar calendarRelease = Calendar.getInstance();
            calendarRelease.setTime(releaseDate);

            int birthYear = calendarBirth.get(Calendar.YEAR);
            int releaseYear = calendarRelease.get(Calendar.YEAR);
            int age = releaseYear - birthYear;
            System.out.println("Artist age is " + age + " when the song was released");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
