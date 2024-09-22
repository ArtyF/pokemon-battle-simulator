package cz.petrsumbal.objects.types;

public class Grass extends Type {
    private String name = "grass";
    private String[] notVeryEffective = new String[] {"flying", "poison", "bug", "steel", "fire", "grass", "dragon"};
    private String[] superEffective = new String[] {"ground", "rock", "water"};
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
