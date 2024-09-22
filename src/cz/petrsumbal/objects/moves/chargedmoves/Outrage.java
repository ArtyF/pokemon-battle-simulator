package cz.petrsumbal.objects.moves.chargedmoves;

import cz.petrsumbal.objects.types.Dragon;
import cz.petrsumbal.objects.types.Type;

public class Outrage extends ChargedMove {
    private String name = "outrage";
    private Type type = setType(new Dragon());
    private int power = setPower(110);
    private int energy = setEnergy(60);

    @Override
    public String getName() {
        return name;
    }
}
