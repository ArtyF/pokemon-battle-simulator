package cz.petrsumbal.objects.moves.chargedmoves;

import cz.petrsumbal.objects.types.Steel;
import cz.petrsumbal.objects.types.Type;

public class FlashCannon extends ChargedMove {
    private String name = "flash cannon";
    private Type type = setType(new Steel());
    private int power = setPower(110);
    private int energy = setEnergy(65);

    @Override
    public String getName() {
        return name;
    }
}
