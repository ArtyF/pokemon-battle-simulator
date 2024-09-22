package cz.petrsumbal.objects.types;

public class Fighting extends Type {
    private String name = "fighting";
    private String[] notVeryEffective = new String[] {"flying", "poison", "bug", "psychic", "fairy"};
    private String[] superEffective = new String[] {"normal", "rock", "steel", "ice", "dark"};
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
