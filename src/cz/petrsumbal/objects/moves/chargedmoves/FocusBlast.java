package cz.petrsumbal.objects.moves.chargedmoves;

import cz.petrsumbal.objects.types.Fighting;
import cz.petrsumbal.objects.types.Type;

public class FocusBlast extends ChargedMove {
    private String name = "focus blast";
    private Type type = setType(new Fighting());
    private int power = setPower(150);
    private int energy = setEnergy(75);

    @Override
    public String getName() {
        return name;
    }
}
