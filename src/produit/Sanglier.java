package produit;
import personnages.Gaulois;

public class Sanglier extends Produit {

	private unite unite;
	private Gaulois chasseur;
	private int poids;
	
	
	
	public Sanglier(produit.unite unite, Gaulois chasseur, int poids) {
		super();
		this.unite = unite.KILOGRAMME;
		this.chasseur = chasseur;
		this.poids = poids;
	}





	public Gaulois getChasseur() {
		return chasseur;
	}
	



	public unite getUnite() {
		return unite;
	}



	public int getPoids() {
		return poids;
	}





	@Override
	public String description(Produit produit) {
		
		return "Sanglier de " +produit+" "+" kg chassé par "+ chasseur;
	}
	
}
