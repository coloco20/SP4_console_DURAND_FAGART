/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_durand_fagart;

/**
 *
 * @author 33768
 */
public class Jeton {
    private String couleur_jeton;
   public Jeton( String couleur) {
       couleur_jeton=couleur;
    
} 
   public String lireCouleur(){
       return(couleur_jeton);
   } 
   public String toString(){
       if(couleur_jeton=="rouge"){
       return("R");}
       else{
       return("J");}
   }
}
