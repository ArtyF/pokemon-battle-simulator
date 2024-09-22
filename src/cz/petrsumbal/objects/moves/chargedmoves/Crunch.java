package cz.petrsumbal.objects.moves.chargedmoves;

import cz.petrsumbal.objects.types.Dark;
import cz.petrsumbal.objects.types.Type;

public class Crunch extends ChargedMove {
    private String name = "crunch";
    private Type type = setType(new Dark());
    private int power = setPower(70);
    private int energy = setEnergy(45);

    @Override
    public String getName() {
        return name;
    }
}
