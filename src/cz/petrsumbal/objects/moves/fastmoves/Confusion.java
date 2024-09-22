package cz.petrsumbal.objects.moves.fastmoves;

import cz.petrsumbal.objects.types.Psychic;
import cz.petrsumbal.objects.types.Type;

public class Confusion extends FastMove {
    private String name = "confusion";
    private Type type = setType(new Psychic());
    private int power = setPower(16);
    private int energy = setEnergy(12);
    private int duration = setDuration(4);

    @Override
    public String getName() {
        return name;
    }
}
