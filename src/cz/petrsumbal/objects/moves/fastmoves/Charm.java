package cz.petrsumbal.objects.moves.fastmoves;

import cz.petrsumbal.objects.types.Fairy;
import cz.petrsumbal.objects.types.Type;

public class Charm extends FastMove {
    private String name = "charm";
    private Type type = setType(new Fairy());
    private int power = setPower(20);
    private int energy = setEnergy(11);
    private int duration = setDuration(5);

    @Override
    public String getName() {
        return name;
    }
}
