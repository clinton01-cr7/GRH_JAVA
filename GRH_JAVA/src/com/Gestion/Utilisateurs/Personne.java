package com.Gestion.Utilisateurs;

import java.util.Date;

public abstract class Personne {
	   protected String matricule;
	   protected String nom;
	   protected String prenom;
	   protected Date dateNais;
	   protected String adresse;
	   protected Number telephone;
	   protected String email;
	   protected String photo;
	   protected String cin;
	   protected Boolean sexe;
	   protected String cp;
	   protected String pwd;
	   protected String login;
	   
	   public Personne ()
	   {
		   this.matricule = "";
		   this.nom = "";
		   this.prenom = "";
		   this.dateNais = null;
		   this.adresse = "";
		   this.telephone = 0;
		   this.email = "";
		   this.photo = "";
		   this.cin = "";
		   this.sexe = null;
		   this.cp = "";
		   this.pwd = "";
		   this.login = "";
	   }
}
