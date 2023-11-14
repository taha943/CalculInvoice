package calcul.consommation;

import client.ClientPro;
import energie.Energie;
import energie.EnergyPrices;

public class CalculConsommationClientPro implements CalculConsommation {
	

	private ClientPro clientPro;
	public  CalculConsommationClientPro ( ClientPro  clientPro) {
		
		this.clientPro = clientPro;
	}
	
	@Override
	public double getPrixConsommationGaz( Energie energie, double consommationGaz) {
        double prixKwh = 0;
    	if (energie==Energie.GAZ) {
    		if (this.clientPro.getCa()>1000000)
    			prixKwh= EnergyPrices.GAZ_PRO_HIGH_CA;
    		else 
    			prixKwh= EnergyPrices.GAZ_PRO_LOW_CA;
    		  }
    		  return prixKwh * consommationGaz;
	}

	@Override
	public double getPrixConsommationElectricite( Energie energie, double consommationElectricite) {
        double prixKwh = 0;
        if (energie==Energie.ELECTRICITE) {
        	if (this.clientPro.getCa()>1000000)
        		prixKwh= EnergyPrices.ELECTRICITE_PRO_HIGH_CA;
        	else 
        		prixKwh= EnergyPrices.ELECTRICITE_PRO_LOW_CA;    		
    	}
    		  return prixKwh * consommationElectricite;
	}

}

