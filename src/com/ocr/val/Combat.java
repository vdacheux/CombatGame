package com.ocr.val;

public abstract class Combat {

    static int currentAttack;
    static Player attackingPlayer;
    static Player defendingPlayer;
    static Player holder;

    /**
     * Lance le combat entre les deux joueurs.
     * Chaque joueur choisit une action à tour de rôle jusqu'à ce que la vie de l'un des deux tombe à zéro ou en dessous.
     */
    public static void letsBattle(){
        int i = 0;

        do {
            if (i % 2 == 0){
                attackingPlayer.chooseAction();
                defendingPlayer.takeDamage();
                i++;
            }
            else {
                holder = attackingPlayer;
                attackingPlayer = defendingPlayer;
                defendingPlayer = holder;
                i++;
            }

        } while (defendingPlayer.characterClass.health > 0);
        System.out.println(attackingPlayer.name+" remporte la partie !");
    }
}
