import java.util.ArrayList;

public class GestisciDocenti {

	public static void main(String[] args) {
		
		Docente docente1 = new Docente("Pinco Pallino", 00121, 30);
		Docente docente2 = new Docente("Tizio Sempronio", 00131, 32);
		Docente docente3 = new Docente("Caio Massimo", 00221, 30);
		Docente docente4 = new Docente("Anco Marzio", 00111, 54);
		
		Docente[] listaDocenti1 = {docente1, docente2, docente3 ,docente4};
		
		Universita uni1 = new Universita(listaDocenti1);
		
		int etaMin = uni1.etaMinima();
		
		ArrayList<Docente> docentiMin = uni1.docentiEtaMin(); 
		
		System.out.println("Età minima: " + etaMin + " anni." );
		System.out.println("Docenti con età minima:" );
		for(int i=0;i<docentiMin.size();i++) {
			System.out.println("-" + docentiMin.get(i).getNomeCognome());
		}
	}

}
