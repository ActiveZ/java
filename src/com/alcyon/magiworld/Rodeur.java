package com.alcyon.magiworld;

public class Rodeur extends Personnage {

    public Rodeur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
        remplissageValeurs();
        affichageValeurs("Zuiiip je suis le Rôdeur " + nomJoueur);
    }

    @Override
    void attaqueBasique(Personnage cible) {
        System.out.println(nomJoueur + " utilise Tir à l'Arc et inflige " + agilite + " dommages.");
        infligeDegats(cible, agilite);
    }

    @Override
    void attaqueSpeciale(Personnage cible) {
        System.out.println(nomJoueur + " utilise Concentration et gagne " + niveau/2 + " points en agilité.");
        agilite += niveau/2;
    }
}