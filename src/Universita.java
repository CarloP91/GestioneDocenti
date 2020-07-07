import java.util.ArrayList;

public class Universita {
	
	private Docente[] listaDocenti;

	public Universita(Docente[] listaDocenti) {
		
		this.listaDocenti = listaDocenti;
	}
	
	public int etaMinima(){
		
		int etaMin = this.listaDocenti[0].getEta();
		
		for(int i=0;i<listaDocenti.length;i++) {
			if(listaDocenti[i].getEta()<etaMin) {
				etaMin = listaDocenti[i].getEta();
			}	
		}
		return etaMin;
	}
	
	public ArrayList<Docente> docentiEtaMin() {
		
		 ArrayList<Docente> docenti = new ArrayList<Docente>();
		 
		 for(int i=0; i<listaDocenti.length;i++) {
			 if(listaDocenti[i].getEta()== etaMinima()) {
				 docenti.add(listaDocenti[i]);
			 }
		 }
		 return docenti;
	}
}
