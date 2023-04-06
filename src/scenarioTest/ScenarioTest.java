package scenarioTest;

import villagegaulois.Etal;
import villagegaulois.IEtal;
import personnages.Gaulois;
import produit.*;

public class ScenarioTest {
	public static void main(String[] args) {
		
		int nbSanglierAch=0;
		int nbSanglierManquant=3;
		
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
		
		
		Etal<Poisson> etal = new Etal<>();
		Etal<Sanglier> etal1 = new Etal<>();
		Etal<Sanglier> etal2 = new Etal<>();
	
		
		etal.installerVendeur(ordralfabetix, poissons, 7);
		etal1.installerVendeur(asterix, sangliersAsterix, 10);
		etal2.installerVendeur(obelix, sangliersObelix, 8);
		IEtal[] marche = {etal, etal1, etal2};
		
		
		
		
		
		int i=0;
		System.out.println("ETAT MARCHE");
		for(int j=0;j<marche.length;j++) {
			System.out.println(marche[j].etatEtal());
		}
		
		while(nbSanglierAch!=3&&i<marche.length) {	
			if(marche[i].contientProduit("sanglier", nbSanglierManquant)>0){
				nbSanglierAch= marche[i].contientProduit("sanglier", nbSanglierManquant);
				System.out.println("A l'étal "+i+ " je paye "+marche[i].acheterProduit(marche[i].contientProduit("sanglier",nbSanglierManquant)) );
				nbSanglierManquant-=nbSanglierAch;
			}
			i++;
		}
		
		System.out.println("Je voulais 3 sangliers, j'en ai acheté " + nbSanglierAch);
		System.out.println(" ");
		System.out.println("ETAT MARCHE");
		
		for(int j=0;j<marche.length;j++){
			System.out.println(marche[j].etatEtal());
		}
	}
	
}
