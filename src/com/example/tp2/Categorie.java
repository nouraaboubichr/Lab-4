/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tp2;

/**
 *
 * @author hp
 */
public class Categorie {
    private static int compteur = 0;
    private int id;
    private String libelle;
    private String code;

    public Categorie(String libelle, String code) {
        compteur++;
        this.id = compteur;
        this.libelle = libelle;
        this.code = code;
    }

    public int getId() { return id; }
    public String getLibelle() { return libelle; }
    public void setLibelle(String libelle) { this.libelle = libelle; }
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    @Override
    public String toString() {
        return "Categorie{id=" + id + ", libelle='" + libelle + "', code='" + code + "'}";
    }
    
}
