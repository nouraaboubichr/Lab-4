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
public class Etudiant {
      private static int compteur = 0;
    private final int id;
    private String nom;
    private String prenom;
    private double[] notes;
    private int nbNotes;

    // Constructeur
    public Etudiant(String nom, String prenom) {
        this.id = ++compteur;
        this.nom = nom;
        this.prenom = prenom;
        this.notes = new double[5];
        this.nbNotes = 0;
    }

    // Ajouter une note
    public void ajouterNote(double note) {

        if (nbNotes == notes.length) {
            double[] tmp = new double[notes.length * 2];
            System.arraycopy(notes, 0, tmp, 0, notes.length);
            notes = tmp;
        }

        notes[nbNotes++] = note;
    }

    // Calculer la moyenne
    public double calculerMoyenne() {

        if (nbNotes == 0) {
            return 0.0;
        }

        double somme = 0;

        for (int i = 0; i < nbNotes; i++) {
            somme += notes[i];
        }

        return somme / nbNotes;
    }

    // Afficher les notes
    public void afficherNotes() {

        System.out.print("Notes de " + nom + " " + prenom + " : ");

        for (int i = 0; i < nbNotes; i++) {
            System.out.print(notes[i]);

            if (i < nbNotes - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }

    // Affichage de l'étudiant
    @Override
    public String toString() {

        return "Etudiant[id=" + id
                + ", nom=" + nom
                + ", prenom=" + prenom
                + ", moyenne=" + String.format("%.2f", calculerMoyenne())
                + "]";
    }
}
