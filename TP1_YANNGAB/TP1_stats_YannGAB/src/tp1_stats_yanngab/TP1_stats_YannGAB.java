/*
YannGAB et Candice Gaudin
TP1_guess_my_number
TDA
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_yanngab;

import java.util.Scanner;

/**
 *
 * @author yann
 */
public class TP1_stats_YannGAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [] tableauDe = new double[6];
        double m;
        tableauDe[0] = 0;
        tableauDe[1] = 0;
        tableauDe[2] = 0;
        tableauDe[3] = 0;
        tableauDe[4] = 0;
        tableauDe[5] = 0;
        System.out.println("\n Bonjour, saisissez une valeur entiere :");
        Scanner sc = new Scanner(System.in);
        m=sc.nextDouble();
        
        for (int  i = 0; i<m; i++){
            int result =(int)(Math.random()*6);
            tableauDe[result]++;
        }
        System.out.println("Le resultat du nombre de faces obtenues apres simulation :");
        for(int i = 0; i<tableauDe.length; i++){
            System.out.println("Face" + (i + 1) + ":" + tableauDe[i]*(100/24)+"%");
        }
        
    }
    
}
