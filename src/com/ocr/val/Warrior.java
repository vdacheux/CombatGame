package com.ocr.val;

public class Warrior extends Character {

    public Warrior(){
        name = "Guerrier";
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
