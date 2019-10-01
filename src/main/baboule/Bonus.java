package baboule;

import java.util.Random;

public class Bonus {
	int vitesse = 1;
	int Y = 1;
	int X = 1;
	int direction = 0;

	public void deplacement() {
		if (direction == 0) {
			Y = Y - vitesse;
		} else if (direction == 90) {
			X = X + vitesse;
		} else if (direction == 180) {
			Y = Y + vitesse;
		} else if (direction == 270) {
			X = X - vitesse;
		}
	}

	Bonus(Table table) {
		Random rand = new Random();
		direction = rand.nextInt(360);
		vitesse = rand.nextInt(7);
		if (vitesse < 3) {
			vitesse = 5;
		}

		if (direction < 90 && direction >= 0) {
			direction = 90;
			Y = rand.nextInt(480);
			X = 0;
		} else if (direction < 180 && direction >= 90) {
			direction = 270;
			Y = rand.nextInt(480);
			X = 480;
		} else if (direction < 270 && direction >= 180) {
			direction = 180;
			X = rand.nextInt(480);
			Y = 0;
		} else if (direction < 360 && direction >= 270) {
			direction = 0;
			X = rand.nextInt(480);
			Y = 480;
		}

	}
}