package com.ocr.val;

public class Mage extends Character {

    public Mage() {
        name = "Mage";
    }

    @Override
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
        System.out.print("Expeliarmus ! ");
    }
}
