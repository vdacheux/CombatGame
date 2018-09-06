package com.ocr.val;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {

    Character characterClass;
    String name;

    public Player(String str){
        this.name = str;
    }

    public void characterCreation() {
        System.out.println("Création du personnage du " + this.name);
        chooseClass();

    }

    /**
     *Permet à l'utilisateur de choisir la classe de son personnage parmi les trois proposées.
     * Boucle tant que le choix n'est pas correct.
     */
    public void chooseClass(){
        int choix = 0;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");

            if (!sc.hasNextInt()) {
                System.out.println("Veuillez choisir parmi les propositions.");
                sc.next();
                continue;
            }
            choix = sc.nextByte();
            switch (choix) {

                case 1:
                    this.characterClass = new Warrior();
                    System.out.println("Vous êtes un "+this.getCharacterClassName());
                    break;

                case 2:
                    this.characterClass = new Rogue();
                    System.out.println("Vous êtes un "+this.getCharacterClassName());
                    break;

                case 3:
                    this.characterClass = new Mage();
                    System.out.println("Vous êtes un "+this.getCharacterClassName());
                    break;

                default:
                    System.out.println("Veuillez choisir parmi les propositions.");
            }
        } while (choix != 1 && choix != 2 && choix != 3);
    }

    public void chooseLevel(){

    }

    public void chooseIntelligence(){

    }

    public void chooseStrength(){

    }

    public void chooseAgility(){

    }

    public void chooseAction(){

    }

    public String getCharacterClassName(){
        return this.characterClass.name;
    }

}
