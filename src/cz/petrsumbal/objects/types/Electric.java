package cz.petrsumbal.objects.types;

public class Electric extends Type {
    private String name = "electric";
    private String[] notVeryEffective = new String[] {"grass", "electric", "dragon"};
    private String[] superEffective = new String[] {"flying", "watter"};
    private String[] immunity = new String[] {"ground"};

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
