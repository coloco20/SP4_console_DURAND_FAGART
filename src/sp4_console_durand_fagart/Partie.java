/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_durand_fagart;

import java.util.Scanner;

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

    public void placerTrouNoirEtDesintegrateur() {
        int n;
        int m;
        for (int i = 0; i < 6; i++) {
            n = (int) (Math.random() * 6);
            m = (int) (Math.random() * 7);
            if (i < 3) {
                plateau.placerTrouNoir(n, m);
                if (i > 2) {
                    plateau.placerTrouNoir(n, m);
                    plateau.placerDesintegrateur(n, m);
                }

            }
        }

    }

    public void initialiserPartie() {
        attribuerCouleurAuxJoueurs();
        creeEtAffecterJeton(tab[0]);
        creeEtAffecterJeton(tab[1]);
        placerTrouNoirEtDesintegrateur();
    }

    public void lancerPartie() {
        Scanner sc = new Scanner(System.in);
        this.initialiserPartie();
        while (true) {
            if (!plateau.grilleRemplie()) {
                joueurCourant = tab[0];

                System.out.println("Que souhaitez vous faire ?"
                        + "\n1) Jouer un jeton\n2) Récupérer un jeton"
                        + "\n3) Utiliser un Desintegrateur");
                int rep_1 = sc.nextInt();
                switch (rep_1) {
                    case 1:
                        System.out.println("Sur qu'elle colonne voulez vous jouez ?"
                                + "\nEntre 1 à 7");
                        int col = sc.nextInt();
                        if (plateau.presenceJeton(col, 6)) {
                            System.out.println("La colonne est plein"
                                    + "\nIl faut choisir une autre colonne");
                        } else{
                            for(int i = 0; i < 7; i++){
                                if(!plateau.presenceJeton(i, col)){
                                    int ligne = i;
                                    break;
                                }
                            }
                        }
                        //Erreur si la colonne est plein il ne revient pas au début du case 
                            
                        if(plateau.presenceTrouNoir(col, col)) {                      
                            Jeton jeton_param = joueurCourant.joueJeton();
                            plateau.ajouterJetonDansColonne(jeton_param, col);
                        }
                    case 2:
                        System.out.println("Choisiser un de vos jeton"
                                + "\nExprimer la en cooreonnée Ligne puis Colonne");
                        int ligne_r = sc.nextInt();
                        int col_r = sc.nextInt();
                        if (plateau.lireJeton(ligne_r, col_r).equals(joueurCourant.lireCouleur())) {
                            joueurCourant.ajouterJeton(plateau.recupererJeton(ligne_r, col_r));
                            System.out.println("Le Jeton à été récupérer");
                            break;
                        } else if (plateau.lireJeton(ligne_r, col_r).equals("n")) {
                            System.out.println("Il n'y à aucun jeton sur cette case");
                        } else {
                            System.out.println("Ce n'est pas un de vos jeton");
                        }
                    case 3:
                        if (joueurCourant.nombreDesintegrateur() == 0) {
                            System.out.println("Vous n'avez pas de desintagrateur");
                            break;
                        } else {
                            System.out.println("Choisiser une case"
                                    + "\nExprimer la en coordonnée Ligne puis Colonne]");
                            int ligne_d = sc.nextInt();
                            int col_d = sc.nextInt();
                            if (plateau.presenceJeton(ligne_d, col_d)) {
                                plateau.supprimerJeton(ligne_d, col_d);
                                joueurCourant.utiliserDesintegrateur();
                                break;
                            } else {
                                System.out.println("Il n'y à pas de jeton sur cette case");
                            }

                        }

                        System.out.println("Sur qu'elle colonne voulez vous jouez ?"
                                + "\nEntre 1 à 7");
                }

                int col = sc.nextInt();
                String couleur = joueurCourant.lireCouleur();
                Jeton jeton_param = joueurCourant.joueJeton();
                plateau.ajouterJetonDansColonne(jeton_param, col);

            }
        }

    }

}
