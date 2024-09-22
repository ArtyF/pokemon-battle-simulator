package cz.petrsumbal.objects.moves.chargedmoves;

import cz.petrsumbal.objects.types.Flying;
import cz.petrsumbal.objects.types.Type;

public class AerialAce extends ChargedMove {
    private String name = "aerial ace";
    private Type type = setType(new Flying());
    private int power = setPower(55);
    private int energy = setEnergy(45);

    @Override
    public String getName() {
        return name;
    }
}
