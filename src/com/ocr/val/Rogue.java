package com.ocr.val;

public class Rogue extends Character {

    public Rogue(){
        name = "Rôdeur";
    }

    @Override
    public void basicAttack() {
        System.out.println(this.player+" tire une flèche et inflige "+this.getAgility()+" dégats.");
        Combat.currentAttack = this.getAgility();
    }

    @Override
    public void spell() {
        super.spell();
    }

    @Override
    public void battleCry() {
        System.out.print("Chut... ");
    }
}
