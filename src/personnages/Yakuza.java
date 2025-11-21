package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;

	public Yakuza(String nom, String boissonFav, int argent, String clan) {
		super(nom, boissonFav, argent);
		this.clan = clan;
		this.reputation = 0;
	}

	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}

	protected void gagnerReputation() {
		this.reputation += 1;
	}

	protected void perdreReputation() {
		this.reputation -= 1;
	}

	public void extorquer(Commercant victime) {
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		this.parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int magot = victime.seFaireExtorquer();
		this.gagnerArgent(magot);
		this.gagnerReputation();

		this.parler("J'ai piqué les " + magot + " sous de " + victime.getNom() + " ce qui me fait " + this.getArgent()
				+ " sous dans ma poche. Hi Hi!");
	}

	public void perdre() {
		this.perdreReputation();
		this.parler("J'ai perdu mon duel et mes " + this.getArgent() + " sous, snif.... J'ai déshonoré le clan "
				+ this.clan + ".");
		this.perdreArgent(getArgent());
	}

	public void gagner(int gain) {
		this.gagnerReputation();
		this.parler("Ce ronin pensait vraiment battre " + this.getNom() + " du clan de " + this.clan
				+ " ? Je l'ai dépouillé de ses " + this.getArgent() + " sous.");
		this.gagnerArgent(gain);
	}
}
