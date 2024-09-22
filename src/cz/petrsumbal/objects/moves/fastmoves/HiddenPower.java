package cz.petrsumbal.objects.moves.fastmoves;

import cz.petrsumbal.objects.types.Normal;
import cz.petrsumbal.objects.types.Type;

public class HiddenPower extends FastMove {
    private String name = "hidden power";
    private Type type = setType(new Normal());
    private int power = setPower(9);
    private int energy = setEnergy(8);
    private int duration = setDuration(3);

    @Override
    public String getName() {
        return name;
    }
}
