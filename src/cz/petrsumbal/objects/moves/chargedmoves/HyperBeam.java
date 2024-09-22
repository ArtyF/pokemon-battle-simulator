package cz.petrsumbal.objects.moves.chargedmoves;

import cz.petrsumbal.objects.types.Normal;
import cz.petrsumbal.objects.types.Type;

public class HyperBeam extends ChargedMove {
    private String name = "hyper beam";
    private Type type = setType(new Normal());
    private int power = setPower(150);
    private int energy = setEnergy(80);

    @Override
    public String getName() {
        return name;
    }
}
