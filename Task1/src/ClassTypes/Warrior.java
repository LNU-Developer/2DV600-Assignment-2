
/*
* Date: 2021-09-24.
* File Name: Warrior.Java
* Author: Rickard Marjanovic
*
*/

package ClassTypes;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import Properties.*;

/**
 * Class Description: A class to create/handle the warrior class
 *
 * @version 1, 2021-09-24
 * @author Rickard Marjanovic
 */
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
