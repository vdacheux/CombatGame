package com.ocr.val;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player();
        player1.characterClass = new Warrior();
        System.out.println(player1.getCharacterClassName());

    }
}
