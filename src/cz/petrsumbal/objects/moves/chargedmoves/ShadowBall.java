package cz.petrsumbal.objects.moves.chargedmoves;

import cz.petrsumbal.objects.types.Ghost;
import cz.petrsumbal.objects.types.Type;

public class ShadowBall extends ChargedMove {
    private String name = "shadow ball";
    private Type type = setType(new Ghost());
    private int power = setPower(100);
    private int energy = setEnergy(55);

    @Override
    public String getName() {
        return name;
    }
}
