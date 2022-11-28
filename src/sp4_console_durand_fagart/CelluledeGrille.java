/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_durand_fagart;


/**
 *
 * @author 33768
 */
public class CelluledeGrille {
    private Jeton jetonCourant;
    public CelluledeGrille(Jeton jeton_courant) {
        jetonCourant=jeton_courant;  
}
    public void CelluleDeGrille (){
    jetonCourant=null;
    int a; 
   
    }
    public boolean presenceJeton(){
        if(jetonCourant==null){
        return(false);}
        else{
        return(true);}
    }
    public String lireCouleurDuJeton(){
    if (presenceJeton()==true){
        if(jetonCourant.lireCouleur()=="jaune"){
        return("jaune");}
        else{return("rouge");}
        
    }
    else{return("vide");}
    }

}
