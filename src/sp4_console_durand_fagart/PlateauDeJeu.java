/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_durand_fagart;

/**
 *
 * @author 33768
 */
public class PlateauDeJeu {
    CelluleDeGrille[][] grille = new CelluleDeGrille [6][7];
    public PlateauDeJeu() {
        for(int i = 0;i<7; i++) {
      for(int j = 0;j<8; j++) {
          grille[i][j]=new CelluleDeGrille(null);
      }}
    
}
  public int ajouterJetonDansColonne(Jeton jeton_param,int indice){
      for(int i = 0;i<7; i++) {
          if (grille[i][indice]== new CelluleDeGrille(null)){
       grille[i][indice]=new CelluleDeGrille(jeton_param);
          return(i) ;    
          }
          }
     return(10);
     
      
  }  
  public boolean grilleRemplie(){
      for(int i = 0;i<7; i++) {
      for(int j = 0;j<8; j++) {
          if(grille[i][j]== new CelluleDeGrille(null)){
          }
      }}
  return(true);}

}
