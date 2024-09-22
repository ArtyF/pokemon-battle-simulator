package cz.petrsumbal.objects.moves.chargedmoves;

import cz.petrsumbal.objects.types.Grass;
import cz.petrsumbal.objects.types.Type;

public class SolarBeam extends ChargedMove {
    private String name = "solar beam";
    private Type type = setType(new Grass());
    private int power = setPower(150);
    private int energy = setEnergy(80);

    @Override
    public String getName() {
        return name;
    }
}
