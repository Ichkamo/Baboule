package baboule;

import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

/**
 * Cette classe est un r�cepteur de souris et de clavier. Elle calcule les
 * d�placements de la balle et des raquettes et change leurs coordonn�es.
 */
public class Principale implements Runnable, MouseMotionListener, KeyListener,
		ConstantesDuJeu {

	private Table table; // R�f�rence � la table.

	public Principale(Table tableVerte) {
		table = tableVerte;
		Thread travailleur = new Thread(this);
		travailleur.start();
	}

	// M�thodes requises par l'interface MouseMotionListener
	// (certaines sont vides, mais doivent �tre incluses dans
	// la classe de toute fa�on).

	public void mouseDragged(MouseEvent �v�nement) {
	}

	public void mouseMoved(MouseEvent evenement) {
		if (table.perdu == false) {
			if (evenement.getX() < 480) {
				table.joueurX = evenement.getX();
			}
			if (evenement.getY() < 480) {
				table.joueurY = evenement.getY();
			}
		}

		// table.repaint();

	}

	// M�thodes requises par l'interface KeyListener.
	public void keyPressed(KeyEvent evenement) {

	}

	public void keyReleased(KeyEvent evenement) {
		if (table.perdu == true && evenement.getKeyCode() == KeyEvent.VK_ENTER) {
			table.restart();

		}
	}

	public void keyTyped(KeyEvent �v�nement) {
	}

	// Termine le jeu.
	public void terminerJeu() {
		System.exit(0);
	}

	// La m�thode run() est requise par l'interface Runnable.

	public void run() {

		int i = 0;
		int a = 0;
		int b = 0;
		while (true) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}

			i = i + 1;
			a = a + 1;
			b = b + 1; 

			if (b == 1000) {
				table.creerBonus();
				b = 0;
			}

			int nbr = 20 - table.nivo;
			if (nbr < 5) {
				nbr = 5;
			}
			if (i == nbr) {
				if (table.perdu == false) {
					table.creerMechant();

				}
				i = 0;
			}

			table.repaint();

		}
	}

}