package main.java.com.narxoz.rpg.characters; 
public class Warrior implements GameCharacter {

    private String name;
    private int health = 150;
    private int mana = 30;
    private int strength = 100;
    private int intelligence = 20;

    public Warrior(String name) {
        this.name = name;
    }

    @Override
    public void getStats() {
        System.out.println("Warrior: " + name);
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Special Ability: Power Strike!");
    }
}
