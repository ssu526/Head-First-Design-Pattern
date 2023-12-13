package Chapter_11_Proxy_Pattern.Virtual_Proxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy {
    // The imageIcon is the REAL icon that we eventually want to display when it's loaded
    volatile ImageIcon imageIcon;
    final URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL url){
        imageURL = url;
    }

    public int getIconWidth(){
        if(imageIcon != null){
            return imageIcon.getIconWidth();
        }else{
            return 800;
        }
    }

    public int getIconHeight(){
        if(imageIcon != null){
            return imageIcon.getIconHeight();
        }else{
            return 600;
        }
    }

    synchronized void setImageIcon(ImageIcon imageIcon){
        this.imageIcon = imageIcon;
    }

    public void paintIcon(final Component c, Graphics g, int x, int y){
        if(imageIcon != null){
            // If we've got an icon already, tell it to paint itself
            imageIcon.paintIcon(c, g, x, y);
        }else{
            // otherwise, display the loading message
            g.drawString("Loading album cover, please wait...", x + 300, y + 190);

            // Here we load the real icon image. the image loading with IconImage is synchronous
            // the ImageIcon constructor doesn't return until the image is loaded.
            if (!retrieving) {
                retrieving = true;

                // We don't want to hang up the entire UI, so we use another thread to retrieve the image
                retrievalThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try{
                            setImageIcon(new ImageIcon(imageURL, "Album Cover"));
                            c.repaint();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                });

                retrievalThread.start();
            }
        }
    }
}
