package com.ocr.val;

import java.util.Random;

public class Warrior extends Character {

    public Warrior(){
        name = "Guerrier";
    }

    @Override
    /**
     * Attaque de base qui inflige à l'adversaire des dégats égaux à la force de l'attaquant.
     * @see Character#strength
     */
    public void basicAttack() {
        System.out.println(this.player+" donne un coup d'épée et inflige "+this.getStrength()+" dégats.");
        Combat.currentAttack = this.getStrength();
    }

    @Override
    /**
     * Attaque spéciale qui inflige à l'adversaire le double de la force du lanceur. Le lanceur subit des dégats
     * égaux à sa force divisée par 2.
     * @see Character#strength
     */
    public void spell() {
        System.out.println(this.player+" frappe avec rage et inflige "+this.getStrength()*2+" dégats !");
        System.out.println(this.player+" se blesse en frappant et subit "+this.getStrength()/2+" dégats.");
        this.health = this.health - this.getStrength()/2;
        Combat.currentAttack = this.getStrength()*2;
    }

    @Override
    public void battleCry() {
        Random rand = new Random();
        int  n = rand.nextInt(3) + 1;

        switch (n){
            case 1:
                System.out.print("Lok'tar ! ");
                break;

            case 2:
                System.out.print("À l'assaut ! ");
                break;

            case 3:
                System.out.print("Par Crom ! ");
        }

    }
}
