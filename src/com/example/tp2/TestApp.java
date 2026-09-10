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
public class TestApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Categorie[] categories = new Categorie[2];
        categories[0] = new Categorie("Ordinateur Portable", "O PR");
        categories[1] = new Categorie("Ordinateur Poste", "O PO");
 
        
        Article[] articles = new Article[4];
        articles[0] = new Article(14, "DELL INSPIRON", categories[0]);
        articles[1] = new Article(4, "SONY VAIO", categories[0]);
        articles[2] = new Article(74, "TERRA", categories[1]);
        articles[3] = new Article(785, "HP Compaq", categories[1]);
 
       
        for (int i = 0; i < categories.length; i++) {
            Categorie categorie = categories[i];
            System.out.println(categorie.getLibelle() + " :");
 
            for (int j = 0; j < articles.length; j++) {
                Article article = articles[j];
                if (article.getCategorie().getId() == categorie.getId()) {
                    System.out.println("  - " + article.toString());
                }
            }
 
            System.out.println();
        }
    }
    
}
