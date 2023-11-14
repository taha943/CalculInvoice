package calcul.facture;

import calcul.consommation.CalculConsommationClientPro;
import energie.Energie;

public class CalculFactureClientPro implements CalculFacture {
	
	
	private CalculConsommationClientPro calculConsommationclientpro;
	
	public CalculFactureClientPro (CalculConsommationClientPro calculConsommationclientpro) {
		this.calculConsommationclientpro=calculConsommationclientpro;
		
	}
	
	@Override
	public  double calculateInvoice(Energie energieElectricte , Energie energieGaz , double consommationGaz ,  double consommationElectricite) {

		return calculConsommationclientpro.getPrixConsommationElectricite(energieElectricte, consommationElectricite) +  calculConsommationclientpro.getPrixConsommationGaz(energieGaz, consommationGaz) ;
    }

    


}
