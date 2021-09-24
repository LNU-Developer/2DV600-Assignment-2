/*
* Date: 2021-09-24.
* File Name: App.Java
* Author: Rickard Marjanovic
*
*/

import ClassTypes.*;
import ClassTypes.Character;
import Properties.Ability;

/**
 * Class Description: The main class to run the program
 *
 * @version 1, 2021-09-24
 * @author Rickard Marjanovic
 */
public class App {
    public static void main(String args[]) {
        System.out.println("Example battle below: ");
        Rogue test = new Rogue("Drizzt", 85, 10, 10, 10, 5);
        test.learnAbility(new Ability("Dodge", "acrobatics"));
        test.learnAbility(new Ability("Heal", "restoration"));
        Rogue test2 = new Rogue("Kathelee", 85, 10, 10, 10, 5);

        Rogue test3 = new Rogue("Skie Silvershield", 85, 10, 5, 10, 5);
        Character[] testList = new Character[] { test, test2 };
        Character[] testList2 = new Character[] { test, test3 };

        Battle.printStatistics(testList);
        Battle.printStatistics(testList2);

        System.out.println(Battle.singleCombat(test, test2));
    }
}
