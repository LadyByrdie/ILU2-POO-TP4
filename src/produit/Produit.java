package produit;

public abstract class Produit implements IProduit {

	private String nom;
	private unite unite;
	
	public String getNom() {
		return nom;
	}


	public Produit(String nom, produit.unite unite) {
		super();
		this.nom = nom;
		this.unite = unite;
	}
	
	
	
}
