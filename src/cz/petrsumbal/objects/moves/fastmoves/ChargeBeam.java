package cz.petrsumbal.objects.moves.fastmoves;

import cz.petrsumbal.objects.types.Electric;
import cz.petrsumbal.objects.types.Type;

public class ChargeBeam extends FastMove {
    private String name = "charge beam";
    private Type type = setType(new Electric());
    private int power = setPower(5);
    private int energy = setEnergy(11);
    private int duration = setDuration(3);

    @Override
    public String getName() {
        return name;
    }
}
