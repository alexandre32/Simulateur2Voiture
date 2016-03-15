package AppliSimu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import DomaineVoiture.Voiture;

public class IHMVoiture extends JFrame implements Observer{

	private double paramatreConversionMetresPixels = 0.5;
	private Voiture maVoiture;
	private CommandeVoiture maCommandeVoiture;
    Route r;
	
	private void initGraphique() {
		this.setTitle("Simulateur de Voiture");
		this.setSize(505, 505);



		this.maCommandeVoiture = new CommandeVoiture(this, maVoiture);
 //       r = new Route();
 //   this.add(r);

        maCommandeVoiture.validate();

		this.setVisible(true);
	}
	
	public IHMVoiture(Voiture maVoiture) {
		super();
		this.maVoiture = maVoiture;
		maVoiture.addObserver(this);
        Route r = new Route();
        r.setLocation(40, 40);
		initGraphique();

	}

	public IHMVoiture() {
		super();
		initGraphique();
		this.maVoiture = null;
	}
	
	public int calculerPositionPixels(int xMetres) {
		return (int) (paramatreConversionMetresPixels * xMetres);	
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		this.repaint();
	}

	@Override
	public void paint(Graphics contexteGraphique) {
		super.paint(contexteGraphique);
		contexteGraphique.setColor(Color.red);
		dessinerVoiture(contexteGraphique);
	}


	private void dessinerVoiture(Graphics contexteGraphique) {
		int xMetres = maVoiture.getX();
		int xPixel = calculerPositionPixels(xMetres);

        contexteGraphique.setColor(Color.black);
        contexteGraphique.fillRect(10, 295, 600, 30);
        contexteGraphique.setColor(Color.red);
        contexteGraphique.fillRect(xPixel, 300, 30, 15);

//        contexteGraphique.drawLine(20, 295, 600, 295);
//        contexteGraphique.drawLine(20, 320, 600, 320);

	}



}
