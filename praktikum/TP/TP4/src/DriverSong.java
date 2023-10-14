import java.util.ArrayList;
import java.util.List;

import art.Song;
import job.Artist;

public class DriverSong {
    public static void main(String[] args) {
        Artist a1 = new Artist("Alan Walker", "1997-12-03");
        Artist a2 = new Artist("Ari Lasso", "1973-01-17");

        List<Artist> listArtist = new ArrayList<>();
        listArtist.add(a1);
        listArtist.add(a2);

        for (Artist artist : listArtist) {
            artist.displayInfo();
            System.out.println(" ");
        }

        Song song1 = new Song("Not You", a1, "2021-12-03");
        Song song2 = new Song("Hampa", a2, "2023-02-10");

        List<Song> listSong = new ArrayList<>();
        listSong.add(song1);
        listSong.add(song2);

        for (Song song : listSong) {
            song.displayInfo();
            System.out.println(" ");
        }
    }
}
