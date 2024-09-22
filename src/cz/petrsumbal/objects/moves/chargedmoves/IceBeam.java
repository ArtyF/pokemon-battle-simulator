package cz.petrsumbal.objects.moves.chargedmoves;

import cz.petrsumbal.objects.types.Ice;
import cz.petrsumbal.objects.types.Type;

public class IceBeam extends ChargedMove {
    private String name = "ice beam";
    private Type type = setType(new Ice());
    private int power = setPower(90);
    private int energy = setEnergy(55);

    @Override
    public String getName() {
        return name;
    }
}
