package scenarioTest;
import personnages.Gaulois;
import produit.*;
import villagegaulois.Etal;
import villagegaulois.IEtal;

public class ScenarioTest {
	public static void main(String[] args) {
		IEtal<Produit>[] marche =new IEtal[3];
		IEtal<Sanglier> etalSanglier=new Etal<>();
		IEtal<Poisson> etalPoisson=new Etal<>();
		Gaulois bonemine= new Gaulois("Bonemine",2);
		occuperEtal(bonemine,Sanglier, 10);
		
		marche[0]=etalSanglier;
		marche[1]=etalPoisson;
	}
	
}
