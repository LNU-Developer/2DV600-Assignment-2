package Properties;

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
