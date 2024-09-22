package cz.petrsumbal.objects.moves.chargedmoves;

import cz.petrsumbal.objects.types.Fairy;
import cz.petrsumbal.objects.types.Type;

public class DazzlingGleam extends ChargedMove {
    private String name = "dazzling gleam";
    private Type type = setType(new Fairy());
    private int power = setPower(110);
    private int energy = setEnergy(70);

    @Override
    public String getName() {
        return name;
    }
}
