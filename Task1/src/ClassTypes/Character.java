
/*
* Date: 2021-09-24.
* File Name: Character.Java
* Author: Rickard Marjanovic
*
*/

package ClassTypes;

import Properties.*;
import java.util.List;

/**
 * Class Description: An abstract class to help with the creattion/handling of
 * all classes
 *
 * @version 1, 2021-09-24
 * @author Rickard Marjanovic
 */
public abstract class Character {
    public String name;
    String className;
    int level;
    int primaryAttribute;
    Attributes attributes;

    public Character(String name, int level, int strength, int agility, int intelligence, int wisdom) {
        this.name = name;
        this.level = level;
        this.attributes = new Attributes(strength, agility, intelligence, wisdom);
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public int getLevel() {
        return level;
    }

    public abstract int getPrimaryAttribute(); // Made the method abstract to simplify the implementation, since I feel
                                               // that primary attribute should be the responsibility of the specific
                                               // class class and not the main class.

    public abstract List<Spell> getKnownSpells(); // Made these abstract methods to support the generic use of Character
                                                  // in the battle class. This will also support
                                                  // multi-classing/dual-classing if the software is to be expanded
                                                  // further

    public abstract List<Ability> getKnownAbilities(); // Made these abstract methods to support the generic use of
                                                       // Character in the battle class. This will also support
                                                       // multi-classing/dual-classing if the software is to be expanded
                                                       // further
}
