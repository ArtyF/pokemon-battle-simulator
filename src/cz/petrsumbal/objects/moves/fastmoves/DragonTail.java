package cz.petrsumbal.objects.moves.fastmoves;

import cz.petrsumbal.objects.types.Dragon;
import cz.petrsumbal.objects.types.Type;

public class DragonTail extends FastMove {

    private String name = "dragon tail";
    private Type type = setType(new Dragon());
    private int power = setPower(9);
    private int energy = setEnergy(10);
    private int duration = setDuration(3);

    @Override
    public String getName() {
        return name;
    }
}
