/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_yanngab;

/**
 *
 * @author yann
 */
public abstract class Arme {
    private String nom; 
    private int NiveauAttaque; 

    public Arme(String nom, int NiveauAttaque) {
        this.nom = nom;
        this.NiveauAttaque = NiveauAttaque;
    }

    public int getNiveauAttaque() {
        return NiveauAttaque;
    }

    public void setNiveauAttaque(int NiveauAttaque) {
        this.NiveauAttaque = NiveauAttaque;
    }

    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", NiveauAttaque=" + NiveauAttaque + '}';
    }

    public String getNom() {
        return nom;
    }

    
    
}
