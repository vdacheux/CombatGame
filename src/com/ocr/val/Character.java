package com.ocr.val;

public class Character {

    int intelligence;
    int strength;
    int agility;
    int health;
    int level;
    String name;
    String player;

    public Character() {
    }

    public void basicAttack(){
    }

    public void spell(){
    }

    /**
     * Génère un cri de guerre aléatoire parmi 3 possibilités pour le personnage.
     */
    public void battleCry(){}

    //Getters
    public int getIntelligence() {
        return intelligence;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

}
