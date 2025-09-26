package personages;

import objets.Chaudron;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron = new Chaudron();

	public Druide(String nom, int force) {
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
		return "Le Druide " + nom + " : ";
	}

	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		parler("J'ai concocté " + quantite + " does de potion magique. Elle a une force de " + forcePotion + ".");
	}

	public void booster(Gaulois gaulois) {
		if (chaudron.resterPotion()) {
			if (gaulois.getNom() == "Obélix") {
				parler("Non, " + gaulois.getNom() + " Non!... Et tu le sais très bien!");
			} else {
				gaulois.boirePotion(chaudron.prendreLouche());
				parler("Tiens " + gaulois.getNom() + " un peu de potion magique.");
			}
		} else {
			parler("Désolé " + gaulois.getNom() + " il n'y a plus une seule goutte de potion.");
		}
	}
}
