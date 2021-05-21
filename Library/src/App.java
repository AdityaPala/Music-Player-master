import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class App {
    public static void main(String[] args) {

        BlockingQueue<LibraryInterface> queue = new LinkedBlockingQueue<>();

        Library library = new Library();
        LibraryFrame libraryFrame = new LibraryFrame(queue, library.getPlaylist(), library.getSong(), library.getArtist(), library.getAlbum());
        Controller controller = new Controller(queue, library, libraryFrame);
        controller.mainLoop();
    }
}