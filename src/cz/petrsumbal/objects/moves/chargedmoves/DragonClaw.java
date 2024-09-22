package cz.petrsumbal.objects.moves.chargedmoves;

import cz.petrsumbal.objects.types.Dragon;
import cz.petrsumbal.objects.types.Type;

public class DragonClaw extends ChargedMove {
    private String name = "dragon claw";
    private Type type = setType(new Dragon());
    private int power = setPower(50);
    private int energy = setEnergy(35);

    @Override
    public String getName() {
        return name;
    }
}
