package calcul.consommation;

import energie.Energie;

public interface CalculConsommation {

	
	  public  double getPrixConsommationGaz( Energie energie , double consommationGaz);
	    
	  public double getPrixConsommationElectricite( Energie energie , double consommationElectricite);
}
