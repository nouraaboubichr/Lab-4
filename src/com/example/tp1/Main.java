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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création des filières
     Filiere info = new Filiere("Informatique");
        Filiere genie = new Filiere("Genie Civil");
 
        Etudiant e1 = new Etudiant("lami", "yassin");
        Etudiant e2 = new Etudiant("aboubichr", "noura");
        Etudiant e3 = new Etudiant("aittaleb", "lamia");
        Etudiant e4 = new Etudiant("ayouchi", "ilham");
        
        info.ajouterEtudiant(e1);
        info.ajouterEtudiant(e2);
        info.ajouterEtudiant(e3);
        info.ajouterEtudiant(e4);
        
        genie.ajouterEtudiant(new Etudiant("kourach", "aziza"));
        genie.ajouterEtudiant(new Etudiant("agraram", "ayoube"));
 
        System.out.println(info);
        info.afficherEtudiants();
        System.out.println();
 
        System.out.println(genie);
        genie.afficherEtudiants();
        System.out.println();
 
        System.out.println("Detail de e2 : " + e2);
        System.out.println("Detail de e3 : " + e3);
        System.out.println("Detail de e4 : " + e4);
    }
    
}
