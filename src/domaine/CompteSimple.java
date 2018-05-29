package domaine;

public class CompteSimple extends Compte {
	
	// Attributs
	
	private int decouvert;
	
	// Getters & Setters
	
	public int getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(int decouvert) {
		this.decouvert = decouvert;
	}

	// To String
	
	@Override
	public String toString() {
		return "CompteSimple [decouvert=" + decouvert + ", idCompte=" + idCompte + ", solde=" + solde + "]";
	}

	// Constructeur
	
	public CompteSimple(int decouvert) {
		super();
		this.decouvert = decouvert;
	}

	public CompteSimple(int idCompte, int solde, int decouvert) {
		super.idCompte = idCompte;
		super.solde = solde;
		this.decouvert = decouvert;
	}

	public CompteSimple(int idCompte, int solde, Personne proprietaire, int decouvert) {
		super.idCompte = idCompte;
		super.solde = solde;
		super.proprietaire = proprietaire;
		this.decouvert = decouvert;
	}
	
	

	
	
}
