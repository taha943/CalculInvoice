package calcul.facture;

import calcul.consommation.CalculConsommationClientParticulier;
import energie.Energie;

public class CalculFactureClientParticulier implements CalculFacture {

	
	private CalculConsommationClientParticulier calculConsommationclientParticulier;
	
	public CalculFactureClientParticulier (CalculConsommationClientParticulier calculConsommationclientParticulier) {
		this.calculConsommationclientParticulier=calculConsommationclientParticulier;
		
	}

	@Override
	public double calculateInvoice(Energie energieElectricte, Energie energieGaz, double consommationGaz,
			double consommationElectricite) {
		return calculConsommationclientParticulier.getPrixConsommationElectricite(energieElectricte, consommationElectricite) + calculConsommationclientParticulier.getPrixConsommationGaz(energieGaz, consommationGaz);
	}


}