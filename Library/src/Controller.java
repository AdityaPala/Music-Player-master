import java.util.concurrent.BlockingQueue;

public class Controller {
    BlockingQueue<LibraryInterface> queue;
    Library library;
    LibraryFrame libraryFrame;

    public Controller(BlockingQueue<LibraryInterface> queue, Library library, LibraryFrame libraryFrame) {
        this.queue = queue;
        this.library = library;
        this.libraryFrame = libraryFrame;
    }

    public void mainLoop() {
        while (libraryFrame.isDisplayable()) {
            LibraryInterface libraryInterface = null;
            try {
                libraryInterface = queue.take();
            } catch (InterruptedException exception) {
                // do nothing
            }

            if(libraryInterface.getClass() == CreatePlaylist.class) {

                CreatePlaylist namePlaylist = (CreatePlaylist) libraryInterface;
                library.setPlaylist(namePlaylist.getPlaylist()); // update model
                libraryFrame.updatePlaylistInView(library.getPlaylist()); // update view
            }
            else if(libraryInterface.getClass() == StoreASong.class) {

                // update model and view
                StoreASong nameSong = (StoreASong) libraryInterface;
                library.setSong(nameSong.getSong());
                libraryFrame.updateSongInView(library.getSong());
            }
            else if(libraryInterface.getClass() == AddArtist.class) {

                // update model and view
                AddArtist nameArtist = (AddArtist) libraryInterface;
                library.setArtist(nameArtist.getArtist());
                libraryFrame.updateArtistInView(library.getArtist());
            }
            else if(libraryInterface.getClass() == AddAlbum.class) {

                // update model and view
                AddAlbum nameAlbum = (AddAlbum) libraryInterface;
                library.setAlbum(nameAlbum.getAlbum());
                libraryFrame.updateAlbumInView(library.getSong());
            }

        }
    }
}