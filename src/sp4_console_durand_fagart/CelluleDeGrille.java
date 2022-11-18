/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_durand_fagart;


/**
 *
 * @author 33768
 */
public class CelluleDeGrille {
    private Jeton jetonCourant;
    public CelluleDeGrille(Jeton jeton_courant) {
        jetonCourant=jeton_courant;  
}
    public void CelluleDeGrille (){
    jetonCourant=null;
    }
    public boolean presenceJeton(){
        if(jetonCourant==null){
        return(false);}
        else{
        return(true);}
    }
    public String lireCouleurDuJeton(){
    if (presenceJeton()==true){
        if("jaune".equals(jetonCourant.lireCouleur())){
        return("jaune");}
        else{return("rouge");}
        
    }
    else{return("vide");}
    }
    public Jeton recupererJeton(){
    Jeton c;
    c=jetonCourant;
    jetonCourant=null;
    return(c);
    }

}
