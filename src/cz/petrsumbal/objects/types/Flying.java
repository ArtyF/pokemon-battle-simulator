package cz.petrsumbal.objects.types;

public class Flying extends Type {
    private String name = "flying";
    private String[] notVeryEffective = new String[] {"rock", "steel", "electric"};
    private String[] superEffective = new String[] {"fighting", "bug", "grass"};
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
