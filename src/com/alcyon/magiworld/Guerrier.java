package com.alcyon.magiworld;

public class Guerrier extends Personnage {

    public Guerrier(String nomJoueur) {
        this.nomJoueur = nomJoueur;
        remplissageValeurs();
        affichageValeurs("Woarg je suis le Guerrier " + nomJoueur);
    }

    @Override
    void attaqueBasique (Personnage cible) {
        System.out.println(nomJoueur + " utilise Coup d'Epée et inflige " + force + " dommages.");
        infligeDegats(cible, force);
    }

    @Override
    void attaqueSpeciale(Personnage cible) {
        System.out.println(nomJoueur + " utilise Coup de Rage et inflige " + force*2 + " dommages.");
        infligeDegats(cible, force*2);
        infligeDegats(this, force/2);
    }
}