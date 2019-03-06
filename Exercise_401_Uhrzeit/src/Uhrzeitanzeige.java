
import java.awt.GridLayout;
import java.time.LocalTime;
import javax.swing.JLabel;

public class Uhrzeitanzeige extends javax.swing.JFrame {

    UhrPanel up1,up2,up3;

    public Uhrzeitanzeige() {
        initComponents();
        this.setLayout(new GridLayout(1, 3));
        up1 = new UhrPanel(LocalTime.now());
        Thread t1 = new Thread(up1);
        panel.add(up1);
        t1.start();
     
         up2 = new UhrPanel(LocalTime.now());
        Thread t2 = new Thread(up2);
        panel.add(up2);
        t2.start();
        
         up3 = new UhrPanel(LocalTime.now());
        Thread t3 = new Thread(up3);
        panel.add(up3);
        t3.start();
        
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setMinimumSize(new java.awt.Dimension(400, 300));
        panel.setLayout(new java.awt.GridLayout(3, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Uhrzeitanzeige().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
