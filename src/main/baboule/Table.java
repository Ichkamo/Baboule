package baboule;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 * Cette classe dessine la table de ping-pong, la balle et les raquettes et
 * affiche le score
 */
public class Table extends JPanel implements ConstantesDuJeu {
	private JLabel label;

	public int joueurX = 0;
	public int joueurY = 0;
	public boolean perdu = false;
	public int score = 0;
	public int sc0re = 0;
	public int nivo = 0;
	public int highscore = 0;
	public String kelbonus = " nope ...";
	private int nulbonul = 0;
	public int level = 0;

	ArrayList<Mechant> mechants = new ArrayList<Mechant>();

	ArrayList<Bonus> bonuss = new ArrayList<Bonus>();

	// Constructeur. key listener
	Table() {

		Principale moteurJeu = new Principale(this);
		// mouse motion
		addMouseMotionListener(moteurJeu);
		// key
		addKeyListener(moteurJeu);

		repaint();
	}

	public void restart() {
		if (highscore < sc0re) {
			highscore = sc0re;
		}
		label.setText("High score : " + highscore);
		score = 0;
		sc0re = 0;
		nulbonul = 0;
		kelbonus = " nope ...";
		perdu = false;
		bonuss.clear();
	}

	public void paintComponent(Graphics contexteGraphique) {

		super.paintComponent(contexteGraphique);
		// Dessine la table verte
		if (perdu == false) {
			if (nivo == 0) {
				contexteGraphique.setColor(Color.GREEN);
				level = 1;
			} else if (nivo == 1) {
				contexteGraphique.setColor(Color.CYAN);
				level = 2;
			} else if (nivo == 2) {
				contexteGraphique.setColor(Color.ORANGE);
				level = 3;
			} else if (nivo == 3) {
				contexteGraphique.setColor(Color.LIGHT_GRAY);
				level = 4;
			} else if (nivo == 4) {
				contexteGraphique.setColor(Color.GRAY);
				level = 5;
			} else if (nivo == 5) {
				contexteGraphique.setColor(Color.DARK_GRAY);
				level = 6;
			} else if (nivo > 5) {
				contexteGraphique.setColor(Color.BLACK);
				level = 7;
			}
		} else {
			contexteGraphique.setColor(Color.WHITE);
		}
		contexteGraphique.fillRect(0, 0, LARGEUR_TABLE, HAUTEUR_TABLE);

		contexteGraphique.setColor(Color.YELLOW);
		contexteGraphique.fillOval(joueurX, joueurY, 20, 20);

		boolean isLost = false;
		for (Mechant mechant : mechants) {
			contexteGraphique.setColor(Color.RED);
			contexteGraphique.fillOval(mechant.X, mechant.Y, 20, 20);
			if (mechant.X > joueurX - 15 && mechant.X < joueurX + 20
					&& mechant.Y > joueurY - 15 && mechant.Y < joueurY + 20) {
				isLost = true;

			}
			mechant.deplacement();
		}

		boolean isBonus = false;
		for (Bonus bonus : bonuss) {
			contexteGraphique.setColor(Color.BLUE);
			contexteGraphique.fillOval(bonus.X, bonus.Y, 20, 20);
			if (bonus.X > joueurX - 15 && bonus.X < joueurX + 20
					&& bonus.Y > joueurY - 15 && bonus.Y < joueurY + 20) {
				isBonus = true;

			}
			bonus.deplacement();
		}

		if (isLost) {
			perdu();
		}

		if (isBonus) {
			bonus();
		}

		requestFocus();
	}

	private void perdu() {
		perdu = true;
		nulbonul = 0;
		label.setText("High score : " + highscore + "          Score : "
				+ sc0re + "                      press enter to restart");
		mechants.clear();
		bonuss.clear();
		// System.out.println("perdu, score: " + score);
		// System.exit(0);

	}

	private void bonus() {
		int bon = 0;
		Random rando = new Random();
		bon = rando.nextInt(7);
		if (bon == 0 || bon == 1 || bon == 2) {
			kelbonus = " Cleared!! ";
			mechants.clear();
		} else if (bon == 3 || bon == 4) {
			kelbonus = " + 100  !!";
			sc0re = sc0re + 100;
		} else if (bon == 5) {
			kelbonus = " + 200  !!";
			sc0re = sc0re + 200;
		} else if (bon == 6) {
			kelbonus = " +1 each ! !";
			nulbonul++;
		} else if (bon == 7) {
			kelbonus = " bonus x 2 ! !";
			nulbonul = (nulbonul + 1) * 2;
		}

		label.setText("High score : " + highscore + "          Score : "
				+ sc0re + "         Bonus  ->  " + kelbonus
				+ "           level : " + level);
		bonuss.clear();

	}

	public void creerMechant() {
		mechants.add(new Mechant(this));
		score++;
		label.setText("High score : " + highscore + "          Score : "
				+ sc0re + "              level : " + level
				+ "              Bonus : " + kelbonus);
		nivo = score / 25;
		sc0re = sc0re + nivo + 1 + nulbonul;

	}

	public void creerBonus() {
		bonuss.add(new Bonus(this));

	}

	// Affecte le texte du message du jeu
	public void affecterTexteMessage(String texte) {
		label.setText(texte);
		repaint();
	}

	void ajouteAuCadre(Container conteneur) {
		conteneur.setLayout(new BoxLayout(conteneur, BoxLayout.Y_AXIS));
		conteneur.add(this);
		label = new JLabel("");
		label.setText("High score : " + highscore);
		label.setForeground(Color.BLUE);
		conteneur.add(label);
		conteneur.setBackground(Color.YELLOW);

	}

	public static void main(String[] args) {

		try {
			// Crée une instance du cadre
			JFrame monCadre = new JFrame("Baboule");

			// Permet la fermeture de la fenêtre par clic sur la
			// petite croix dans le coin.
			monCadre.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			Table table = new Table();
			table.ajouteAuCadre(monCadre.getContentPane());
			// Affecte sa taille au cadre et le rend visible.
			monCadre.setBounds(0, 0, LARGEUR_TABLE + 0, HAUTEUR_TABLE + 33);
			monCadre.setVisible(true);
			monCadre.setResizable(false);
		} catch (Exception e) {

		}
	}
}