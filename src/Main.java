import calcul.consommation.CalculConsommationClientParticulier;
import calcul.consommation.CalculConsommationClientPro;
import calcul.facture.CalculFactureClientParticulier;
import calcul.facture.CalculFactureClientPro;
import client.ClientParticulier;
import client.ClientPro;
import energie.Energie;

public class Main {

	public static void main(String[] args) {
		
		
		ClientParticulier clientParticulier = new ClientParticulier("EKL999888777", "M", "Filali", "Taha");
		ClientPro clientPro1 = new ClientPro("EKL123456789", "000", "raison social 1", 15000000);
		ClientPro clientPro2 = new ClientPro("EKL000111222", "222", "raison social 2", 90000);
		
		
		CalculConsommationClientParticulier  calculConsommationClientParticulier = new CalculConsommationClientParticulier();
		CalculConsommationClientPro  calculConsommationClientPro1 = new CalculConsommationClientPro(clientPro1) ;
		CalculConsommationClientPro  calculConsommationClientPro2 = new CalculConsommationClientPro(clientPro2) ;
		
		
		CalculFactureClientParticulier  calculFactureClientParticulier = new CalculFactureClientParticulier(calculConsommationClientParticulier);
		CalculFactureClientPro  calculFactureClientPro1 = new CalculFactureClientPro(calculConsommationClientPro1) ;
		CalculFactureClientPro  calculFactureClientPro2 = new CalculFactureClientPro(calculConsommationClientPro2) ;
		
		
		double calculateInvoice = calculFactureClientParticulier.calculateInvoice( Energie.ELECTRICITE, Energie.GAZ,  55.3, 100); 
		double calculateInvoice2 = calculFactureClientPro2.calculateInvoice(Energie.ELECTRICITE, Energie.GAZ, 53.4, 74.2) ; 
		double calculateInvoice1 = calculFactureClientPro1.calculateInvoice(Energie.ELECTRICITE, Energie.GAZ, 53.4, 74.2) ; 
		
		
		System.out.println("le client " + clientPro1.getRefClient() + " va payer " +calculateInvoice1 + " €");
		System.out.println("le client " + clientPro2.getRefClient() + " va payer " +calculateInvoice2 + " €");
		System.out.println("le client" + clientParticulier.getRefClient() + " va payer " +calculateInvoice + " €" );
		

	}

}
