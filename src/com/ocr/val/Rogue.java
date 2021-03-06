package com.ocr.val;

import java.util.Random;

public class Rogue extends Character {

    public Rogue(){
        name = "Rôdeur";
    }

    @Override
    /**
     * Attaque de base qui inflige à l'adversaire des dégats égaux à l'agilité de l'attaquant.
     * @see Character#agility
     */
    public void basicAttack() {
        System.out.println(this.player+" tire une flèche et inflige "+this.getAgility()+" dégats.");
        Combat.currentAttack = this.getAgility();
    }

    @Override
    /**
     * Le personnage gagne son niveau divisé par 2 en agilité.
     */
    public void spell() {
        System.out.println(this.player+" se concentre et gagne "+this.level/2 +" d'agilité !");
        this.agility = this.agility + this.level/2;
    }

    @Override
    public void battleCry() {
        Random rand = new Random();
        int  n = rand.nextInt(3) + 1;

        switch (n){
            case 1:
                System.out.print("Un soleil rouge se lève... ");
                break;

            case 2:
                System.out.print("Où est ma pomme ? ");
                break;

            case 3:
                System.out.print("Entre les deux yeux ! ");
        }

    }
}
