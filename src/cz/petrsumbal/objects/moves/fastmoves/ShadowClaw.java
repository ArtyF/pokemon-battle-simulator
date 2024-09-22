package cz.petrsumbal.objects.moves.fastmoves;

import cz.petrsumbal.objects.types.Ghost;
import cz.petrsumbal.objects.types.Type;

public class ShadowClaw extends FastMove {
    private String name = "shadow claw";
    private Type type = setType(new Ghost());
    private int power = setPower(6);
    private int energy = setEnergy(8);
    private int duration = setDuration(2);

    @Override
    public String getName() {
        return name;
    }
}
