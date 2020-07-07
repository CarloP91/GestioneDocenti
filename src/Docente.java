
public class Docente {
	
	private String nomeCognome;
	private int codice, eta;
	
	public Docente(String nomeCognome, int codice, int eta) {
		
		this.nomeCognome = nomeCognome;
		this.codice = codice;
		this.eta = eta;
	}

	public String getNomeCognome() {
		return nomeCognome;
	}

	public void setNomeCognome(String nomeCognome) {
		this.nomeCognome = nomeCognome;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
}
