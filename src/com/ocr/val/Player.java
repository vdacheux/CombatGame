package com.ocr.val;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {

    Character characterClass;
    String name;

    public Player(String str) {
        this.name = str;
    }

    public void characterCreation() {
        System.out.println("Création du personnage du " + this.name);
        chooseClass();
        chooseLevel();
        chooseStrength();

    }

    /**
     * Permet à l'utilisateur de choisir la classe de son personnage parmi les trois proposées.
     * Boucle tant que le choix n'est pas correct.
     */
    public void chooseClass() {
        int choix = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");

            if (!sc.hasNextInt()) {
                System.out.println("Veuillez choisir parmi les propositions.");
                sc.next();
                continue;
            }
            choix = sc.nextInt();
            switch (choix) {

                case 1:
                    this.characterClass = new Warrior();
                    System.out.println("Vous êtes un " + this.getCharacterClassName());
                    break;

                case 2:
                    this.characterClass = new Rogue();
                    System.out.println("Vous êtes un " + this.getCharacterClassName());
                    break;

                case 3:
                    this.characterClass = new Mage();
                    System.out.println("Vous êtes un " + this.getCharacterClassName());
                    break;

                default:
                    System.out.println("Veuillez choisir parmi les propositions.");
            }
        } while (choix != 1 && choix != 2 && choix != 3);
    }

    /**
     * Permet à l'utilisateur de choisir le niveau de son personnage.
     * Boucle tant que le niveau n'est pas un chiffre compris entre 1 et 100 inclus.
     */
    public void chooseLevel() {
        Scanner sc = new Scanner(System.in);
        int level = 0;
        System.out.println("Niveau du personnage ?");

        do {
            if (!sc.hasNextInt()) {
                System.out.println("Veuillez entrer un nombre compris entre 1 et 100.");
                sc.next();
                continue;
            }
            level = sc.nextInt();

            if (level < 1 || level > 100) {
                System.out.println("Veuillez entrer un nombre compris entre 1 et 100.");
                continue;
            }
        }while (!(level >= 1 && level <= 100)) ;

            this.characterClass.level = level;
    }

    /**
     * Permet à l'utilisateur de choisir la force de son personnagge.
     * La statistique ne peut pas dépasser le niveau du personnage.
     */
    public void chooseStrength(){
        Scanner sc = new Scanner(System.in);
        int strength = 0;
        System.out.println("Force du personnage ?");

        do {
            if (!sc.hasNextInt()) {
                System.out.println("Veuillez entrer un nombre compris entre 1 et 100.");
                sc.next();
                continue;
            }
            strength = sc.nextInt();

            if (strength > this.characterClass.level) {
                System.out.println("Les statistiques de votre personnage ne peuvent pas dépasser son niveau.");
                continue;
            }
        }while (!(strength <= this.characterClass.level)) ;

        this.characterClass.strength = strength;
    }

    public void chooseAgility(){

    }

    public void chooseIntelligence(){

    }
    public void chooseAction(){

    }

    public String getCharacterClassName(){
        return this.characterClass.name;
    }

}
