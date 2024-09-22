package cz.petrsumbal.objects.moves.fastmoves;

import cz.petrsumbal.objects.types.Type;

public abstract class FastMove {

    private String name;
    private Type type;
    private int power; //the amount of damage a move deals
    private int energy; //the amount of energy a move generates
    private int duration; //the number of turns the move lasts

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

    public int getDuration() {
        return duration;
    }

    public int setDuration(int duration) {
        this.duration = duration;
        return duration;
    }
}
