/**
 * Adds a new Playlist to the Library
 */
public class CreatePlaylist implements LibraryInterface {
    String playlist;
    public CreatePlaylist(String playlist) {
        this.playlist = playlist;
    }
    public String getPlaylist() { return playlist; }
}
