package cz.petrsumbal.objects.types;

public class Dragon extends Type {
    private String name = "dragon";
    private String[] notVeryEffective = new String[] {"steel"};
    private String[] superEffective = new String[] {"dragon"};
    private String[] immunity = new String[] {"fairy"};

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
