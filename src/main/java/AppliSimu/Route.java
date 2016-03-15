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

    }



    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.black);
        dessin(g);
    }


    private void dessin(Graphics g) {

        g.fillRect(50, 300, 300, 15);
    }



}
