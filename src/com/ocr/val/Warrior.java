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
        System.out.print("Lok'tar ! ");
    }
}
