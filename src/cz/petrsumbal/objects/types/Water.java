package cz.petrsumbal.objects.types;

public class Water extends Type {
    private String name = "water";
    private String[] notVeryEffective = new String[] {"water", "grass", "dragon"};
    private String[] superEffective = new String[] {"ground", "rock", "fire"};
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
