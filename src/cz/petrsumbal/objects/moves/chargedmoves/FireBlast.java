package cz.petrsumbal.objects.moves.chargedmoves;

import cz.petrsumbal.objects.types.Fire;
import cz.petrsumbal.objects.types.Type;

public class FireBlast extends ChargedMove {
    private String name = "fire blast";
    private Type type = setType(new Fire());
    private int power = setPower(140);
    private int energy = setEnergy(80);

    @Override
    public String getName() {
        return name;
    }
}
