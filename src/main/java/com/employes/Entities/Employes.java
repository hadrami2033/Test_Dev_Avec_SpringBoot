package com.employes.Entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Employes {

	@Id @GeneratedValue
	private long Id;
	private String Nom;
	private String Prenom;
	//@Column
    //@JsonFormat(pattern = "dd/MM/yyyy")
	private String DateNaissance;
	private String Genre;
	private String GroupeSanguin;
	private double Poids;
	private double Taille;
	private String Observations;
	
	
	public Employes() {
		super();
	}
	
	
	public Employes(String nom, String prenom, String dateNaissance, String genre, String groupeSanguin, double poids,
			double taille, String observations) {
		super();
		Nom = nom;
		Prenom = prenom;
		DateNaissance = dateNaissance;
		Genre = genre;
		GroupeSanguin = groupeSanguin;
		Poids = poids;
		Taille = taille;
		Observations = observations;
	}


	public long getId() {
		return Id;
	}


	public void setId(long id) {
		Id = id;
	}


	public String getNom() {
		return Nom;
	}


	public void setNom(String nom) {
		Nom = nom;
	}


	public String getPrenom() {
		return Prenom;
	}


	public void setPrenom(String prenom) {
		Prenom = prenom;
	}


	public String getDateNaissance() {
		return DateNaissance;
	}


	public void setDateNaissance(String dateNaissance) {
		DateNaissance = dateNaissance;
	}


	public String getGenre() {
		return Genre;
	}


	public void setGenre(String genre) {
		Genre = genre;
	}


	public String getGroupeSanguin() {
		return GroupeSanguin;
	}


	public void setGroupeSanguin(String groupeSanguin) {
		GroupeSanguin = groupeSanguin;
	}


	public double getPoids() {
		return Poids;
	}


	public void setPoids(double poids) {
		Poids = poids;
	}


	public double getTaille() {
		return Taille;
	}


	public void setTaille(double taille) {
		Taille = taille;
	}


	public String getObservations() {
		return Observations;
	}


	public void setObservations(String observations) {
		Observations = observations;
	}
	
	
}
