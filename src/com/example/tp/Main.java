/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tp;

/**
 *
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {

        Etudiant e1 = new Etudiant("Dupont", "Alice");
        Etudiant e2 = new Etudiant("Martin", "Bob");

        e1.ajouterNote(14.5);
        e1.ajouterNote(12.0);
        e1.ajouterNote(16.0);

        e2.ajouterNote(10.0);
        e2.ajouterNote(13.5);

        e1.afficherNotes();
        System.out.println(e1);

        e2.afficherNotes();
        System.out.println(e2);
    }
    }
    

