package produit;

public class Poisson extends Produit{
	private date date;
	
	private unite unite;
	
	
	public Poisson(produit.date date, produit.unite unite) {
		super();
		this.date = date;
		this.unite = unite.PIECE;
	}


	@Override
	public String description(Produit produit) {
		String jour="";
		
		switch(date) {
		case LUNDI:
			jour="lundi";
		case MARDI:
			jour="mardi";
		case MERCREDI:
			jour="mercredi";
		case JEUDI:
			jour="jeudi";
		case VENDREDI:
			jour="vendredi";
		case SAMEDI:
			jour="samedi";
		case DIMANCHE:
			jour="dimanche";
		}
		
		
		return "poisson pêchés"+ jour+"." ;
	}
	
}
