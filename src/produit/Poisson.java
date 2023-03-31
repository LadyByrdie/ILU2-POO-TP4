package produit;

public class Poisson extends Produit{
	private date date;
	private int nb;
	
	
	public Poisson(String date) {
		super("poisson",unite.PIECE);
		this.nb= nb;
		
		switch(date) {
			case "lundi":
				this.date=produit.date.LUNDI;
				break;
			case "mardi":
				this.date=produit.date.MARDI;
				break;
			case "mercredi":
				this.date=produit.date.MERCREDI;
				break;
			case "jeudi":
				this.date=produit.date.JEUDI;
				break;
			case "vendredi":
				this.date=produit.date.VENDREDI;
				break;
			case "samedi":
				this.date=produit.date.SAMEDI;
				break;
			case "dimanche":
				this.date=produit.date.DIMANCHE;
				break;
			
		}
	}


	public String description(){
		String jour=date.toString();
		return "poisson p�ch�s"+ jour+"." ;
	}


	@Override
	public double calculerPrix(int prix) {
		return prix;
	}
	
}
