package AppliSimu;

import javax.swing.*;
import java.awt.*;

/**
 * Created by 21102934 on 15/03/2016.
 */
public class Route extends JPanel {



    public Route()
    {
       // this.setLocation(40, 40);
        this.setVisible(true);
        this.setSize(300, 5);

    }



    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.black);
        dessin(g);
    }


    private void dessin(Graphics g) {

        g.drawLine(20, 260, 600, 260);
        g.drawLine(20, 290, 600, 290);
    }



}
