package personnages;

public class Ronin extends Humain {
	private int honneur;

	public Ronin(String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
		this.honneur = 1;
	}

	public void donner(Commercant beneficiaire) {
		int donnation = this.getArgent() / 10;
		this.perdreArgent(donnation);

		this.parler(beneficiaire.getNom() + " prend ces " + donnation + " sous.");
		beneficiaire.recevoirArgent(donnation);
	}
}
