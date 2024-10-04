/*
YannGAB
TP1_guess_my_number
TDA
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_yanngab;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author yann
 */
public class TP1_guessMyNumber_YannGAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        int nbr;
        nbr=0;
        int compte = 1;
        System.out.println("Choississez un mode de diffuculte : \n1) Facile \n2) Moyen \n3) Difficile");
        int choix;
        Scanner vari=new Scanner(System.in);
        choix=vari.nextInt();
        if (choix==1) {
            System.out.println("Vous avez choisi le mode facile : Le jeu vous indiquera lorsque l'ecart entre le nombre a deviner et le votre est supperieur a 30");
            while (nbr!=n) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Entrez un nombre entre 1 et 100");
                nbr=sc.nextInt();
                if (nbr>n) {
                    if (nbr-n>25) {
                        System.out.println("Vraiment trop grand");
                    }
                    else {
                    System.out.println("trop grand");
                    }
            }
                else if (nbr<n) {
                    if (n-nbr>25){
                        System.out.println("Vraiment trop petit");
                    }
                    else {
                        System.out.println("Trop petit");
                    }
            }
           
            compte+=1;
            }
        }
        else if (choix==2) {
         System.out.println("Vous avez choisi le mode moyen");
            while (nbr!=n) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Entrez un nombre entre 1 et 100");
                nbr=sc.nextInt();
                if (nbr>n) {
                    System.out.println("Trop grand");
                }  
           
                else  {
                        System.out.println("Trop petit");
                    }
                compte+=1;
            }
           
            
            }
        else if (choix==3) {
         System.out.println("Vous avez choisi le mode difficile, vous avez 7 coups pour trouver le nombre");
            while ((nbr!=n)&&(compte<=10)) {
                Scanner sc = new Scanner(System.in);
            System.out.println("Entrez un nombre entre 1 et 100");
            nbr=sc.nextInt();
                if (nbr>n) {
                    System.out.println("Trop grand");
                }  
                else  {
                        System.out.println("Trop petit");
                    }
           
            compte+=1;
            }
            if ((nbr!=n)&&(compte>10)) {
                System.out.println("Vous n'avez pas trouver le bon nombre en 10 coups, la reponse est : "+n);
            }
        }
        if (n==nbr) {
            compte-=1;
            System.out.println("Gagne ! Vous avez reussi en "+compte+" tentatives");
        }
    }
    }