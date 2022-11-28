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
        plateau = new PlateauDeJeu();

    }

    public void attribuerCouleurAuxJoueurs() {

        tab[0].affecterCouleur("r");
        tab[1].affecterCouleur("j");

    }

    public void creeEtAffecterJeton(Joueur jr) {
        for (int i = 0; i < 31; i++) {
            Jeton j = new Jeton(jr.lireCouleur());
            jr.ajouterJeton(j);
        }
    }

    /*
    public void placerTrouNoirEtDesintegrateur() {
        int n;
        int m;
        for (int i = 0; i < 6; i++) {
            n = (int) (Math.random() * 6);
            m = (int) (Math.random() * 7);
            if (i < 3) {
                plateau.placerTrouNoir(n, m);
                if (i > 2) {
                    plateau.placeTrouNoir(n, m);
                    plateau.placerDesintegrateur(n, m);
                }

            }
        }

    }
     */

    public void initialiserPartie() {
        attribuerCouleurAuxJoueurs();
        creeEtAffecterJeton(tab[0]);
        creeEtAffecterJeton(tab[1]);
        //placerTrouNoirEtDesintegrateur();
    }

    public void lancerPartie() {

    }

}
