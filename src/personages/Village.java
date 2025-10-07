package personages;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;
	private int NB_VILLAGEOIS_MAX;
	private Gaulois[] villageois;

	public Village(String nom, Gaulois chef, int NB_VILLAGEOIS_MAX) {
		super();
		this.nom = nom;
		this.chef = chef;
		chef.setVillage(this);
		this.villageois = new Gaulois[NB_VILLAGEOIS_MAX];
	}

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
		gaulois.setVillage(this);
	}
	
	public Gaulois trouverVillageois(int numVillageois) {
		if (villageois[numVillageois - 1] == null) {
			System.out.println("Il n'y a pas autant d'habitants dans notre village!");
			return null;
		} else {
			return villageois[numVillageois - 1];
		}
	}
	
	public void afficherVillage() {
		System.out.println("Dans le village " + "\"" + nom + "\" " + "du chef " + chef + " vivent les légendaires gaulois: ");
		for (Gaulois gaulois : villageois) {
			if (gaulois != null) {
				System.out.println("- " + gaulois);
			}
		}
	}
	
	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);
		Village village = new Village("Village des Irréductibles", abraracourcix, 30);
		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterVillageois(asterix);
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		village.afficherVillage();
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterVillageois(obelix);
		village.afficherVillage();
		Gaulois doublepolemix = new Gaulois("DoublePolémix", 4);
		asterix.sePresenter();
		abraracourcix.sePresenter();
		doublepolemix.sePresenter();
	}

}
