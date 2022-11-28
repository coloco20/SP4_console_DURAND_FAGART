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
    CelluledeGrille[][] grille = new CelluledeGrille [6][7];
    public PlateauDeJeu() {
        for(int i = 0;i<7; i++) {
      for(int j = 0;j<8; j++) {
          grille[i][j]=new CelluledeGrille(null);
      }}
    
}
  public int ajouterJetonDansColonne(Jeton jeton_param,int indice){
      for(int i = 0;i<7; i++) {
          if (grille[i][indice]== new CelluledeGrille(null)){
       grille[i][indice]=new CelluledeGrille(jeton_param);
          return(i) ;    
          }
          }
     return(10);
     
      
  }  
  public boolean grilleRemplie(){
      for(int i = 0;i<7; i++) {
      for(int j = 0;j<8; j++) {
          if(grille[i][j]== new CelluledeGrille(null)){
          }
      }}
  return(true);}


public boolean presenceJeton(int x,int y){
if (grille[x][y].presenceJeton()==true){
    return(true);}
return(false);
}
public String lireCouleurDuJeton(int x,int y){
return(grille[x][y].lireCouleurDuJeton());
}
public boolean ligneGagnantePourCouleur(String couleur_gagnante){
    for(int i = 0;i<6; i++) {
        for(int j = 0;j<4; j++) {
        if(grille[i][j].lireCouleurDuJeton().equals(couleur_gagnante)&grille[i][j+1].lireCouleurDuJeton().equals(couleur_gagnante)&grille[i][j+2].lireCouleurDuJeton().equals(couleur_gagnante)&grille[i][j+3].lireCouleurDuJeton().equals(couleur_gagnante)){
            return(true);
        }
        }
    
    }
    return(false);
}
public boolean colonneGagnantePourCouleur(String couleur_gagnante){
    for(int i = 0;i<3; i++) {
        for(int j = 0;j<7; j++) {
        if(grille[i][j].lireCouleurDuJeton().equals(couleur_gagnante)&grille[i][j+1].lireCouleurDuJeton().equals(couleur_gagnante)&grille[i][j+2].lireCouleurDuJeton().equals(couleur_gagnante)&grille[i][j+3].lireCouleurDuJeton().equals(couleur_gagnante)){
            return(true);
        }
        }
    
    }
    return(false);
}
public boolean diagonaleMontanteGagnantePourCouleur(String couleur_gagnante){
    for(int i = 0;i<3; i++) {
        for(int j = 0;j<4; j++) {
        if(grille[i][j].lireCouleurDuJeton().equals(couleur_gagnante)&grille[i+1][j+1].lireCouleurDuJeton().equals(couleur_gagnante)&grille[i+2][j+2].lireCouleurDuJeton().equals(couleur_gagnante)&grille[i+3][j+3].lireCouleurDuJeton().equals(couleur_gagnante)){
            return(true);
        }
        }
    
    }
    return(false);
}

}