public class AddAlbum implements LibraryInterface {
    String album;
    public AddAlbum(String album) {
        this.album = album;
    }
    public String getAlbum() { return album; }
}
