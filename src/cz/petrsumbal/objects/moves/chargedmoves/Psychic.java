package cz.petrsumbal.objects.moves.chargedmoves;

import cz.petrsumbal.objects.types.Type;

public class Psychic extends ChargedMove {
    private String name = "psychic";
    private Type type = setType(new cz.petrsumbal.objects.types.Psychic());
    private int power = setPower(100);
    private int energy = setEnergy(70);

    @Override
    public String getName() {
        return name;
    }
}
