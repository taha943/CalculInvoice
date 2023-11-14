package calcul.facture;

import energie.Energie;

public interface CalculFacture {
	
    public double calculateInvoice( Energie energieElectricte ,  Energie energieGaz , double consommationGaz ,  double consommationElectricite); 
    
}
