package cz.petrsumbal.objects.moves.chargedmoves;

import cz.petrsumbal.objects.types.Type;

public abstract class ChargedMove {

    private String name;
    private Type type;
    private int power; //the amount of damage a move deals
    private int energy; //the amount of energy a move uses

    public String getName() {
        return name;
    }

    public Type setType(Type type) {
        this.type = type;
        return type;
    }

    public Type getType() {
        return type;
    }

    public int getPower() {
        return power;
    }

    public int setPower(int power) {
        this.power = power;
        return power;
    }

    public int getEnergy() {
        return energy;
    }

    public int setEnergy(int energy) {
        this.energy = energy;
        return energy;
    }
}
