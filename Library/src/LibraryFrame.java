import javax.swing.*;
import java.awt.*;
import java.util.concurrent.BlockingQueue;

public class LibraryFrame extends JFrame{
    BlockingQueue<LibraryInterface> queue;
    JButton createPlaylistButtonButton;
    JButton storeSongInPlaylistButtonButton;
    JButton likedArtistButtonButton;
    JButton likedAlbumButtonButton;
    JTextField enterNameOfPlaylistTextField;
    JTextField putASongHereTextField;
    JTextField enterANameOfTextField;
    JTextField putAnAlbumHereTextField;

    JLabel playlistLabel;
    JLabel songLabel;
    JLabel albumLabel;
    JLabel artistLabel;

    public LibraryFrame(BlockingQueue<LibraryInterface> queue, String playlist, String song, String artist, String album) {
        this.queue = queue;
        this.playlistLabel = new JLabel(playlist);
        this.songLabel = new JLabel(song);
        this.albumLabel = new JLabel(album);
        this.artistLabel = new JLabel(artist);
        this.createPlaylistButtonButton = new JButton("CreatePlaylist");
        this.likedArtistButtonButton = new JButton("Like");
        this.likedAlbumButtonButton = new JButton("Like");
        this.storeSongInPlaylistButtonButton = new JButton("StoreSong");
        this.enterANameOfTextField = new JTextField(10);
        this.enterNameOfPlaylistTextField = new JTextField(10);
        this.putAnAlbumHereTextField = new JTextField(10);
        this.putASongHereTextField = new JTextField(10);


      createPlaylistButtonButton.addActionListener(e -> {
            String value = enterNameOfPlaylistTextField.getText();
            try {
                queue.put(new CreatePlaylist((value)));
            }catch (InterruptedException exception){
                //do nothing
            }
        });

        storeSongInPlaylistButtonButton.addActionListener(e -> {
            String value = putASongHereTextField.getText();
            try {
                queue.put(new StoreASong(value));
            }catch (InterruptedException exception){
                //do nothing
            }
        });

        likedArtistButtonButton.addActionListener(e -> {
            String value = enterANameOfTextField.getText();
            try {
                queue.put(new AddArtist(value));
            }catch (InterruptedException exception){
                //do nothing
            }
        });

        likedAlbumButtonButton.addActionListener(e -> {
            String value = putAnAlbumHereTextField.getText();
            try {
                queue.put(new AddAlbum(value));
            }catch (InterruptedException exception){
                //do nothing
            }
        });

        this.setLayout(new FlowLayout());
        this.setTitle("Library");
        this.add(new JLabel("Playlist"));
        this.add(playlistLabel);
        this.add(enterNameOfPlaylistTextField);
        this.add(createPlaylistButtonButton);
        this.add(new JLabel("Song"));
        this.add(songLabel);
        this.add(putASongHereTextField);
        this.add(storeSongInPlaylistButtonButton);
        this.add(new JLabel("Artist"));
        this.add(artistLabel);
        this.add(enterANameOfTextField);
        this.add(likedArtistButtonButton);
        this.add(new JLabel("Album"));
        this.add(albumLabel);
        this.add(putAnAlbumHereTextField);
        this.add(likedAlbumButtonButton);
        this.setSize(1100,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void updatePlaylistInView(String playlist) {
        this.playlistLabel.setText(playlist);
    }
    public void updateSongInView(String song) {
        this.songLabel.setText(song);
    }
    public void updateArtistInView(String artist) {
        this.artistLabel.setText(artist);
    }
    public void updateAlbumInView(String album) {
        this.albumLabel.setText(album);
    }
}
