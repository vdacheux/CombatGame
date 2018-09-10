package com.ocr.val;

public class Mage extends Character {

    public Mage() {
        name = "Mage";
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
        System.out.print("Lok'tar ! ");
    }
}
