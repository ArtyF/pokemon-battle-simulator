package cz.petrsumbal.objects.types;

public class Ground extends Type {
    private String name = "ground";
    private String[] notVeryEffective = new String[] {"bug", "grass"};
    private String[] superEffective = new String[] {"poison", "rock", "steel", "fire", "electric"};
    private String[] immunity = new String[] {"flying"};

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
