package cz.petrsumbal.objects.types;

public class Ice extends Type {
    private String name = "ice";
    private String[] notVeryEffective = new String[] {"steel", "fire", "water", "ice"};
    private String[] superEffective = new String[] {"flying", "ground", "grass", "dragon"};
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
