package domaine;

public abstract class Compte {
	
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
	
}
