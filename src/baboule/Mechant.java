package baboule;

import java.util.Random;

public class Mechant {
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
		} else if (direction == 360) {// diagonal
			X = X + vitesse;
			Y = Y + vitesse;
		} else if (direction == 450) {
			X = X + vitesse;
			Y = Y - vitesse;
		} else if (direction == 540) {
			X = X - vitesse;
			Y = Y + vitesse;
		} else if (direction == 630) {
			X = X - vitesse;
			Y = Y - vitesse;
		}
	}

	Mechant(Table table) {
		Random rand = new Random();
		int nivo = table.score / 25;
		vitesse = rand.nextInt(nivo + 2);
		if (vitesse < 1) {
			vitesse = nivo + 1;
		}

		if (nivo == 0) {
			direction = rand.nextInt(90);
		} else if (nivo == 1) {
			direction = rand.nextInt(180);
		} else if (nivo == 3) {
			direction = rand.nextInt(270);
		} else if (nivo == 4) {
			direction = rand.nextInt(360);
		} else if (nivo == 5) {
			direction = rand.nextInt(450);// diagonal
		} else if (nivo == 6) {
			direction = rand.nextInt(540);
		} else if (nivo == 7) {
			direction = rand.nextInt(630);
		} else if (nivo > 7) {
			direction = rand.nextInt(720);
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
		} else if (direction < 450 && direction >= 360) {// diagonal
			direction = 360;
			Y = 0;
			X = rand.nextInt(480);
		} else if (direction < 540 && direction >= 450) {
			direction = 540;
			Y = rand.nextInt(480);
			X = 480;

		} else if (direction < 630 && direction >= 540) {
			direction = 630;
			Y = 480;
			X = rand.nextInt(480);
		} else if (direction < 720 && direction >= 630) {
			direction = 450;
			Y = rand.nextInt(480);
			X = 0;
		}

	}

}
