package personages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le Romain " + nom + ": ";
	}

	public void recevoirCoup(int forceCoup) {
		assert forceCoup > 0;
		int forceAvant = force;
		force = force - forceCoup;
		if (force < 1) {
			force = 0;
			parler("J'abandonne !");
		} else {
			parler("Aïe");
		}
		assert forceAvant > force;
	}

	private boolean isInvariantVerified() {
		return force >= 0 ? true : false;
	}

	public static void main(String[] args) {
		Romain minus = new Romain("minus", 6);
		assert minus.isInvariantVerified();
	}
}
