/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_durand_fagart;

import java.util.*;

/**
 *
 * @author 33768
 */
public class Joueur {

    private String nom;
    private String color;
    private ArrayList<Jeton> reserveJetons = new ArrayList();
    private int nombreDesintegrateur;

    public Joueur(String nom_i) {
        nom = nom_i;
        nombreDesintegrateur = 0;
    }

    public void affecterCouleur(String col) {
        if(col.equals("r")){
            color = "rouge";
        }if(col.equals("j")){
            color = "Jaune";
        }
        
    }

    public int nombreDeJeton() {
        return (reserveJetons.size());

    }
    
    public void ajouterJeton(Jeton j){
        reserveJetons.add(j);
    }
    
    public void joueJeton(){
        reserveJetons.remove(reserveJetons.size());
    }
    
    public void obtenirDesintegrateur(){
        nombreDesintegrateur++;
    }
    
    public void utiliserDesintegrateur(){
        nombreDesintegrateur--;
    }
    
    
}
