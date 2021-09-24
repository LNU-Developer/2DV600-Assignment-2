
/*
* Date: 2021-09-24.
* File Name: Cleric.Java
* Author: Rickard Marjanovic
*
*/

package ClassTypes;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import Properties.*;

/**
 * Class Description: A class to create/handle the Cleric class
 *
 * @version 1, 2021-09-24
 * @author Rickard Marjanovic
 */
public class Cleric extends Character {
    List<Spell> spells = new ArrayList<Spell>();
    List<String> allowedSchools = Arrays.asList("restoration", "divination");

    public Cleric(String name, int level, int strength, int agility, int intelligence, int wisdom) {
        super(name, level, strength, agility, intelligence, wisdom);
        this.className = this.getClass().getSimpleName();
    }

    public void learnSpell(Spell spell) {
        if (allowedSchools.stream().anyMatch(p -> p.equals(spell.getSchool())))
            spells.add(spell);
    }

    public List<Spell> getKnownSpells() {
        return spells;
    }

    public List<Ability> getKnownAbilities() {
        return new ArrayList<Ability>();
    }

    public int getPrimaryAttribute() {
        return attributes.getWisdom();
    }
}
