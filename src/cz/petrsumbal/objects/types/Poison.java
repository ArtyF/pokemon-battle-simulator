package cz.petrsumbal.objects.types;

public class Poison extends Type {
    private String name = "poison";
    private String[] notVeryEffective = new String[] {"poison", "ground", "rock", "ghost"};
    private String[] superEffective = new String[] {"grass", "faity"};
    private String[] immunity = new String[] {"steel"};

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
