package cz.petrsumbal.objects.types;

public class Bug extends Type {
    private String name = "bug";
    private String[] notVeryEffective = new String[] {"fighting", "flying", "poison", "ghost", "steel", "fire", "fairy"};
    private String[] superEffective = new String[] {"grass", "psychic", "dark"};
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
