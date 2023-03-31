package produit;
import personnages.Gaulois;

public class Sanglier extends Produit {

	private Gaulois chasseur;
	private int poids;
	
	
	
	public Sanglier(Gaulois chasseur, int poids) {
		super("sanglier", unite.KILOGRAMME);
		this.chasseur = chasseur;
		this.poids = poids;
	}





	public Gaulois getChasseur() {
		return chasseur;
	}



	public int getPoids() {
		return poids;
	}





	@Override
	public String description() {
		
		return "Sanglier de " +getPoids()+" "+" kg chass� par "+ chasseur;
	}





	@Override
	public double calculerPrix(int prix) {
		int prixKg=prix*(getPoids()/1000);
		return prixKg;
	}
	
}
