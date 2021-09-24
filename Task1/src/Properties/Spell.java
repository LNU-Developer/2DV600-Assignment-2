
/*
* Date: 2021-09-24.
* File Name: Spell.Java
* Author: Rickard Marjanovic
*
*/

package Properties;

/**
 * Class Description: A class to create/handle a spell
 *
 * @version 1, 2021-09-24
 * @author Rickard Marjanovic
 */
public class Spell {
    String name;
    String school;

    public Spell(String name, String school) {
        this.name = name;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }
}
