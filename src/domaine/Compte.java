package domaine;

public class Compte {
	
	// Attributs
	
	protected int idCompte , solde;
	protected Personne proprietaire;

	// Getters & Setters
	
	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	public int getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}

	// To String
	
	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", solde=" + solde + "]";
	}

	// Constructeur
	
	public Compte() {
		super();
	}
	
	public Compte(int idCompte, int solde) {
		super();
		this.idCompte = idCompte;
		this.solde = solde;
	}

	public Compte(int idCompte, int solde, Personne proprietaire) {
		super();
		this.idCompte = idCompte;
		this.solde = solde;
		this.proprietaire = proprietaire;
	}

	
}
