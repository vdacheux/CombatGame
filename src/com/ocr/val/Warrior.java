package com.ocr.val;

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
    public void spell() {
        super.spell();
    }

    @Override
    public void battleCry() {
        System.out.print("Lok'tar ! ");
    }
}
