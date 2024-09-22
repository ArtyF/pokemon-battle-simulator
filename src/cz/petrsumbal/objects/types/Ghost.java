package cz.petrsumbal.objects.types;

import cz.petrsumbal.objects.types.Type;

public class Ghost extends Type {
    private String name = "ghost";
    private String[] notVeryEffective = new String[] {"dark"};
    private String[] superEffective = new String[] {"ghost", "psychic"};
    private String[] immunity = new String[] {"normal"};


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
