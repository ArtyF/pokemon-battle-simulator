package cz.petrsumbal.objects.moves.chargedmoves;

import cz.petrsumbal.objects.types.Fire;
import cz.petrsumbal.objects.types.Type;

public class FirePunch extends ChargedMove {
    private String name = "fire punch";
    private Type type = setType(new Fire());
    private int power = setPower(55);
    private int energy = setEnergy(40);

    @Override
    public String getName() {
        return name;
    }
}
