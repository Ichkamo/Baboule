package baboule;

public interface ConstantesDuJeu {
	  // Taille de la table de ping-pong
	  public final int LARGEUR_TABLE = 500; 
	  public final int HAUTEUR_TABLE = 500;
//	  public final int HAUT_TABLE = 12;
//	  public final int BAS_TABLE = 180;

	  // Incrément du mouvement de la balle en pixels 
	  public final int INCREMENT_BALLE = 4;
		
	  // Coordonnées maximum et minimum permises pour la balle  
	  public final int BALLE_X_MIN = 1 + INCREMENT_BALLE;
	  public final int BALLE_Y_MIN = 1 + INCREMENT_BALLE;
	  public final int BALLE_X_MAX = 
	                          LARGEUR_TABLE - INCREMENT_BALLE;
	  public final int BALLE_Y_MAX = 
	                          HAUTEUR_TABLE - INCREMENT_BALLE;
		
		}
