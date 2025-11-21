package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 15);
		Ronin roro = new Ronin("Roro", "Shochu", 60);
		Yakuza yaku = new Yakuza("Yaku le Noir", "whisky", 45, "Warsong");

		roro.provoquer(yaku);

	}
}
