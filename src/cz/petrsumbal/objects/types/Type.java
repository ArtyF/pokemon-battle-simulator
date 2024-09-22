package cz.petrsumbal.objects.types;

public abstract class Type {
    private String name;
    private String[] notVeryEffective;
    private String[] superEffective;
    private String[] immunity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getNotVeryEffective() {
        return notVeryEffective;
    }

    public void setNotVeryEffective(String[] notVeryEffective) {
        this.notVeryEffective = notVeryEffective;
    }

    public String[] getSuperEffective() {
        return superEffective;
    }

    public void setSuperEffective(String[] superEffective) {
        this.superEffective = superEffective;
    }

    public String[] getImmunity() {
        return immunity;
    }

    public void setImmuntiy(String[] immunity) {
        this.immunity = immunity;
    }
}
