/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_yanngab;

/**
 *
 * @author yann
 */
public class Epee extends Arme {
    private int finesse;

    public int getFinesse() {
        return finesse;
    }

    public void setFinesse(int finesse) {
        
           if (finesse>100){
            finesse = 99;
}
           if (finesse<0){
               finesse = 1;
           }
           this.finesse = finesse;
    }

    public Epee(int finesse, String nom, int NiveauAttaque) {
        super(nom, NiveauAttaque);
        this.finesse = finesse;
    }
    
}
