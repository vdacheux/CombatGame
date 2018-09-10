package com.ocr.val;

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
        chooseAgility();
        chooseIntelligence();
        this.characterClass.health = this.characterClass.level * 5;
        this.characterClass.battleCry();
        System.out.println("Je suis un "+this.getCharacterClassName()+" de niveau "+this.characterClass.level+". " +
                "J'ai "+this.characterClass.health+" vitalité, "+this.characterClass.strength+" Force, "+this.characterClass.agility+
                " Agilité et "+this.characterClass.intelligence+" Intelligence.");

    }

    /**
     * Permet à l'utilisateur de choisir la classe de son personnage parmi les trois proposées.
     * @see Warrior
     * @see Rogue
     * @see Mage
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
                    break;

                case 2:
                    this.characterClass = new Rogue();
                    break;

                case 3:
                    this.characterClass = new Mage();
                    break;

                default:
                    System.out.println("Veuillez choisir parmi les propositions.");
            }
        } while (choix != 1 && choix != 2 && choix != 3);
    }

    /**
     * Permet à l'utilisateur de choisir le niveau de son personnage.
     * @see Character#level
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
     * @see Character#strength
     * La statistique ne peut pas dépasser le niveau du personnage.
     */
    public void chooseStrength(){
        Scanner sc = new Scanner(System.in);
        int strength = -1;
        System.out.println("Force du personnage ?");

        do {
            if (!sc.hasNextInt()) {
                System.out.println("Veuillez entrer un nombre compris entre 0 et le niveau de votre personnage ("+this.characterClass.level+").");
                sc.next();
                continue;
            }
            strength = sc.nextInt();

            if (strength > this.characterClass.level) {
                System.out.println("Les statistiques de votre personnage ne peuvent pas dépasser son niveau.");
                continue;
            }
            else if (strength < 0){
                System.out.println("Vous devez entrer un nombre positif.");
                continue;
            }
        }while (!(strength <= this.characterClass.level) || strength < 0) ;

        this.characterClass.strength = strength;
    }

    /**
     * Permet à l'utilisateur de choisir l'agilité de son personnagge.
     * @see Character#agility
     * La somme de ses statistique ne peut pas dépasser le niveau du personnage.
     */
    public void chooseAgility(){
        Scanner sc = new Scanner(System.in);
        int agility = -1;
        int statSum = 0;
        System.out.println("Agilité du personnage ?");

        do {
            if (!sc.hasNextInt()) {
                System.out.println("Veuillez entrer un nombre compris entre 0 et le niveau de votre personnage ("+this.characterClass.level+").");
                sc.next();
                continue;
            }
            agility = sc.nextInt();
            statSum = agility + this.characterClass.strength;

            if (statSum > this.characterClass.level) {
                System.out.println("Les statistiques de votre personnage ne peuvent pas dépasser son niveau.");
                continue;
            }
            else if (agility < 0){
                System.out.println("Vous devez entrer un nombre positif.");
                continue;
            }
        }while (statSum > this.characterClass.level || agility < 0) ;

        this.characterClass.agility = agility;
    }

    /**
     * Permet à l'utilisateur de choisir l'intelligence de son personnagge.
     * @see Character#intelligence
     * La somme de ses statistique ne peut pas dépasser le niveau du personnage.
     */
    public void chooseIntelligence(){
        Scanner sc = new Scanner(System.in);
        int intelligence = -1;
        int statSum = 0;
        System.out.println("Intelligence du personnage ?");

        do {
            if (!sc.hasNextInt()) {
                System.out.println("Veuillez entrer un nombre compris entre 0 et le niveau de votre personnage ("+this.characterClass.level+").");
                sc.next();
                continue;
            }
            intelligence = sc.nextInt();
            statSum = intelligence + this.characterClass.strength + this.characterClass.agility;

            if (statSum > this.characterClass.level) {
                System.out.println("Les statistiques de votre personnage ne peuvent pas dépasser son niveau.");
                continue;
            }
            else if (intelligence < 0){
                System.out.println("Vous devez entrer un nombre positif.");
                continue;
            }
        }while (statSum > this.characterClass.level || intelligence < 0) ;

        this.characterClass.intelligence = intelligence;
    }

    /**
     * Permet à l'utilisateur de choisir une action à effectuer.
     * @see Character#basicAttack()
     * @see Character#spell()
     */
    public void chooseAction(){
        Scanner sc = new Scanner(System.in);
        int choix = 0;

        do {
            System.out.println(this.getCharacterClassName()+" (Vitalité : "+this.characterClass.getHealth()+"), veuillez" +
                    " choisir une action : 1. Attaque basique, 2. Coup spécial");

            if (!sc.hasNextInt()) {
                System.out.println("Veuillez choisir parmi les propositions.");
                sc.next();
                continue;
            }
            choix = sc.nextInt();
            switch (choix) {

                case 1:
                    this.characterClass.basicAttack();
                    break;

                case 2:
                    this.characterClass.spell();
                    break;

                default:
                    System.out.println("Veuillez choisir parmi les propositions.");
            }
        } while (choix != 1 && choix != 2);

    }

    public String getCharacterClassName(){
        return this.characterClass.name;
    }

}
