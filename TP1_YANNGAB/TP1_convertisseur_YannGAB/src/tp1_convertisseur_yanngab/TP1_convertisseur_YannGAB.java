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
        
   /*  
    double Kelvin;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("\n Entrer un reel :");
    a=sc.nextDouble();
    Kelvin = a + 273.15;
    System.out.println("\n Voici la valeur en Kelvin :"+ Kelvin);
    */
   double a;
   int conversion; 
   double reponse;
   System.out.println("\n Bonjour, saisissez une valeur :");
   Scanner sc = new Scanner(System.in);
   a=sc.nextDouble();
   System.out.println("\n Saisissez la conversion que vous souhaiter effectuer :\n" + "1) De Celcius vers Kelvin\n"  +"2) De Kelvin vers Celcius\n" +"3) De Farenheit Vers Celcius\n" + "4) De Celcius Vers Farenheit\n"+  "5) De Kelvin Vers Farenheit\n"+  "6) De Farenheit Vers Kelvin\n");
   Scanner sc1 = new Scanner(System.in);
   conversion=sc1.nextInt();
   if (conversion==1){
       reponse = CelciusVersKelvin(a);
       System.out.println(a +" degres Celcius est egal a "+reponse+" Kelvin");       
   }
   if (conversion==2){
       reponse = KelvinVersCelcius(a);
       System.out.println(a +" Kelvin est egal a "+reponse+" degres Celcius ");       
   }
   if (conversion==3){
       reponse = FarenheitVersCelcius(a);
       System.out.println(a +" degres Celcius est egal a "+reponse+" degres Farenheit");       
   }
   if (conversion==4){
       reponse = CelciusVersFarenheit(a);
       System.out.println(a +" degres Farenheit est egal a "+reponse+" degres Celcius");       
   }
   if (conversion==5){
       reponse = KelvinVersFarenheit(a);
       System.out.println(a +" degres Farenheit est egal a "+reponse+" Kelvin");       
   }
   if (conversion==6){
       reponse = FarenheitVersKelvin(a);
       System.out.println(a +" Kelvin est egal a "+reponse+" degres Farenheit");       
   }
   
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
    public static double CelciusVersFarenheit (double tCelcius) {
        double tFarenheit;
        tFarenheit = (tCelcius*(9/5))+32;
        return tFarenheit; 
    }
    public static double KelvinVersFarenheit (double tKelvin) {
        double tFarenheit;
        tFarenheit = (tKelvin-273.15)*(9/5)+32;
        return tFarenheit; 
    }
    public static double FarenheitVersKelvin (double tFarenheit) {
        double tKelvin;
        tKelvin = (tFarenheit-32)*(5/9)+273.15;
        return tKelvin; 
    }
    
}