package villagegaulois;

import personnages.Gaulois;
import produit.Produit;

public interface IVillage {

	/**
	 * 
	 * @param vendeur   : un gaulois habitant le village
	 * @param produit   : nom du produit à vendre
	 * @param nbProduit : nombre de produit à vendre
	 * @return le numéro de l'étal où c'est installé le vendeur ou -1 s'il n'en
	 *         a pas trouvé
	 */
	public <P extends Produit> boolean installerVendeur(Etal<P> etal,Gaulois vendeur, P[] produit, int nbProduit);
	
	public DepenseMarchand[] acheterProduit(String produit, int quantiteSouhaitee);
}