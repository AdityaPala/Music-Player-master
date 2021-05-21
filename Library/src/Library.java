
public class Library {
    private String song = " ";
    private String playlist = " ";
    private String artist = " ";
    private String album = " ";

    public void setPlaylist(String playlist) {
        if(playlist.length() > 0) {
            this.playlist = playlist;
        }
    }

   public void setSong(String song) {
        if(song.length() > 0) {
            this.song = song;
        }
        }

   public void setArtist(String artist) {
        if(artist.length() > 0) {
            this.artist = artist;
        }
        }

   public void setAlbum(String album) {
       if (album.length() > 0) {
           this.album = album;
       }
   }

   public String getPlaylist() { return playlist; }
   public String getSong() { return song; }
   public String getArtist() { return artist; }
   public String getAlbum() {return  album; }
}

