
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Zahl extends JLabel {

    public Zahl(int i) {
        this.setBackground(Color.BLACK);
        this.setSize(180, 302);
        Image image = new ImageIcon("./bilder/" + i + ".png").getImage().getScaledInstance(72, 120, Image.SCALE_SMOOTH);
        this.setIcon(new ImageIcon(image));
        repaint();

    }

    public void setIcon(int i) {
        Image image = new ImageIcon("./bilder/" + i + ".png").getImage().getScaledInstance(72, 120, Image.SCALE_SMOOTH);
        this.setIcon(new ImageIcon(image));
        repaint();
    }

}
