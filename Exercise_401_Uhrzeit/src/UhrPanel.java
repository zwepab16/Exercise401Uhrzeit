
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.PopupMenu;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UhrPanel extends JPanel implements Runnable {

    Zahl h1=new Zahl(0), h2=new Zahl(0), m1=new Zahl(0), m2=new Zahl(0), s1=new Zahl(0), s2=new Zahl(0);
    
    LocalTime d;

    public UhrPanel(LocalTime d) {
        this.d = d;
        this.setBackground(Color.BLACK);
        this.setLayout(new GridLayout(1, 8));
        this.setSize(1300, 302);
        update();
        Image image = new ImageIcon("./bilder/punkt.png").getImage().getScaledInstance(180, 302, Image.SCALE_SMOOTH);
        this.add(h1);
        this.add(h2);
        this.add(new JLabel(new ImageIcon(image)));
        this.add(m1);
        this.add(m2);
        this.add(new JLabel(new ImageIcon(image)));
        this.add(s1);
        this.add(s2);

    }

    @Override
    public void run() {

        while (true) {
            update();

            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(UhrPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void update() {
        d = LocalTime.now();
        int zahl = d.getHour();
        String s = String.format("%02d", zahl);
       h1.setIcon(Integer.parseInt(s.substring(0, 1)));
       h2.setIcon(Integer.parseInt(s.substring(1, 2)));

        zahl = d.getMinute();
        s = String.format("%02d", zahl);
        m1 = (new Zahl(Integer.parseInt(s.substring(0, 1))));
        m2 = (new Zahl(Integer.parseInt(s.substring(1, 2))));

        zahl = d.getSecond();
        s = String.format("%02d", zahl);
        s1.setIcon(Integer.parseInt(s.substring(0, 1)));
        s2.setIcon(Integer.parseInt(s.substring(1, 2)));
        repaint();

    }

}
