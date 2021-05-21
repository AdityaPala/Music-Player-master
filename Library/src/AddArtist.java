public class AddArtist implements LibraryInterface{
    String artist;
    public AddArtist(String artist) {
        this.artist = artist;
    }
    public String getArtist() { return artist; }
}
