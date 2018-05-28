package service;

import domaine.Club;
import domaine.Compte;
import domaine.Login;
import domaine.Personne;

public interface Iservice {
	
	// CRUD pour l'objet Personne()
	public void createPersonne();
	public void readPersonne(Personne p);
	public void updatePersonne(Personne p);
	public void supprimerPersonne(Personne p);
	public void listeDesPersonnes();
	public void affilierClub(Personne p, Club c);
	
	// CRUD pour l'objet Compte()
	public void attribuerCompte(Personne p, Compte c);
	public void crediterCompte(Compte c, double montant);
	public void debiterCompte(Compte c, double montant);
	public void supprimerCompte(Compte c);
	public void ajouterTitulaire(Compte c, Personne p);
	public void lireCompte();
	
	// Pour l'objet Club
	public void readClub(Club club);
	public void ajouterPersonneClub(Personne p, Club c);
	public void listeDesClub();
	public void listeDeClubParUtilisateur(Personne p);
	public void suppressionDeClub(Club club);
	public void modificationDuNomDeClub(String nom, Club club);
	
	// Pour l'objet Login
	public void createLogin();
	public void readLogin();
	public void updateLogin(Login log);
	public void suppressionLogin();
	
}
