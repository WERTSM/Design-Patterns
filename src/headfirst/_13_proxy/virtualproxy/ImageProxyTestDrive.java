package headfirst._13_proxy.virtualproxy;
/**
 * Created by WERT on 03.04.2017.
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

public class ImageProxyTestDrive {
    ImageComponent imageComponent;
    JFrame frame = new JFrame("Игроки Спартака");
    JMenuBar menuBar;
    JMenu menu;
    Hashtable cds = new Hashtable();

    public static void main(String[] args) throws Exception {
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws Exception {
        cds.put("Фернандо", "http://fanat1k.ru/images-pic-255247.php");
        cds.put("Комбаров", "http://fanat1k.ru/images-pic-254697.php");
        cds.put("Ещенко", "http://fanat1k.ru/images-pic-254408.php");
        cds.put("Адриано", "http://fanat1k.ru/images-pic-254382.php");
        cds.put("Маурисио", "http://fanat1k.ru/images-pic-254386.php");
        cds.put("Квинси Промес", "http://fanat1k.ru/images-pic-254407.php");
        cds.put("Глушаков", "http://fanat1k.ru/images-pic-252741.php");

        URL initialURL = new URL((String) cds.get("Глушаков"));
        menuBar = new JMenuBar();
        menu = new JMenu("Тут игроки Спартака");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        for (Enumeration e = cds.keys(); e.hasMoreElements(); ) {
            String name = (String) e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    imageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand())));
                    frame.repaint();
                }
            });
        }

        // set up frame and menus

        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);

    }

    URL getCDUrl(String name) {
        try {
            return new URL((String) cds.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}