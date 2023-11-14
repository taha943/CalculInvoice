package calcul.consommation;

import energie.Energie;
import energie.EnergyPrices;

public class CalculConsommationClientParticulier implements CalculConsommation {

	@Override
	public double getPrixConsommationGaz( Energie energie, double consommationGaz) {
	    double prixKwh = 0;

			  if (energie==Energie.GAZ) {
				  prixKwh= EnergyPrices.GAZ_PARTICULIER;
			  }
			
			  return prixKwh * consommationGaz;
	}

	@Override
	public double getPrixConsommationElectricite( Energie energie, double consommationElectricite) {
		   double prixKwh = 0;
		  if (energie==Energie.ELECTRICITE) {
			  prixKwh= EnergyPrices.ELECTRICITE_PARTICULIER;
		  }
		
		  return prixKwh * consommationElectricite;
	}

}

