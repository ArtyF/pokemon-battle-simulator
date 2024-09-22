package cz.petrsumbal.objects;

import cz.petrsumbal.objects.moves.chargedmoves.ChargedMove;
import cz.petrsumbal.objects.moves.fastmoves.FastMove;
import cz.petrsumbal.objects.types.Type;

import java.util.Arrays;

public abstract class Pokemon {
    private String name;

    private int attack;
    private int defence;
    private int stamina;
    private int hp;

    private FastMove[] fastMoves;
    private int usingFastMove = -1;

    private ChargedMove[] chargedMoves;
    private int usingChargeMove1 = -1;
    private int UsingChargeMove2 = -1;

    private int chargedMoveEnergy;

    private Type type1;
    private Type type2;

    public int getFastMovesCount() {
        return fastMoves.length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType1() {
        return type1;
    }

    public Type setType1(Type type1) {
        this.type1 = type1;
        return type1;
    }

    public Type getType2() {
        return type2;
    }

    public Type setType2(Type type2) {
        this.type2 = type2;
        return type2;
    }

    public FastMove[] getFastMoves() {
        return fastMoves;
    }

    public void setFastMoves(FastMove[] fastMoves) {
        this.fastMoves = fastMoves;
    }

    public int getUsingFastMove() {
        return usingFastMove;
    }

    public void setUsingFastMove(int usingFastMove) {
        this.usingFastMove = usingFastMove;
    }

    public ChargedMove[] getChargedMoves() {
        return chargedMoves;
    }

    public void setChargedmoves(ChargedMove[] chargedmoves) {
        this.chargedMoves = chargedmoves;
    }


    public int getUsingChargeMove1() {
        return usingChargeMove1;
    }

    public void setUsingChargeMove1(int usingChargeMove1) {
        this.usingChargeMove1 = usingChargeMove1;
    }

    public int getUsingChargeMove2() {
        return UsingChargeMove2;
    }

    public void setUsingChargeMove2(int usingChargeMove2) {
        UsingChargeMove2 = usingChargeMove2;
    }

    public int getChargedMoveEnergy() {
        return chargedMoveEnergy;
    }

    public void setChargedMoveEnergy(int chargedMoveEnergy) {
        this.chargedMoveEnergy = chargedMoveEnergy;
    }

    public void attackCharged(Pokemon pokemonAttacking, Pokemon pokemon, ChargedMove chargedMove) {
        double attackCoeficient = 1;
        double stab = 1;
        if (Arrays.asList(chargedMove.getType().getNotVeryEffective()).contains(pokemon.getType1().getName())) {
            System.out.println(chargedMove.getName() + " is not very effective againt " + pokemon.getType1().getName());
            attackCoeficient *= 0.625;
        }
        if (Arrays.asList(chargedMove.getType().getNotVeryEffective()).contains(pokemon.getType2().getName())) {
            System.out.println(chargedMove.getName() + " is not very effective againt " + pokemon.getType2().getName());
            attackCoeficient *= 0.625;
        }
        if (Arrays.asList(chargedMove.getType().getSuperEffective()).contains(pokemon.getType1().getName())) {
            System.out.println(chargedMove.getName() + " is super effective againt " + pokemon.getType1().getName());
            attackCoeficient *= 1.6;
        }
        if (Arrays.asList(chargedMove.getType().getSuperEffective()).contains(pokemon.getType2().getName())) {
            System.out.println(chargedMove.getName() + " is super effective againt " + pokemon.getType2().getName());
            attackCoeficient *= 1.6;
        }
        if (Arrays.asList(chargedMove.getType().getImmunity()).contains(pokemon.getType1().getName())) {
            System.out.println(pokemon.getType1().getName() + " is imunny to" + chargedMove.getName());
            attackCoeficient *= 0.39;
        }
        if (Arrays.asList(chargedMove.getType().getImmunity()).contains(pokemon.getType2().getName())) {
            System.out.println(pokemon.getType2().getName() + " is imunny to" + chargedMove.getName());
            attackCoeficient *= 0.39;
        }
        if (pokemonAttacking.getType1().getName().equals(chargedMove.getType().getName()) || pokemonAttacking.getType2().getName().equals(chargedMove.getType().getName())) {
            System.out.println(pokemonAttacking.getName() + " get stab bonus for " + chargedMove.getName());
            stab = 1.25;
        }
        pokemon.setHp((int) (pokemon.getHp()-chargedMove.getPower()*attackCoeficient*stab));
    }

    public void attackFast(Pokemon pokemonAttacking, Pokemon pokemon, FastMove fastMove) {
        double attackCoeficient = 1;
        double stab = 1;
        if (Arrays.asList(fastMove.getType().getNotVeryEffective()).contains(pokemon.getType1().getName())) {
            System.out.println(fastMove.getName() + " is not very effective againt " + pokemon.getType1().getName());
            attackCoeficient *= 0.625;
        }
        if (Arrays.asList(fastMove.getType().getNotVeryEffective()).contains(pokemon.getType2().getName())) {
            System.out.println(fastMove.getName() + " is not very effective againt " + pokemon.getType2().getName());
            attackCoeficient *= 0.625;
        }
        if (Arrays.asList(fastMove.getType().getSuperEffective()).contains(pokemon.getType1().getName())) {
            System.out.println(fastMove.getName() + " is super effective againt " + pokemon.getType1().getName());
            attackCoeficient *= 1.6;
        }
        if (Arrays.asList(fastMove.getType().getSuperEffective()).contains(pokemon.getType2().getName())) {
            System.out.println(fastMove.getName() + " is super effective againt " + pokemon.getType2().getName());
            attackCoeficient *= 1.6;
        }
        if (Arrays.asList(fastMove.getType().getImmunity()).contains(pokemon.getType1().getName())) {
            System.out.println(fastMove.getName() + " is super effective againt " + pokemon.getType1().getName());
            attackCoeficient *= 0.39;
        }
        if (Arrays.asList(fastMove.getType().getImmunity()).contains(pokemon.getType2().getName())) {
            System.out.println(fastMove.getName() + " is super effective againt " + pokemon.getType2().getName());
            attackCoeficient *= 0.39;
        }
        if (pokemonAttacking.getType1().getName().equals(fastMove.getType().getName()) || pokemonAttacking.getType2().getName().equals(fastMove.getType().getName())) {
            System.out.println(pokemonAttacking.getName() + " get stab bonus for " + fastMove.getName());
            stab = 1.25;
        }
        pokemon.setHp((int) (pokemon.getHp()-fastMove.getPower()*attackCoeficient*stab));
    }

    public int getDefence() {
        return defence;
    }

    public int setDefence(int defence) {
        this.defence = defence;
        return defence;
    }

    public int getStamina() {
        return stamina;
    }

    public int setStamina(int stamina) {
        this.stamina = stamina;
        return stamina;
    }

    public int getHp() {
        return hp;
    }

    public int setHp(int hp) {
        this.hp = hp;
        return hp;
    }

    public int setAttack(int attack) {
        this.attack = attack;
        return attack;
    }

    public int getAttack() {
        return attack;
    }

    public int calculateCP(int attack, int defence, int stamina) {
        Double cpDouble = (attack + 15) * Math.sqrt(defence+15) * Math.sqrt(stamina+15) * Math.pow(0.7903001,2)/10;
        int cp = cpDouble.intValue();
        return cp;
    }


}
