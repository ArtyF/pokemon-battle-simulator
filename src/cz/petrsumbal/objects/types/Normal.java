package cz.petrsumbal.objects.types;

public class Normal extends Type {
    private String name = "normal";
    private String[] notVeryEffective = new String[] {"rock", "steel"};
    private String[] superEffective = new String[] {};
    private String[] immunity = new String[] {"ghost"};

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
