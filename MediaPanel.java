import java.awt.BorderLayout;
import java.awt.Component;
import java.io.IOException;
import java.net.URL;
import javax.media.*;
import javax.swing.*;
  
class MediaPanel extends JPanel{
 
public MediaPanel(URL mediaURL){
 
setLayout(new BorderLayout());
 
Manager.setHint(Manager.LIGHTWEIGHT_RENDERER,true);
 
try{
Player mediaPlayer = Manager.createRealizedPlayer(mediaURL);
 
Component video = mediaPlayer.getVisualComponent();
Component controls = mediaPlayer.getControlPanelComponent();
 
if(video != null)
add(video,BorderLayout.NORTH);
 
if(controls != null)
add(controls,BorderLayout.SOUTH);
 
mediaPlayer.start();
}
 
catch(NoPlayerException noPlayerException){
System.err.println("No media Player Found.");
}
 
catch(CannotRealizeException cannotRealizedException){
System.err.println("Can not realize media Player.");
}
 
catch(IOException iOException){
System.err.println("Error Reading From Sources.");
}
 
}
}