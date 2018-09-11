package com.ocr.val;

public class Rogue extends Character {

    public Rogue(){
        name = "Rôdeur";
    }

    @Override
    public void basicAttack() {
        super.basicAttack();
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
