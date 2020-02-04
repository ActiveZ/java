package com.alcyon.magiworld;

import java.util.Scanner;

/**permet de récupérer un nb entier entre min et max
 * gère l'erreur si l'utilisateur entre un caractère
 * param min: valeur entière minimale autorisée
 * param max: valeur entière maximale autorisée
 * @return nb: nombre sélectionné par l'utilisateur
 */

public class recupNombre {

    public static int recupNombre(int min, int max)
    {
        Scanner sc = new Scanner(System.in);
        int nb = -1;
        while (nb < min | nb > max) {
            try {
                nb = sc.nextInt();
            } catch (Exception e) {
                var txt = sc.next();
                nb = -1;
            }
        }
        return nb;
    }
}