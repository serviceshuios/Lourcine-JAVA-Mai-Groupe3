package service;

import java.util.Collection;
import java.util.Map;

import domaine.Club;
import domaine.Compte;
import domaine.Login;
import domaine.Personne;

public interface Iservice {
	
	// CRUD pour l'objet Personne()
	public Map<Integer, Personne> createPersonne(Personne p);
	public void readPersonne(Personne p);
	public void updatePersonne(Personne p);
	public void deletePersonne(Personne p);
	public void affilierClub(Personne p, Club c);
	public void listePersonne(Map<Integer, Personne> personnes);
	
	// CRUD pour l'objet Compte()
	public void attribuerCompte(Personne p, Compte c);
	public void crediterCompte(Compte c, double montant);
	public void debiterCompte(Compte c, double montant);
	public void createTitulaire(Compte c, Personne p);
	public void readCompte();
	public void updateTitulaire(Compte c, Personne p);
	public void deleteCompte(Compte c);
	
	// Pour l'objet Club
	public void createClub();
	public void readClub(Club club);
	public void readClubs();
	public void ajouterMembreClub(Personne p, Club c);

	public void listeDeClubParUtilisateur(Personne p);
	public void deleteClub(Club club);
	public void updateClubName(String nom, Club club);
	
	// Pour l'objet Login
	public void createLogin();
	public void readLogin();
	public void updateLogin(Login log);
	public void suppressionLogin();
}
