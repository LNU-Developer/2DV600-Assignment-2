package Properties;

public class Attributes {
    int strength;
    int agility;
    int intelligence;
    int wisdom;

    public Attributes(int strength, int agility, int intelligence, int wisdom) {
        this.strength = (strength > 0) ? strength : 1;
        this.agility = (agility > 0) ? agility : 1;
        this.intelligence = (intelligence > 0) ? intelligence : 1;
        this.wisdom = (wisdom > 0) ? wisdom : 1;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

}