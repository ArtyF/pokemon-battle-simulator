package cz.petrsumbal.objects.moves.chargedmoves;

import cz.petrsumbal.objects.types.Fire;
import cz.petrsumbal.objects.types.Type;

public class Flamethrower extends ChargedMove {
    private String name = "flamethrower";
    private Type type = setType(new Fire());
    private int power = setPower(90);
    private int energy = setEnergy(65);

    @Override
    public String getName() {
        return name;
    }
}
