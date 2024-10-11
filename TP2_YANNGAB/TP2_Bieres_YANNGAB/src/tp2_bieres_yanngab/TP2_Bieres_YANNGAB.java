/*
YannGAB et Candice Gaudin
TP1_convertisseur
TDA
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_yanngab;



/**
 *
 * @author yann
 */
public class TP2_Bieres_YANNGAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*BouteilleBiere uneBiere = new BouteilleBiere() ;
        uneBiere.Nom = "Cuvée des trolls";
        uneBiere.degreAlcool = 7.0 ;
        uneBiere.brasserie = "Dubuisson";
        uneBiere.ouverte = false;
        uneBiere.lireEtiquette();
    
     BouteilleBiere autreBiere = new BouteilleBiere() ;
        autreBiere.Nom = "Leffe";
        autreBiere.degreAlcool = 6.6 ;
        autreBiere.brasserie="Abbaye de Leffe";*/
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",
7.0 ,"Dubuisson") ;
        uneBiere.lireEtiquette();
        
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe");
        autreBiere.lireEtiquette();
        
        BouteilleBiere secondeBiere = new BouteilleBiere("Desperados", 5.9 ,"Laboisson");
        autreBiere.lireEtiquette();
        
        BouteilleBiere TroisBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe");
        autreBiere.lireEtiquette();
        
        BouteilleBiere QuatreBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe");
        autreBiere.lireEtiquette();
        
        
    
    }
}
