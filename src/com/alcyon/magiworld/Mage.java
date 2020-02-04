package com.alcyon.magiworld;

public class Mage extends Personnage {

    public Mage(String nomJoueur) {
        this.nomJoueur = nomJoueur;
        remplissageValeurs();
        affichageValeurs("Abracadabra je suis le Mage " + nomJoueur);
    }

    @Override
    void attaqueBasique(Personnage cible) {
        System.out.println(nomJoueur + " utilise Boule de Feu et inflige " + intelligence + " dommages.");
        infligeDegats(cible, intelligence);
    }

    @Override
    void attaqueSpeciale(Personnage cible) {
        int recuperation = intelligence*2;
        if (recuperation + vie > niveau*5) recuperation = niveau*5 - vie;
        System.out.println(nomJoueur + " utilise Soin et récupère " + recuperation + " points de vie.");
        vie += recuperation;
    }
}