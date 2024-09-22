package cz.petrsumbal.objects.types;

public class Rock extends Type {
    private String name = "rock";
    private String[] notVeryEffective = new String[] {"fighting", "ground", "steel"};
    private String[] superEffective = new String[] {"flying", "bug", "fire", "ice"};
    private String[] immunity = new String[] {};

    public String getName() {
        return name;
    }

    public String[] getNotVeryEffective() {
        return notVeryEffective;
    }

    public String[] getSuperEffective() {
        return superEffective;
    }

    public String[] getImmunity() {
        return immunity;
    }
}
