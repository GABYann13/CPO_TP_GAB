/*
 TP1 Excercice 1
YannGAB TDA 
 */
package manipnombreint;

import java.util.Scanner;

/**
 *
 * @author yann
 */
public class ManipNombreInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a;
    int b;
    int somme;
    int produit;
    int difference;
    Scanner sc = new Scanner(System.in);
    System.out.println("\n Entrer un entier :");
    a=sc.nextInt();
    Scanner sc1 = new Scanner(System.in);
    System.out.println("\n Entrer un autre entier :");
    b=sc1.nextInt();
    somme=a+b;
    produit=a*b;
    difference=a-b;
    System.out.println("\n Voici la somme: " + somme + ", la difference: " + difference + " et le produit: " + produit + " de a et b.");
    }
   
}
