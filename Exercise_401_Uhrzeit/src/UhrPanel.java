
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.PopupMenu;
import java.time.LocalTime;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UhrPanel extends JPanel implements Runnable {

    Zahl z;
    LocalTime d;

    public UhrPanel(LocalTime d) {
        this.d = d;
        System.out.println("hi1");
    }

    @Override
    public void run() {
        
                 
            
        
        System.out.println("hi");
        this.setLayout(new GridLayout(1, 8));
        this.setSize(1800, 302);

        int zahl = d.getHour();
        String s = String.format("%02d", zahl);
        this.add(new Zahl(Integer.parseInt(s.substring(0, 1))));
        this.add(new Zahl(Integer.parseInt(s.substring(1, 2))));

        zahl = d.getMinute();
        s = String.format("%02d", zahl);
        this.add(new Zahl(Integer.parseInt(s.substring(0, 1))));
        this.add(new Zahl(Integer.parseInt(s.substring(1, 2))));

        zahl = d.getSecond();
        s = String.format("%02d", zahl);
        this.add(new Zahl(Integer.parseInt(s.substring(0, 1))));
        this.add(new Zahl(Integer.parseInt(s.substring(1, 2))));

        repaint();
        
    }

}
