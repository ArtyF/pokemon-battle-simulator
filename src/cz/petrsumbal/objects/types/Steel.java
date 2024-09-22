package cz.petrsumbal.objects.types;

public class Steel extends Type {
    private String name = "steel";
    private String[] notVeryEffective = new String[] {"steel", "fire", "water", "electric"};
    private String[] superEffective = new String[] {"rock", "ice", "fairy"};
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
