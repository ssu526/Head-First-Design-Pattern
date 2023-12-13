package Chapter_11_Proxy_Pattern.Virtual_Proxy;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

public class ImageProxyTestDrive {
    ImageComponent imageComponent;
    JFrame frame = new JFrame("Album Cover Viewer");
    JMenuBar menuBar;
    JMenu menu;
    Hashtable<String, String> albums = new Hashtable<String, String>();

    public static void main(String[] args) throws Exception{
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws Exception{
        albums.put("Buddha Bar","http://images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg");
        albums.put("Ima","http://images.amazon.com/images/P/B000005IRM.01.LZZZZZZZ.jpg");
        albums.put("Karma","http://images.amazon.com/images/P/B000005DCB.01.LZZZZZZZ.gif");
        albums.put("MCMXC a.D.","http://images.amazon.com/images/P/B000002URV.01.LZZZZZZZ.jpg");
        albums.put("Northern Exposure","http://images.amazon.com/images/P/B000003SFN.01.LZZZZZZZ.jpg");
        albums.put("Selected Ambient Works, Vol. 2","http://images.amazon.com/images/P/B000002MNZ.01.LZZZZZZZ.jpg");

        URL initialURL = new URL((String)albums.get("Selected Ambient Works, Vol. 2"));
        menuBar = new JMenuBar();
        menu = new JMenu("Favorite Albums");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        for(Enumeration<String> e = albums.keys(); e.hasMoreElements();){
            String name = (String)e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(event -> {
                imageComponent.setIcon((Icon) new ImageProxy(getAlbumURL(event.getActionCommand())));
                frame.repaint();
            });
        }

        // create an image proxy and set it to initial URL.
        // Whenever you choose a selection from the CD menu, you'll get a new image proxy
        Icon icon = (Icon) new ImageProxy(initialURL);

        // Wrap the proxy in a component, so it can be added to the frame.
        // The component will take care the proxy's width, height and similar details.
        imageComponent = new ImageComponent(icon);

        // Add the proxy to the frame, so it can be displayed
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    URL getAlbumURL(String name){
        try{
            return new URL((String)albums.get(name));
        }catch (MalformedURLException e){
            e.printStackTrace();
            return null;
        }
    }
}
