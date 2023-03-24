package produit;

public abstract class Produit {

	private String nom;
	private unite unite;
	
	public String getNom() {
		return nom;
	}
	
	
	public abstract String description(Produit produit);
	
	
}
