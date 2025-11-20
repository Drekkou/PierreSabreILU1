package histoire;

import personnages.Commercant;
import personnages.Ronin;

public class HistoireTP4 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 15);
		Ronin roro = new Ronin("Roro", "Shochu", 60);

		roro.direBonjour();
		roro.donner(marco);
	}
}
