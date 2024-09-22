package cz.petrsumbal.objects.moves.chargedmoves;

import cz.petrsumbal.objects.types.Ghost;
import cz.petrsumbal.objects.types.Type;

public class OminousWind extends ChargedMove {
    private String name = "ominous wind";
    private Type type = setType(new Ghost());
    private int power = setPower(50);
    private int energy = setEnergy(40);

    @Override
    public String getName() {
        return name;
    }
}
