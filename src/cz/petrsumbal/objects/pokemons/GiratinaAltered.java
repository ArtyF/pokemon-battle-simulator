package cz.petrsumbal.objects.pokemons;

import cz.petrsumbal.objects.Pokemon;
import cz.petrsumbal.objects.moves.chargedmoves.AncientPower;
import cz.petrsumbal.objects.moves.chargedmoves.ChargedMove;
import cz.petrsumbal.objects.moves.chargedmoves.DragonClaw;
import cz.petrsumbal.objects.moves.chargedmoves.ShadowSneak;
import cz.petrsumbal.objects.moves.fastmoves.DragonBreath;
import cz.petrsumbal.objects.moves.fastmoves.FastMove;
import cz.petrsumbal.objects.moves.fastmoves.ShadowClaw;
import cz.petrsumbal.objects.types.Ghost;
import cz.petrsumbal.objects.types.Dragon;
import cz.petrsumbal.objects.types.Type;

public class GiratinaAltered extends Pokemon {
    public GiratinaAltered() {
        this.name = "giratina altered";
    }
    private String name;

    //private String name = "giratina altered";

    private final int attack = setAttack(187);
    private final int defence = setDefence(225);
    private final int stamina = setStamina(284);
    private final int hp = setHp(236);
    private final int cp = calculateCP(attack,defence,stamina);

    private FastMove[] fastMoves = new FastMove[] {new DragonBreath(), new ShadowClaw()};
    private ChargedMove[] chargedMoves = new ChargedMove[] {new DragonClaw(), new ShadowSneak(), new AncientPower()};

    private final Type type1 = setType1(new Dragon());
    private final Type type2 = setType2(new Ghost());

    /*
    @Override
    public String getName() {
        return name;
    }

     */

    @Override
    public FastMove[] getFastMoves() {
        return fastMoves;
    }

    @Override
    public ChargedMove[] getChargedMoves() {
        return chargedMoves;
    }
}

