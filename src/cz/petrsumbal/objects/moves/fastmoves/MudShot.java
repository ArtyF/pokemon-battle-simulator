package cz.petrsumbal.objects.moves.fastmoves;

import cz.petrsumbal.objects.types.Ground;
import cz.petrsumbal.objects.types.Type;

public class MudShot extends FastMove {
    private String name = "mud shot";
    private Type type = setType(new Ground());
    private int power = setPower(3);
    private int energy = setEnergy(9);
    private int duration = setDuration(2);

    @Override
    public String getName() {
        return name;
    }
}
