package test_fonctionnel;

import personages.Druide;
import personages.Gaulois;
import personages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 16);
		Romain minus = new Romain("Minus", 6);

		asterix.parler("Bonjour Obélix");
		obelix.parler("Bonjour Astérix. Ça te dirait d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée");
		System.out.println("Dans la forêt " + asterix.getNom() + " et " + obelix.getNom()
				+ " tombent nez à nez sur le romain " + minus.getNom() + ".");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		
		Romain brutus = new Romain("Brutus", 14);
		Druide panoramix = new Druide("Panoramix", 2);
		
		panoramix.fabriquerPotion(4, 3);
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		for (int i = 0; i < 3; i++) {
			asterix.frapper(brutus);
		}
	}
}
