package histoire;

import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "Kombucha", 54);

		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 42);
		prof.acheter("un kimono", 50);

		Commercant Marco = new Commercant("Marco", 10);

		Marco.direBonjour();
		Marco.seFaireExtorquer();
		Marco.recevoirArgent(15);
		Marco.boire();
	}
}
