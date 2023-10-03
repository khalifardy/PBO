import java.util.ArrayList;
import java.util.List;


public class DriverAlbum {
    public static void main(String[] args) {
        List<String> artist1 = new ArrayList<>();
        artist1.add("Alan Walker");
        artist1.add("Torine");

        List<String> artist2 = new ArrayList<>();
        artist2.add("Sheila on 7");

        Song song1 = new Song("Hello World", artist1, 171);
        Song song2 = new Song("Film Favorit", artist2, 226);

        Album album = new Album();
        album.setTitle("Kayaknya Hits");
        album.setYear(2023);
        album.addSong(song1);
        album.addSong(song2);
        album.displayInfo();
    }
}
