package cz.petrsumbal.objects.moves.fastmoves;

import cz.petrsumbal.objects.types.Flying;
import cz.petrsumbal.objects.types.Type;

public class AirSlash extends FastMove {
    private String name = "air slash";
    private Type type = setType(new Flying());
    private int power = setPower(9);
    private int energy = setEnergy(9);
    private int duration = setDuration(3);

    @Override
    public String getName() {
        return name;
    }


}
