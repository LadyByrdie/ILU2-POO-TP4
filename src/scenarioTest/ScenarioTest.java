package scenarioTest;

import villagegaulois.Etal;
import villagegaulois.IEtal;
import personnages.Gaulois;
import produit.*;

public class ScenarioTest {
	public static void main(String[] args) {
		Etal[] marche= new Etal[3];
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix",9);
		Gaulois obelix = new Gaulois("Obélix",20);
		Gaulois asterix = new Gaulois("Asterix", 6);
		
		Sanglier sanglier1 = new Sanglier(obelix, 2000);
		Sanglier sanglier2 = new Sanglier(obelix, 1500);
		Sanglier sanglier3 = new Sanglier(asterix, 1000);
		Sanglier sanglier4 = new Sanglier(asterix, 500);
		Sanglier[] sangliersObelix = {sanglier1, sanglier2};
		Sanglier[] sangliersAsterix = {sanglier3, sanglier4};
		
		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = {poisson1};
		
		marche[0].installerVendeur(sanglier1.getChasseur(),sangliersAsterix,8);
		marche[1].installerVendeur(obelix, sangliersObelix, 10);
		marche[2].installerVendeur(ordralfabetix, poissons, 7);
	}
	
}
