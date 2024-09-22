package cz.petrsumbal.objects.moves.chargedmoves;

import cz.petrsumbal.objects.types.Electric;
import cz.petrsumbal.objects.types.Type;

public class WildCharge extends ChargedMove {
    private String name = "wild charge";
    private Type type = setType(new Electric());
    private int power = setPower(90);
    private int energy = setEnergy(50);

    @Override
    public String getName() {
        return name;
    }
}
