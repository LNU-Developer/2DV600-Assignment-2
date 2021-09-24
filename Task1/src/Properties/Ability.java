
/*
* Date: 2021-09-24.
* File Name: Ability.Java
* Author: Rickard Marjanovic
*
*/

package Properties;

/**
 * Class Description: A class to create/handle an ability
 *
 * @version 1, 2021-09-24
 * @author Rickard Marjanovic
 */
public class Ability {
    String name;
    String proficiency;

    public Ability(String name, String proficiency) {
        this.name = name;
        this.proficiency = proficiency;
    }

    public String getName() {
        return name;
    }

    public String getProficiency() {
        return proficiency;
    }
}
