package cz.petrsumbal.objects.types;

public class Fairy extends Type {
    private String name = "fairy";
    private String[] notVeryEffective = new String[] {"poison", "steel", "fire"};
    private String[] superEffective = new String[] {"fighting", "dragon", "dark"};
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
