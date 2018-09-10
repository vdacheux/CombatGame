package com.ocr.val;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("Joueur 1");
        player1.characterCreation();
        System.out.println("Force du "+player1.name+" : "+player1.characterClass.getStrength());
        System.out.println("Agilité du "+player1.name+" : "+player1.characterClass.getAgility());
        System.out.println("Agilité du "+player1.name+" : "+player1.characterClass.getIntelligence());
    }
}
