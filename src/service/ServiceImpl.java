package service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;

import domaine.Club;
import domaine.Compte;
import domaine.Login;
import domaine.Personne;

public class ServiceImpl implements Iservice {

	// DECLARER ET INITIALISER LA LISTE DES PERSONNES
	private Map<Integer, Personne> personnes = new Hashtable<Integer, Personne>();
	private Map<Integer, Compte> comptes = new Hashtable<Integer, Compte>();
	private Map<Integer, Club> clubs = new Hashtable<Integer, Club>();
	
	public Map<Integer, Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Map<Integer, Compte> comptes) {
		this.comptes = comptes;
	}

	public Map<Integer, Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(Map<Integer, Personne> personnes) {
		this.personnes = personnes;
	}

	@Override
	public void readPersonne(Personne p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePersonne(Personne p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePersonne(Personne p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void affilierClub(Personne p, Club c) {
		// TODO Auto-generated method stub
	
		// initiation et instentiation d'une liste de Clubs
		Collection<Club> clubs = new ArrayList<Club>();
		// ajout du club c � la list
		clubs.add(c);
		// ajout du club � la personne
		p.setClubs(clubs);
		// initiation et instentiation d'une liste de personnes
		Collection<Personne> personnes = new ArrayList<Personne>();
		// ajout de la personne � la liste
		personnes.add(p);
		// ajout de la liste au club
		c.setMembres(personnes);

	}

	@Override
	public void attribuerCompte(Personne p, Compte c) {
		// TODO Auto-generated method stub
		p.getCompte().add(c);
		// op�ration inverse pour �tre synchronys� car pas encore de bdd
		c.setProprietaire(p);
	}

	@Override
	public void crediterCompte(Compte c, double montant) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debiterCompte(Compte c, double montant) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createTitulaire(Compte c, Personne p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void readCompte() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateTitulaire(Compte c, Personne p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCompte(Compte c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void readClub(Club club) {
		// TODO Auto-generated method stub

	}

	@Override
	public void readClubs() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ajouterMembreClub(Personne p, Club c) {
		// TODO Auto-generated method stub
		p.getClubs().add(c);
		Collection<Personne> membres = new ArrayList<Personne>(); // new
		membres.add(p);
		c.setMembres(membres);

	}

	@Override
	public void listeDeClubParUtilisateur(Personne p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteClub(Club club) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateClubName(String nom, Club club) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createLogin() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateLogin(Login log) {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<Integer, Personne> createPersonne(Personne p) {
		// TODO Auto-generated method stub
		personnes.put(p.getPersonneId(), p);
		return personnes;

	}

	@Override
	public void listePersonne(Map<Integer, Personne> personnes) {
		// TODO Auto-generated method stub
		for (Map.Entry<Integer, Personne> entry : personnes.entrySet()) {
			System.out.println(entry);
			if (entry.getValue().getCompte() != null) {
				for (Compte compte : entry.getValue().getCompte()) {
					System.out.println(compte);
				}
			}
			
			if(entry.getValue().getClubs() != null)
			{
				for (Club club : entry.getValue().getClubs()) {
					System.out.println(club);
				}
			}

		}

	}

	@Override
	public void updateCompte(Compte c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createClub(Club club) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateClub(Club club) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createLogin(Login log) {
		// TODO Auto-generated method stub

	}

	@Override
	public void readLogin(Login log) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteLogin(Login log) {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<Integer, Compte> createCompte(Compte c) {
		// TODO Auto-generated method stub
		comptes.put(c.getIdCompte(), c);
		return comptes;
	}

	@Override
	public void listeCompte(Map<Integer, Compte> comptes) {
		// TODO Auto-generated method stub
		for (Map.Entry<Integer, Compte> compte : comptes.entrySet()) {
			System.out.println(compte);

			if(compte.getValue().getProprietaire()!=null)
				System.out.println(compte.getValue().getProprietaire());	
		}

	}

	@Override
	public void ajouterTitulaire(Compte c, Personne p) {
		// TODO Auto-generated method stub
		p.getCompte().add(c);
		// operation inverse pour �tre synchro car par encore de bdd
		c.setProprietaire(p);

	}

	@Override
	public void listeClub(Map<Integer, Club> clubs) {
		// TODO Auto-generated method stub
		
		for (Map.Entry<Integer, Club> club : clubs.entrySet()) {
			System.out.println(clubs);

			if(club.getValue().getMembres()!=null){
				for (Personne personne : club.getValue().getMembres()) {
					System.out.println(personne);
			}
		}
	}
	}

	public Map<Integer, Club> getClubs() {
		return clubs;
	}

	public void setClubs(Map<Integer, Club> clubs) {
		this.clubs = clubs;
	}

}
