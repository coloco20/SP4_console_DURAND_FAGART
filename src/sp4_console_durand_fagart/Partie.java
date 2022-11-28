/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_durand_fagart;

/**
 *
 * @author 33768
 */
public class Partie {

    private Joueur tab[] = new Joueur[2];
    private Joueur joueurCourant;
    private PlateauDeJeu plateau;

    public Partie(Joueur r, Joueur j) {
        tab[0] = r;
        tab[1] = j;
        // incomplette

    }
    
    public void attribuerCouleurAuxJoueurs(){
   
        tab[0].affecterCouleur("r");
        tab[1].affecterCouleur("j");
        
    }
    
    public void creeEtAffecterJeton(Joueur jr){
        for(int i = 0; i < 31; i++){
            Jeton j = new Jeton(jr.lireCouleur());
            jr.ajouterJeton(j);
        }
    }
    
    public void placerTrouNoirEtDesintegrateur(){
        
    }
    
    public void initialiserPartie(){
           attribuerCouleurAuxJoueurs();
           creeEtAffecterJeton(tab[0]);
           creeEtAffecterJeton(tab[1]);
           placerTrouNoirEtDesintegrateur();
    }
    
    public void lancerPartie(){
        
    }
    
        
}
