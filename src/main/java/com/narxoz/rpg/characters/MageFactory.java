package main.java.com.narxoz.rpg.characters;

public class MageFactory extends CharacterFactory {

    @Override
    public GameCharacter createCharacter(String name) {
        return new Mage(name);
    }
}
