package cz.petrsumbal.objects.moves.chargedmoves;

import cz.petrsumbal.objects.types.Ghost;
import cz.petrsumbal.objects.types.Type;

public class ShadowSneak extends ChargedMove {
    private String name = "shadow sneak";
    private Type type = setType(new Ghost());
    private int power = setPower(50);
    private int energy = setEnergy(45);

    @Override
    public String getName() {
        return name;
    }
}
