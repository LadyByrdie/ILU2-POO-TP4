package villagegauloisold;

import personnages.Gaulois;
import produit.IProduit;
import villagegaulois.DepenseMarchand;
import villagegaulois.IEtal;

public class Etal <T extends IProduit> implements IEtal {
	private Gaulois vendeur;
	private IProduit produit;
	private int quantiteDebutMarche;
	private int quantite;
	private boolean etalOccupe = false;

	
	public boolean isEtalOccupe() {
		return etalOccupe;
	}


	public Gaulois getVendeur() {
		return vendeur;
	}


	public int getQuantite() {
		return quantite;
	}


	public IProduit getProduit() {
		return produit;
	}

	

	public void occuperEtal(Gaulois vendeur, IProduit produit, int quantite) {
		this.vendeur = vendeur;
		this.produit = (T)produit;
		this.quantite = quantite;
		quantiteDebutMarche = quantite;
		etalOccupe = true;
	}

	public boolean contientProduit(IProduit produit) {
		return this.produit.equals(produit);
	}


	public int acheterProduit(int quantiteAcheter) {
		if (quantite == 0) {
			quantiteAcheter = 0;
		}
		if (quantiteAcheter > quantite) {
			quantiteAcheter = quantite;
		}
		if (etalOccupe) {
			quantite -= quantiteAcheter;
		}
		return quantiteAcheter;
	}

	
	public void libererEtal() {
		etalOccupe = false;
	}

	/**
	 * 
	 * @param produit
	 * @return donneesVente est un tableau de chaine contenant [0] : un boolean
	 *         indiquant si l'étal est occupé [1] : nom du vendeur [2] : produit
	 *         vendu [2] : quantité de produit à vendre au début du marché [4] :
	 *         quantité de produit vendu
	 */
	
	public String[] etatEtal() {
		String[] donneesVente = new String[5];
		donneesVente[0] = String.valueOf(etalOccupe);
		if (etalOccupe) {
			donneesVente[1] = vendeur.getNom();
			donneesVente[2] = produit.getNom();
			donneesVente[3] = String.valueOf(quantiteDebutMarche);
			donneesVente[4] = String.valueOf(quantiteDebutMarche - quantite);
		}
		return donneesVente;
	}

}

public DepenseMarchand[] acheterProduit(String produit, int quantiteSouhaitee) {
	int quantiteAchete=0;
	DepenseMarchand[] depenseMar= new DepenseMarchand[3];
	int nbDepense=0;
	
	for(IEtal e :marche) {	
		
		if(e.contientProduit(produit, quantiteAchete)>0){
			quantiteAchete= e.contientProduit(produit, quantiteSouhaitee);
			double prix=e.acheterProduit(e.contientProduit("sanglier",quantiteSouhaitee));
			
			quantiteSouhaitee-=quantiteAchete;
			
			DepenseMarchand depense=new DepenseMarchand(e.getVendeur(),quantiteAchete,produit,prix);
			depenseMar[nbDepense]=depense;
			nbDepense++;
		}
	}
return depenseMar;
}



