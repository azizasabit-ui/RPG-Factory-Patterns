package main.java.com.narxoz.rpg.characters;

public class Mage implements GameCharacter {

    private String name;
    private int health = 70;
    private int mana = 150;
    private int strength = 20;
    private int intelligence = 100;

    public Mage(String name) {
        this.name = name;
    }

    @Override
    public void getStats() {
        System.out.println("Mage: " + name);
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Special Ability: Fireball!");
    }
}

