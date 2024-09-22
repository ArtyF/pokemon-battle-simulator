package cz.petrsumbal.objects.moves.chargedmoves;

import cz.petrsumbal.objects.types.Ground;
import cz.petrsumbal.objects.types.Type;

public class Earthquake extends ChargedMove {
    private String name = "earthquake";
    private Type type = setType(new Ground());
    private int power = setPower(120);
    private int energy = setEnergy(65);

    @Override
    public String getName() {
        return name;
    }
}
