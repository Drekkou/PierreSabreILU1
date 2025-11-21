package personnages;

public class Ronin extends Humain {
	private int honneur;

	public Ronin(String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
		this.honneur = 1;
	}

	protected void perdreHonneur() {
		this.honneur -= 1;
	}

	protected void gagnerHonneur() {
		this.honneur += 1;
	}

	public void donner(Commercant beneficiaire) {
		int donnation = this.getArgent() / 10;
		this.perdreArgent(donnation);

		this.parler(beneficiaire.getNom() + " prend ces " + donnation + " sous.");
		beneficiaire.recevoirArgent(donnation);
	}

	public void provoquer(Yakuza advsersaire) {
		int force = 2 * this.honneur;
		this.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (force >= advsersaire.getReputation()) {
			this.parler("Je t’ai eu petit yakusa!");
			advsersaire.perdre();
		} else {
			this.parler(" J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			this.perdreHonneur();
			advsersaire.gagner(this.getArgent());
			this.perdreArgent(getArgent());
		}
	}
}
