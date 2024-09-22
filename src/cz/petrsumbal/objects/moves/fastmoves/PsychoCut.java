package cz.petrsumbal.objects.moves.fastmoves;

import cz.petrsumbal.objects.types.Psychic;
import cz.petrsumbal.objects.types.Type;

public class PsychoCut extends FastMove {
    private String name = "psycho cut";
    private Type type = setType(new Psychic());
    private int power = setPower(3);
    private int energy = setEnergy(9);
    private int duration = setDuration(2);

    @Override
    public String getName() {
        return name;
    }
}
