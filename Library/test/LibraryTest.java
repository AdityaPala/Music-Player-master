import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    @Test
    public void testGetPlaylist() {
          Library l = new Library();
          l.getPlaylist();
          assertEquals(" ", l.getPlaylist());
    }
    @Test
    public void testGetSong() {
        Library l = new Library();
        l.getSong();
        assertEquals(" ", l.getSong());
    }
    @Test
    public void testGetArtist() {
        Library l = new Library();
        l.getArtist();
        assertEquals(" ", l.getArtist());
    }
    @Test
    public void testGetAlbum() {
        Library l = new Library();
        l.getAlbum();
        assertEquals(" ", l.getAlbum());
    }
}
