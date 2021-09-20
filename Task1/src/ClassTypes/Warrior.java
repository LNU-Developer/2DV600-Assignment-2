package ClassTypes;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import Properties.*;

public class Warrior extends Character {
    List<Ability> abilities = new ArrayList<Ability>();
    List<String> allowedProficiencies = Arrays.asList("athletics", "survival");

    public Warrior(String name, int level, int strength, int agility, int intelligence, int wisdom) {
        super(name, level, strength, agility, intelligence, wisdom);
        this.className = this.getClass().getSimpleName();
    }

    public void learnAbility(Ability ability) {
        if (allowedProficiencies.stream().anyMatch(p -> p.equals(ability.getProficiency())))
            abilities.add(ability);
    }

    public List<Ability> getKnownAbilities() {
        return abilities;
    }

    public List<Spell> getKnownSpells() {
        return new ArrayList<Spell>();
    }

    public int getPrimaryAttribute() {
        return attributes.getStrength();
    }
}
