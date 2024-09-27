/*
 YannGAB
TP1_convertisseur
TDA
 */
package tp1_convertisseur_yanngab;

import java.util.Scanner;

/**
 *
 * @author yann
 */
public class TP1_convertisseur_YannGAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    double a; 
    double Kelvin;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("\n Entrer un reel :");
    a=sc.nextDouble();
    Kelvin = a + 273.15;
    System.out.println("\n Voici la valeur en Kelvin :"+ Kelvin);
    
    }
    public static double CelciusVersKelvin (double tCelcius) {
        double tKelvin;
        tKelvin = tCelcius + 273.15;
        return tKelvin; 
}
    public static double KelvinVersCelcius (double tKelvin) {
        double tCelcius;
        tCelcius = tKelvin - 273.15;
        return tCelcius; 
    }
    public static double FarenheitVersCelcius (double tFarenheit) {
        double tCelcius;
        tCelcius = (tFarenheit-32)*(5/9);
        return tCelcius; 
    }
    public static double KelvinVersFarenheit (double tFarenheit) {
        double tCelcius;
        tCelcius = tFarenheit + 273.15;
        return tCelcius; 
    }
}