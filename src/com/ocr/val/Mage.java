package com.ocr.val;

import java.util.Random;

public class Mage extends Character {

    public Mage() {
        name = "Mage";
    }

    @Override
    /**
     * Attaque de base qui inflige à l'adversaire des dégats égaux à l'intelligence de l'attaquant.
     * @see Character#intelligence
     */
    public void basicAttack() {
        System.out.println(this.player+" projette une boule de feu et inflige "+this.getIntelligence()+" dégats.");
        Combat.currentAttack = this.getIntelligence();
    }

    @Override
    public void spell() {
        super.spell();
    }

    @Override
    public void battleCry() {
        Random rand = new Random();
        int  n = rand.nextInt(3) + 1;

        switch (n){
            case 1:
                System.out.print("Expeliarmus ! ");
                break;

            case 2:
                System.out.print("Wabbajack ! ");
                break;

            case 3:
                System.out.print("SHAZAM ! ");
        }

    }
}
