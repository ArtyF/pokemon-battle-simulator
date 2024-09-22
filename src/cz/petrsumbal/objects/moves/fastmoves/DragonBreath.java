package cz.petrsumbal.objects.moves.fastmoves;

import cz.petrsumbal.objects.types.Dragon;
import cz.petrsumbal.objects.types.Type;

public class DragonBreath extends FastMove {

    private String name = "dragon breath";
    private Type type = setType(new Dragon());
    private int power = setPower(4);
    private int energy = setEnergy(3);
    private int duration = setDuration(1);

    @Override
    public String getName() {
        return name;
    }
}
