package main.java.com.narxoz.rpg.characters;

public class Archer implements GameCharacter {

    private String name;
    private int health = 100;
    private int mana = 70;
    private int strength = 70;
    private int intelligence = 60;

    public Archer(String name) {
        this.name = name;
    }

    @Override
    public void getStats() {
        System.out.println("Archer: " + name);
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Special Ability: Multi Arrow!");
    }
}

