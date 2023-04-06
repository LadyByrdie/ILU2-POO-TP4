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
		
		return "Sanglier de " +getPoids()+" "+" kg chass� par "+ chasseur.getNom();
	}





	@Override
	public double calculerPrix(int prix) {
		double prixKg=(prix*poids)/1000;
		return prixKg;
	}
	
}
