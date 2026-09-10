/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tp3;

/**
 *
 * @author hp
 */
public class Livre {
    private static int compteur = 0;
    private final int id;
    private String titre;
    private Auteur auteur;

    public Livre(String titre, Auteur auteur) {
        this.id = ++compteur;
        this.titre = titre;
        this.auteur = auteur;
        auteur.ajouterLivre(this);
    }

    public int getId() { return id; }
    public String getTitre() { return titre; }
    public Auteur getAuteur() { return auteur; }

    @Override
    public String toString() {
        return "Livre[id=" + id +
               ", titre=" + titre +
               ", auteur=" + auteur.getNom() +
               "]";
    }
    
}
