package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	private int argent;

	public Humain(String nom, String boissonFav, int argent) {
		super();
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getBoissonFav() {
		return boissonFav;
	}

	public void setBoissonFav(String boissonFav) {
		this.boissonFav = boissonFav;
	}

	public int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}

	private String prendreParole() {
		return "(" + nom + ")" + " - ";
	}

	protected void parler(String texte) {
		System.out.println(prendreParole() + texte);
	}

	public void direBonjour() {
		parler("Bonjour! Je m'appelle " + this.nom + " et j'aime boire du " + this.boissonFav + ".");
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + this.boissonFav + "! GlOUPS !");
	}

	private void gagnerArgent(int gain) {
		this.argent += gain;
	}

	private void perdreArgent(int perte) {
		this.argent -= perte;
	}

	public void acheter(String bien, int prix) {
		if (this.argent >= prix) {
			parler("J'ai " + this.argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix
					+ " sous.");
			this.perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + this.argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à "
					+ prix + " sous.");
		}
	}
}
