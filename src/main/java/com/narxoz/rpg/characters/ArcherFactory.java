package main.java.com.narxoz.rpg.characters;

public class ArcherFactory extends CharacterFactory {

    @Override
    public GameCharacter createCharacter(String name) {
        return new Archer(name);
    }
}

