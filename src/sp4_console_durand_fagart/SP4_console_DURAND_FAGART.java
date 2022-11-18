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
        System.out.println(jeton_jaune.toString());
        // TODO code application logic here
    }
    
}
