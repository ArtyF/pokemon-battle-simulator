package cz.petrsumbal.objects.player;

import cz.petrsumbal.objects.Pokemon;

public class Player {
    private String name;
    private int numberOfPokemon = 0;
    private int numberofShields = 2;
    private Pokemon[] pokemons = new Pokemon[3];

    private int usingPokemon = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPokemon() {
        return numberOfPokemon;
    }

    public void setNumberOfPokemon(int numberOfPokemon) {
        this.numberOfPokemon = numberOfPokemon;
    }

    public int getNumberofShields() {
        return numberofShields;
    }

    public void setNumberofShields(int numberofShields) {
        this.numberofShields = numberofShields;
    }


    public Pokemon[] getPokemons() {
        return pokemons;
    }

    public void setPokemons(Pokemon[] pokemons) {
        this.pokemons = pokemons;
    }

    public int getUsingPokemon() {
        return usingPokemon;
    }

    public void setUsingPokemon(int usingPokemon) {
        this.usingPokemon = usingPokemon;
    }
}
