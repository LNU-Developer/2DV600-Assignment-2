
import ClassTypes.*;
import ClassTypes.Character;

public class Battle {
    public static void printStatistics(Character party[]) {
        System.out.println("The average level of the party is: " + calculateAverageLevelOfParty(party));
        System.out.println("The total number of spells of the party is: " + calculateNumberOfSpellsOfParty(party));
        System.out.println("The total number of Cleric spells of the party is "
                + calculateNumberOfSpecificSkillsOfParty(party, Cleric.class));
        System.out.println("The total number of Mage spells of the party is "
                + calculateNumberOfSpecificSkillsOfParty(party, Mage.class));
        System.out
                .println("The total number of abilities of the party is: " + calculateNumberOfAbilitiesOfParty(party));
        System.out.println("The total number of Warrior abilities of the party is "
                + calculateNumberOfSpecificSkillsOfParty(party, Warrior.class));
        System.out.println("The total number of Rogue abilities of the party is "
                + calculateNumberOfSpecificSkillsOfParty(party, Rogue.class));
    }

    public static Character[] resolve(Character[] party1, Character[] party2) {
        if (party1.length > party2.length)
            return party1;
        if (party2.length > party1.length)
            return party2;
        if (calculateAverageLevelOfParty(party1) > calculateAverageLevelOfParty(party2))
            return party1;
        if (calculateAverageLevelOfParty(party2) > calculateAverageLevelOfParty(party1))
            return party2;
        if (calculateTotalSumOfPrimaryAttributes(party1) > calculateTotalSumOfPrimaryAttributes(party2))
            return party1;
        if (calculateTotalSumOfPrimaryAttributes(party2) > calculateTotalSumOfPrimaryAttributes(party1))
            return party2;
        return null;
    }

    public static Character singleCombat(Character character1, Character character2) {
        if (character1.getClassName() != character2.getClassName()) // If they are not the same class I'm forcing a tie.
                                                                    // However one could argue that my skills as a rogue
                                                                    // would trumpf e.g. a mages skills if I have higher
                                                                    // attributres. If this is desired, simply remove
                                                                    // this if clause.
            return null;

        if (character1.getLevel() > character2.getLevel())
            return character1;
        if (character2.getLevel() > character1.getLevel())
            return character2;
        if (character1.getPrimaryAttribute() > character2.getPrimaryAttribute())
            return character1;
        if (character2.getPrimaryAttribute() > character1.getPrimaryAttribute())
            return character2;
        if (character1.getKnownAbilities().size() > character2.getKnownAbilities().size()
                || character1.getKnownSpells().size() > character2.getKnownSpells().size())
            return character1;
        if (character2.getKnownAbilities().size() > character1.getKnownAbilities().size()
                || character2.getKnownSpells().size() > character1.getKnownSpells().size())
            return character2;
        return null;
    }

    public static int calculateAverageLevelOfParty(Character[] party) {
        int sum = 0;
        int arrayLength = party.length;
        for (Character character : party) {
            sum += character.getLevel();
        }
        return sum / arrayLength;
    }

    public static int calculateNumberOfSpellsOfParty(Character[] party) {
        int sum = 0;
        for (Character character : party) {
            sum += character.getKnownSpells().size();
        }
        return sum;
    }

    public static int calculateNumberOfAbilitiesOfParty(Character[] party) {
        int sum = 0;
        for (Character character : party) {
            sum += character.getKnownAbilities().size();
        }
        return sum;
    }

    public static int calculateNumberOfSpecificSkillsOfParty(Character[] party, Class<? extends Character> T) {
        int sum = 0;
        for (Character character : party) {
            if (character.getClassName() == T.getSimpleName())
                sum += character.getKnownSpells().size() + character.getKnownAbilities().size();
        }
        return sum;
    }

    public static int calculateTotalSumOfPrimaryAttributes(Character[] party) {
        int sum = 0;
        for (Character character : party) {
            sum += character.getPrimaryAttribute();
        }
        return sum;
    }
}
