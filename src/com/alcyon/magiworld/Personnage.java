package com.alcyon.magiworld;

import static com.alcyon.magiworld.recupNombre.recupNombre;

public class Personnage {

    String nomJoueur;
    int niveau = 0;
    int vie = 0; //nombre de points de vie
    int force = 0;
    int agilite = 0;
    int intelligence = 0;


    public Personnage() {} // constructeur par défaut


    /**
     * Méthode pour remplir les caractéristiques du personnage selon choix utilisateur
     */
    protected void remplissageValeurs() {
        do {
            System.out.println("Niveau du personnage ?");
            niveau = recupNombre(0, 100);
            vie = niveau * 5;
            System.out.println("Force du personnage ?");
            force = recupNombre(0, 100);
            System.out.println("Agilité du personnage ?");
            agilite = recupNombre(0, 100);
            System.out.println("Intelligence du personnage ?");
            intelligence = recupNombre(0, 100);
            if (force + agilite + intelligence != niveau ) System.out.println("ERREUR: la somme Force + Agilité " +
                    "+ Intelligence doit être égale au Niveau du joueur. Recommencez !");
            //a faire: test des sommes
        } while (force + agilite + intelligence != niveau);
    }


    protected void affichageValeurs(String message)
    {
        System.out.println(message);

        System.out.println("Je possède " + vie + " de vitalité, " +
                force + " de force, " +
                agilite + " d'agilité, " +
                intelligence + " d'intelligence !");
    }

    void attaque (Personnage cible) {
        System.out.println(nomJoueur + " (" + vie + " Vitalité) veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spéciale)");
        if (recupNombre(1, 2) == 1) attaqueBasique(cible);
        else attaqueSpeciale(cible);
    }

    void attaqueBasique(Personnage cible) {} // méthode qui sera overridée selon la classe du personnage

    void attaqueSpeciale(Personnage cible) {} // méthode qui sera overridée selon la classe du personnage


    protected void infligeDegats(Personnage cible, int degats) {
        System.out.println(cible.nomJoueur + " perd " + degats + " points de vie");
        cible.recoitDegats(degats);
        if (!cible.estVivant()) System.out.println(cible.nomJoueur + " est mort");
    }

    protected void recoitDegats(int degats) {
        vie -= degats;
    }

    protected boolean estVivant() {
        return vie > 0;
    }
}