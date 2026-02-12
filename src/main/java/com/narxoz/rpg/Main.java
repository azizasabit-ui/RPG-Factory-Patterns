package main.java.com.narxoz.rpg;

import main.java.com.narxoz.rpg.characters.*;
import main.java.com.narxoz.rpg.equipment.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== RPG Character Creation System ===\n");

        CharacterFactory warriorFactory = new WarriorFactory();
        GameCharacter warrior = warriorFactory.createCharacter("Thor");

        warrior.getStats();
        warrior.useSpecialAbility();

        EquipmentFactory medievalFactory = new MedievalFactory();
        Weapon weapon1 = medievalFactory.createWeapon();
        Armor armor1 = medievalFactory.createArmor();

        System.out.println("Equipped with Medieval Set:");
        weapon1.getWeaponInfo();
        armor1.getArmorInfo();

        System.out.println("\n----------------\n");

        CharacterFactory mageFactory = new MageFactory();
        GameCharacter mage = mageFactory.createCharacter("Merlin");

        mage.getStats();
        mage.useSpecialAbility();

        EquipmentFactory magicFactory = new MagicFactory();
        Weapon weapon2 = magicFactory.createWeapon();
        Armor armor2 = magicFactory.createArmor();

        System.out.println("Equipped with Magic Set:");
        weapon2.getWeaponInfo();
        armor2.getArmorInfo();

        System.out.println("\n----------------\n");

        CharacterFactory archerFactory = new ArcherFactory();
        GameCharacter archer = archerFactory.createCharacter("Robin");

        archer.getStats();
        archer.useSpecialAbility();

        EquipmentFactory rangerFactory = new RangerFactory();
        Weapon weapon3 = rangerFactory.createWeapon();
        Armor armor3 = rangerFactory.createArmor();

        System.out.println("Equipped with Ranger Set:");
        weapon3.getWeaponInfo();
        armor3.getArmorInfo();
    }
}
