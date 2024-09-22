package cz.petrsumbal.objects.types;

public class Psychic extends Type {
    private String name = "psychic";
    private String[] notVeryEffective = new String[] {"steel", "psychic"};
    private String[] superEffective = new String[] {"fighting", "poison"};
    private String[] immunity = new String[] {"dark"};

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
