package cz.petrsumbal.objects.pokemons;

import cz.petrsumbal.objects.Pokemon;
import cz.petrsumbal.objects.moves.chargedmoves.*;
import cz.petrsumbal.objects.moves.fastmoves.*;
import cz.petrsumbal.objects.types.Dragon;
import cz.petrsumbal.objects.types.Ghost;
import cz.petrsumbal.objects.types.Psychic;
import cz.petrsumbal.objects.types.Type;

public class Mewtwo extends Pokemon {

    private String name = "mewtwo";

    private final int attack = setAttack(300);
    private final int defence = setDefence(182);
    private final int stamina = setStamina(214);
    private final int hp = setHp(180);
    private final int cp = calculateCP(attack,defence,stamina);

    private FastMove[] fastMoves = new FastMove[] {new PsychoCut(), new Confusion()};
    private ChargedMove[] chargedMoves = new ChargedMove[] {new Flamethrower(), new IceBeam(), new ThunderBolt(),
            new cz.petrsumbal.objects.moves.chargedmoves.Psychic(), new FocusBlast(), new ShadowBall(),
            new HyperBeam(), new Psystrike()};

    private final Type type1 = setType1(new Psychic());
    private final Type type2 = setType2(new Psychic());

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
