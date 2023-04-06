package scenarioTest;

import personnages.Gaulois;
import produit.Poisson;
import produit.Produit;
import produit.Sanglier;
import villagegaulois.DepenseMarchand;
import villagegaulois.Etal;
import villagegaulois.IEtal;
import villagegaulois.IVillage;
public class Scenario {

	public static void main(String[] args) {

		IVillage village= new IVillage(){
			
			IEtal[] marche= new IEtal[3];
			int nbEtales=0;
			
			
			@Override
			public <P extends Produit> boolean installerVendeur(Etal<P> etal,Gaulois vendeur, P[] produit, int nbProduit) {
				etal.installerVendeur(vendeur, produit, nbProduit);
				
				if(nbEtales<marche.length) {
					marche[nbEtales]=etal;
					nbEtales++;
					return true;
				}else {
					System.out.println("Il n'y a pas assez de places dans le Village!");
					return false;
				}
			}
		
			@Override

			public DepenseMarchand[] acheterProduit(String produit, int quantiteSouhaitee){
				DepenseMarchand[] depenses = new DepenseMarchand[marche.length];
				int i = 0;
				int nbAvendre = 0;
				for (IEtal e : marche) {
					nbAvendre = e.contientProduit(produit, quantiteSouhaitee);
					if (nbAvendre > 0) {
						double prixPaye = e.acheterProduit(nbAvendre);
						depenses[i] = new DepenseMarchand(e.getVendeur(),nbAvendre , produit, prixPaye);
						i++;
						quantiteSouhaitee -= nbAvendre;
					}
				}
				return depenses;
			}
			
			
			public String toString() {
				String stringVillage = ""; 
				for (IEtal e : marche) {
					stringVillage += e.etatEtal();
					stringVillage += "\n";
				}
				return stringVillage;
			}
			
		};
		
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix", 9);
		Gaulois obelix = new Gaulois("Obélix", 20);
		Gaulois asterix = new Gaulois("Astérix", 6);

		Etal<Sanglier> etalSanglierObelix = new Etal<>();
		Etal<Sanglier> etalSanglierAsterix = new Etal<>();
		Etal<Poisson> etalPoisson = new Etal<>();

		Sanglier sanglier1 = new Sanglier(obelix, 2000);
		Sanglier sanglier2 = new Sanglier(obelix, 1500);
		Sanglier sanglier3 = new Sanglier(asterix, 1000);
		Sanglier sanglier4 = new Sanglier(asterix, 500);

		Sanglier[] sangliersObelix = { sanglier1, sanglier2 };
		Sanglier[] sangliersAsterix = { sanglier3, sanglier4 };

		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = { poisson1 };

		village.installerVendeur(etalSanglierAsterix, asterix, sangliersAsterix, 10);
		village.installerVendeur(etalSanglierObelix, obelix, sangliersObelix, 8);
		village.installerVendeur(etalPoisson, ordralfabetix, poissons, 5);

		System.out.println(village);

		DepenseMarchand[] depense = village.acheterProduit("sanglier", 3);

		for (int i = 0; i < depense.length && depense[i] != null; i++) {
			System.out.println(depense[i]);
		}

		System.out.println(village);

	}

}
