/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tp1;

/**
 *
 * @author hp
 */
public class Filiere {
    
  static int compteur = 0;
 
    int id;
    String nom;
    Etudiant[] etudiants;
    int nbEtudiants;
 
    public Filiere(String nom) {
        compteur++;
        id = compteur;
        this.nom = nom;
        etudiants = new Etudiant[5];
        nbEtudiants = 0;
    }
 
    public String getNom() {
        return nom;
    }
 
    public void ajouterEtudiant(Etudiant e) {
 
        if (nbEtudiants == etudiants.length) {
 
            Etudiant[] tmp = new Etudiant[etudiants.length * 2];
 
            int i = 0;
            while (i < etudiants.length) {
                tmp[i] = etudiants[i];
                i++;
            }
 
            etudiants = tmp;
        }
 
        etudiants[nbEtudiants] = e;
        nbEtudiants++;
        e.setFiliere(this);
    }
 
    public void afficherEtudiants() {
        System.out.println("Filiere " + nom + " -> " + nbEtudiants + " etudiants :");
 
        int i = 0;
        while (i < nbEtudiants) {
            System.out.println("  - " + etudiants[i].getNom() + " " + etudiants[i].getPrenom());
            i++;
        }
    }
 
    public String toString() {
        return "Filiere[nom=" + nom + ", nbEtudiants=" + nbEtudiants + "]";
    }
}
