
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Zahl extends JLabel {

    public Zahl(int i) {
        this.setSize(180, 302);

        Image image = new ImageIcon("./bilder/" + i + ".png").getImage().getScaledInstance(180, 302, Image.SCALE_SMOOTH);

        this.setIcon(new ImageIcon(image));

        repaint();
    }

}