package com.ocr.val;

public class Warrior extends Character {

    public Warrior(){
        name = "Guerrier";
    }

    @Override
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
