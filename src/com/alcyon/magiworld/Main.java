package com.alcyon.magiworld;

import static com.alcyon.magiworld.recupNombre.recupNombre;

public class Main {

    /* A FAIRE
    getters/setters ? non
    java doc
    git: en cours
    tests
    voir pour recupnombre qui propose 2 constructeurs !
    vérifier les portées (protected...)
    commenter main
    bug si niveau > 100
    faire methode recoitDegats ? fait
     */

    public static void main(String[] args) {

        Personnage joueur1 = ChoixClasse("Joueur 1");
        Personnage joueur2 = ChoixClasse("Joueur 2");

        // La bagarre !!!
        while (joueur1.estVivant() && joueur2.estVivant()) { //tant que les deux joueurs ont des points de vie
            joueur1.attaque(joueur2);
            if (joueur1.estVivant() && joueur2.estVivant()) joueur2.attaque(joueur1);
        }
    }

    private static Personnage ChoixClasse(String nomJoueur) {
        System.out.println("Création du personnage du " + nomJoueur);
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
        int choix = recupNombre(1,3);
        if (choix == 1) return new Guerrier(nomJoueur);
        if (choix == 2) return new Rodeur(nomJoueur);
        if (choix == 3) return new Mage(nomJoueur);
        return null; //demandé par la méthode au cas ou aucun choix n'est valide
    }
}