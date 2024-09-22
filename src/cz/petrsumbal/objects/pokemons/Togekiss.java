package cz.petrsumbal.objects.pokemons;

import cz.petrsumbal.objects.Pokemon;
import cz.petrsumbal.objects.moves.chargedmoves.*;
import cz.petrsumbal.objects.moves.fastmoves.*;
import cz.petrsumbal.objects.types.*;

public class Togekiss extends Pokemon {

    private String name = "togekiss";

    private final int attack = setAttack(225);
    private final int defence = setDefence(217);
    private final int stamina = setStamina(198);
    private final int hp = setHp(168);
    private final int cp = calculateCP(attack,defence,stamina);


    private FastMove[] fastMoves = new FastMove[] {new AirSlash(), new HiddenPower(), new Charm()};
    private ChargedMove[] chargedMoves = new ChargedMove[] {new AerialAce(), new AncientPower(), new DazzlingGleam(),
            new Flamethrower()};

    private final Type type1 = setType1(new Fairy());
    private final Type type2 = setType2(new Flying());

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
