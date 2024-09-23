/*
 TP0 Exercice 3 
YannGAB TDA
Septembre 2024
 */
package exo3;

import java.util.Scanner;

/**
 *
 * @author yann
 */
public class Exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("Please enter the operator:" + "\n1) add" + "\n2) subestract" + "\n3) multiply" + "\n4) divide" + "\n5) modulo");
    int operateur;
    int operande1;
    int operande2;
    int reponse;
    
    Scanner sc = new Scanner(System.in);
    operateur=sc.nextInt();
    
    Scanner sc1 = new Scanner(System.in);
    System.out.println("\n Please enter the first number:");
    operande1=sc1.nextInt(); 
    
    Scanner sc2 = new Scanner(System.in);
    System.out.println("\n Please enter the second number:");
    operande2=sc2.nextInt(); 
    
    if (operateur == 1){
        reponse = operande1 + operande2;
        System.out.println(reponse);   
    }
    else if (operateur == 2) {
        reponse = operande1 - operande2;
        System.out.println(reponse);
    }
    else if (operateur == 3) {
        reponse = operande1*operande2;
        System.out.println(reponse);
    }
    else if (operateur == 4) {
        reponse = operande1/operande2;
        System.out.println(reponse);
    }
    else if (operateur == 5) {
        reponse = operande1%operande2;
        System.out.println(reponse);
    }
    else {
        System.out.println("L'opérateur n'est pas valide");
        
    }
    
}
}

