/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_yanngab;

/**
 *
 * @author yann
 */
public class Baton extends Arme {
    private int Age; 

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        
        if (Age>100){
            Age = 99;
    }
        if (Age<0){
            Age = 1;
        }
    this.Age = Age;
 
}

    public Baton(int Age, String nom, int NiveauAttaque) {
        super(nom, NiveauAttaque);
        this.Age = Age;
    }

} 