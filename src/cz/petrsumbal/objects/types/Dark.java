package cz.petrsumbal.objects.types;

public class Dark extends Type {
    private String name = "dark";
    private String[] notVeryEffective = new String[] {"fighting", "dark", "fairy"};
    private String[] superEffective = new String[] {"ghost", "psychic"};
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
