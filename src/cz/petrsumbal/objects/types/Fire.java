package cz.petrsumbal.objects.types;

public class Fire extends Type {
    private String name = "fire";
    private String[] notVeryEffective = new String[] {"rock", "fire", "water", "dragon"};
    private String[] superEffective = new String[] {"bug", "steel", "grass", "ice"};
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
