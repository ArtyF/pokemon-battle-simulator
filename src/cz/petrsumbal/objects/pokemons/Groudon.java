package cz.petrsumbal.objects.pokemons;

import cz.petrsumbal.objects.Pokemon;
import cz.petrsumbal.objects.moves.chargedmoves.*;
import cz.petrsumbal.objects.moves.fastmoves.*;
import cz.petrsumbal.objects.types.Ground;
import cz.petrsumbal.objects.types.Type;

public class Groudon extends Pokemon {

    private String name = "groudon";

    private final int attack = setAttack(270);
    private final int defence = setDefence(228);
    private final int stamina = setStamina(205);
    private final int hp = setHp(173);
    private final int cp = calculateCP(attack,defence,stamina);

    private FastMove[] fastMoves = new FastMove[] {new MudShot(), new DragonTail()};
    private ChargedMove[] chargedMoves = new ChargedMove[] {new Earthquake(), new FireBlast(), new SolarBeam(), new FirePunch()};

    private final Type type1 = setType1(new Ground());
    private final Type type2 = setType2(new Ground());

    @Override
    public String getName() {
        return name;
    }

    @Override
    public FastMove[] getFastMoves() {
        return fastMoves;
    }

    @Override
    public ChargedMove[] getChargedMoves() {
        return chargedMoves;
    }
}
