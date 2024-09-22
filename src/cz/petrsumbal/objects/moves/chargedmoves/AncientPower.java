package cz.petrsumbal.objects.moves.chargedmoves;

import cz.petrsumbal.objects.types.Rock;
import cz.petrsumbal.objects.types.Type;

public class AncientPower extends ChargedMove {
    private String name = "ancient power";
    private Type type = setType(new Rock());
    private int power = setPower(70);
    private int energy = setEnergy(45);

    @Override
    public String getName() {
        return name;
    }
}
