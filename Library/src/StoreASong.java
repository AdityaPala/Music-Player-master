public class StoreASong implements LibraryInterface{
    String song;
    public StoreASong(String song) {
        this.song = song;
    }
    public String getSong() { return song; }
}
