/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp4_console_durand_fagart;

/**
 *
 * @author 33768
 */
public class SP4_console_DURAND_FAGART {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jeton jeton_jaune=new Jeton("jaune");//Création d'un jeton pour vérifier le code
        System.out.println(jeton_jaune.lireCouleur());
        System.out.println(jeton_jaune.toString());//verification du fonctionnement des méthodes
        CelluleDeGrille cellule1=new CelluleDeGrille(jeton_jaune);//Création d'une cellule pour vérifier le code
        System.out.println(cellule1.presenceJeton());
        System.out.println(cellule1.lireCouleurDuJeton());//verification du fonctionnement des méthodes
        System.out.println(cellule1.recupererJeton());
        System.out.println(cellule1.presenceJeton());
// TODO code application logic here
        
    }
    
}
