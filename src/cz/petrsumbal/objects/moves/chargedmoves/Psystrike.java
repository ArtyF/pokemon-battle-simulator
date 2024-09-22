package cz.petrsumbal.objects.moves.chargedmoves;

import cz.petrsumbal.objects.types.Psychic;
import cz.petrsumbal.objects.types.Type;

public class Psystrike extends ChargedMove {
    private String name = "psystrike";
    private Type type = setType(new Psychic());
    private int power = setPower(100);
    private int energy = setEnergy(55);

    @Override
    public String getName() {
        return name;
    }
}
