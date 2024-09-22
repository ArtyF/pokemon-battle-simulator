package cz.petrsumbal;


import cz.petrsumbal.objects.Pokemon;
import cz.petrsumbal.objects.moves.chargedmoves.ChargedMove;
import cz.petrsumbal.objects.moves.fastmoves.FastMove;
import cz.petrsumbal.objects.player.Player;
import cz.petrsumbal.objects.pokemons.*;

import java.util.Scanner;

public class GamePlay {
    Player player1 = new Player();
    Player player2 = new Player();



    public void gamePlay() {

        System.out.println("Welcome to pokemon battle simulator.");


        System.out.println("PLAYER 1: Choose name...");
        chooseName(player1);

        System.out.println("PLAYER 2: Choose name...");
        chooseName(player2);

        choosePokemon(player1);
        for (int i = 0; i <= 2; i++) {
            chooseFastMove(player1.getPokemons()[i]);
            chooseChargedMove(player1.getPokemons()[i]);
        }

        choosePokemon(player2);
        for (int i = 0; i <= 2; i++) {
            chooseFastMove(player2.getPokemons()[i]);
            chooseChargedMove(player2.getPokemons()[i]);
        }

        //PLAYER1 pokemon and moves
        Pokemon player1Pokemon = player1.getPokemons()[player1.getUsingPokemon()];
        FastMove player1FastMove = player1Pokemon.getFastMoves()[player1Pokemon.getUsingFastMove()];
        ChargedMove player1ChargedMove1 = player1Pokemon.getChargedMoves()[player1Pokemon.getUsingChargeMove1()];
        ChargedMove player1ChargedMove2 = player1Pokemon.getChargedMoves()[player1Pokemon.getUsingChargeMove2()];

        //PLAYER2 pokemon and moves
        Pokemon player2Pokemon = player2.getPokemons()[player2.getUsingPokemon()];
        FastMove player2FastMove = player2Pokemon.getFastMoves()[player2Pokemon.getUsingFastMove()];
        ChargedMove player2ChargedMove1 = player2Pokemon.getChargedMoves()[player2Pokemon.getUsingChargeMove1()];
        ChargedMove player2ChargedMove2 = player2Pokemon.getChargedMoves()[player2Pokemon.getUsingChargeMove2()];

        int playCount = 0;
        int player1ChangeCountdown = 0;
        int player2ChangeCountdown = 0;
        while (player1.getNumberOfPokemon() > 0 && player2.getNumberOfPokemon() > 0) {


            if (player1Pokemon.getHp() <= 0) {
                System.out.println(player1.getName() + " " + player1Pokemon.getName() + " fainted. Choose another one.");

                changePokemon(player1,"E", "R", "T");

                player1Pokemon = player1.getPokemons()[player1.getUsingPokemon()];
                player1FastMove = player1Pokemon.getFastMoves()[player1Pokemon.getUsingFastMove()];
                player1ChargedMove1 = player1Pokemon.getChargedMoves()[player1Pokemon.getUsingChargeMove1()];
                player1ChargedMove2 = player1Pokemon.getChargedMoves()[player1Pokemon.getUsingChargeMove2()];
                player1.setNumberOfPokemon(player1.getNumberOfPokemon()-1);
            }

            if (player2Pokemon.getHp() <= 0) {
                System.out.println(player2.getName() + " " + player2Pokemon.getName() + " fainted. Choose another one.");

                changePokemon(player2,"O", "P", "Ú");

                player2Pokemon = player2.getPokemons()[player2.getUsingPokemon()];
                player2FastMove = player2Pokemon.getFastMoves()[player2Pokemon.getUsingFastMove()];
                player2ChargedMove1 = player2Pokemon.getChargedMoves()[player2Pokemon.getUsingChargeMove1()];
                player2ChargedMove2 = player2Pokemon.getChargedMoves()[player2Pokemon.getUsingChargeMove2()];
                player2.setNumberOfPokemon(player2.getNumberOfPokemon()-1);
            }


            //Player 1 fast attack
            if (playCount % (player1FastMove.getDuration()) == 0 || playCount == 0) {
                player1Pokemon.attackFast(player1Pokemon,player2Pokemon,player1FastMove);
                player1Pokemon.setChargedMoveEnergy(player1Pokemon.getChargedMoveEnergy() + player1FastMove.getEnergy());
            }
            //Player 1 charged attack
            if (player1Pokemon.getChargedMoveEnergy() >= player1ChargedMove1.getEnergy()) {
                System.out.println(player1Pokemon.getName() + " " + player1ChargedMove1.getName() + " is ready to go. Press A to use it.");
                Scanner scanner = new Scanner(System.in);
                String attack = scanner.nextLine();
                if (attack.equalsIgnoreCase("A")) {
                    System.out.println(player1.getName() + " is using " + player1ChargedMove1.getName());
                    if (player2.getNumberofShields() > 0) {
                        System.out.println(player2.getName() + " has " + player2.getNumberofShields() + " shield(s) left. Press U to use shield." );
                        Scanner scanner1 = new Scanner(System.in);
                        String shield = scanner1.nextLine();
                        if (shield.equalsIgnoreCase("U")) {
                            System.out.println(player2.getName() + " used his shield. No damage was deal.");
                            player2.setNumberofShields(player2.getNumberofShields()-1);
                        }
                        else {
                            player1Pokemon.attackCharged(player1Pokemon,player2Pokemon,player1ChargedMove1);
                        }
                    }
                    else {
                        System.out.println(player2.getName() + " has no shield left.");
                        player1Pokemon.attackCharged(player1Pokemon,player2Pokemon,player1ChargedMove1);
                    }
                    player1Pokemon.setChargedMoveEnergy(player1Pokemon.getChargedMoveEnergy() - player1ChargedMove1.getEnergy());
                }
            }
            if (player1Pokemon.getChargedMoveEnergy() >= player1ChargedMove2.getEnergy()) {
                System.out.println(player1Pokemon.getName() + " " + player1ChargedMove2.getName() + " is ready to go. Press S to use it.");
                Scanner scanner = new Scanner(System.in);
                String attack = scanner.nextLine();
                if (attack.equalsIgnoreCase("S")) {
                    System.out.println(player1.getName() + " is using " + player1ChargedMove2.getName());
                    if (player2.getNumberofShields() > 0) {
                        System.out.println(player2.getName() + " has " + player2.getNumberofShields() + " shield(s) left. Press U to use shield." );
                        Scanner scanner1 = new Scanner(System.in);
                        String shield = scanner1.nextLine();
                        if (shield.equalsIgnoreCase("U")) {
                            System.out.println(player2.getName() + " used his shield. No damage was deal.");
                            player2.setNumberofShields(player2.getNumberofShields()-1);
                        }
                        else {
                            player1Pokemon.attackCharged(player1Pokemon,player2Pokemon,player1ChargedMove2);
                        }
                    }
                    else {
                        System.out.println(player2.getName() + " has no shield left.");
                        player1Pokemon.attackCharged(player1Pokemon,player2Pokemon,player1ChargedMove2);
                    }
                    player1Pokemon.setChargedMoveEnergy(player1Pokemon.getChargedMoveEnergy() - player1ChargedMove2.getEnergy());
                }
            }

            //Player 2 fast attack
            if (playCount % (player2FastMove.getDuration()) == 0 || playCount == 0) {
                player2Pokemon.attackFast(player2Pokemon,player1Pokemon,player2FastMove);
                player2Pokemon.setChargedMoveEnergy(player2Pokemon.getChargedMoveEnergy() + player2FastMove.getEnergy());
            }
            //Player 2 charged attack
            if (player2Pokemon.getChargedMoveEnergy() >= player2ChargedMove1.getEnergy()) {
                System.out.println(player2Pokemon.getName() + " " + player2ChargedMove1.getName() + " is ready to go. Press J to use it.");
                Scanner scanner = new Scanner(System.in);
                String attack = scanner.nextLine();
                if (attack.equalsIgnoreCase("J")) {
                    System.out.println(player2.getName() + " is using " + player2ChargedMove1.getName());
                    if (player1.getNumberofShields() > 0) {
                        System.out.println(player1.getName() + " has " + player1.getNumberofShields() + " shield(s) left. Press Q to use shield." );
                        Scanner scanner1 = new Scanner(System.in);
                        String shield = scanner1.nextLine();
                        if (shield.equalsIgnoreCase("Q")) {
                            System.out.println(player1.getName() + " used his shield. No damage was deal.");
                            player1.setNumberofShields(player1.getNumberofShields()-1);
                        }
                        else {
                            player2Pokemon.attackCharged(player2Pokemon,player1Pokemon,player2ChargedMove1);
                        }
                    }
                    else {
                        System.out.println(player1.getName() + " has no shield left.");
                        player2Pokemon.attackCharged(player2Pokemon,player1Pokemon,player2ChargedMove1);
                    }
                    player2Pokemon.setChargedMoveEnergy(player2Pokemon.getChargedMoveEnergy() - player2ChargedMove1.getEnergy());
                }
            }
            if (player2Pokemon.getChargedMoveEnergy() >= player2ChargedMove2.getEnergy()) {
                System.out.println(player2Pokemon.getName() + " " + player2ChargedMove2.getName() + " is ready to go. Press K to use it.");
                Scanner scanner = new Scanner(System.in);
                String attack = scanner.nextLine();
                if (attack.equalsIgnoreCase("K")) {
                    System.out.println(player2.getName() + " is using " + player2ChargedMove2.getName());
                    if (player1.getNumberofShields() > 0) {
                        System.out.println(player1.getName() + " has " + player1.getNumberofShields() + " shield(s) left. Press Q to use shield." );
                        Scanner scanner1 = new Scanner(System.in);
                        String shield = scanner1.nextLine();
                        if (shield.equalsIgnoreCase("Q")) {
                            System.out.println(player1.getName() + " used his shield. No damage was deal.");
                            player1.setNumberofShields(player1.getNumberofShields()-1);
                        }
                        else {
                            player2Pokemon.attackCharged(player2Pokemon,player1Pokemon,player2ChargedMove2);
                        }
                    }
                    else {
                        System.out.println(player1.getName() + " has no shield left.");
                        player2Pokemon.attackCharged(player2Pokemon,player1Pokemon,player2ChargedMove2);
                    }
                    player2Pokemon.setChargedMoveEnergy(player2Pokemon.getChargedMoveEnergy() - player2ChargedMove2.getEnergy());
                }
            }

            System.out.println(player1.getName().toUpperCase() + ":");
            System.out.println(player1.getNumberofShields() + " shield(s) left.");
            System.out.println(player1.getNumberOfPokemon() + " pokemon left.");
            if (player1ChangeCountdown >= 0 ) {
                System.out.println("You can change pokemon (press W)");
            }
            else {
                System.out.println((player1ChangeCountdown*(-1))  + " moves left to change pokemon.");
            }
            System.out.println("Now using " + player1Pokemon.getName());
            System.out.println(player1.getPokemons()[0].getName() + " has " + player1.getPokemons()[0].getHp() + " hp.");
            System.out.println(player1.getPokemons()[1].getName() + " has " + player1.getPokemons()[1].getHp() + " hp.");
            System.out.println(player1.getPokemons()[2].getName() + " has " + player1.getPokemons()[2].getHp() + " hp.");
            System.out.println("You have " + player1Pokemon.getChargedMoveEnergy() + " energy. You need " + player1ChargedMove1.getEnergy() + " energy for charge move " + player1ChargedMove1.getName() +
                    " and " + player1ChargedMove2.getEnergy() + " energy for charge move " + player1ChargedMove2.getName());
            System.out.println("______________________");


            System.out.println(player2.getName().toUpperCase() + ":");
            System.out.println(player2.getNumberofShields() + " shield(s) left.");
            System.out.println(player2.getNumberOfPokemon() + " pokemon left.");
            if (player2ChangeCountdown >= 0 ) {
                System.out.println("You can change pokemon (press I)");
            }
            else {
                System.out.println((player2ChangeCountdown*(-1))  + " moves left to change pokemon.");
            }
            System.out.println("Now using " + player2Pokemon.getName());
            System.out.println(player2.getPokemons()[0].getName() + " has " + player2.getPokemons()[0].getHp() + " hp.");
            System.out.println(player2.getPokemons()[1].getName() + " has " + player2.getPokemons()[1].getHp() + " hp.");
            System.out.println(player2.getPokemons()[2].getName() + " has " + player2.getPokemons()[2].getHp() + " hp.");

            System.out.println("You have " + player2Pokemon.getChargedMoveEnergy() + " energy. You need " + player2ChargedMove1.getEnergy() + " energy for charge move " + player2ChargedMove1.getName() +
                    " and " + player2ChargedMove2.getEnergy() + " energy for charge move " + player2ChargedMove2.getName());
            System.out.println("______________________");


            Scanner scanner = new Scanner(System.in);
            String changePokemon = scanner.nextLine();
            if (changePokemon.equalsIgnoreCase("W") && player1ChangeCountdown >= 0) {
                changePokemon(player1,"E", "R", "T");

                player1ChangeCountdown = -10;
                player1Pokemon = player1.getPokemons()[player1.getUsingPokemon()];
                player1FastMove = player1Pokemon.getFastMoves()[player1Pokemon.getUsingFastMove()];
                player1ChargedMove1 = player1Pokemon.getChargedMoves()[player1Pokemon.getUsingChargeMove1()];
                player1ChargedMove2 = player1Pokemon.getChargedMoves()[player1Pokemon.getUsingChargeMove2()];
            }
            if (changePokemon.equalsIgnoreCase("I")  && player2ChangeCountdown >= 0) {
                changePokemon(player2,"O", "P", "Ú");

                player2ChangeCountdown = -10;
                player2Pokemon = player2.getPokemons()[player2.getUsingPokemon()];
                player2FastMove = player2Pokemon.getFastMoves()[player2Pokemon.getUsingFastMove()];
                player2ChargedMove1 = player2Pokemon.getChargedMoves()[player2Pokemon.getUsingChargeMove1()];
                player2ChargedMove2 = player2Pokemon.getChargedMoves()[player2Pokemon.getUsingChargeMove2()];
            }
            playCount ++;
            player1ChangeCountdown ++;
            player2ChangeCountdown ++;
        }

        if (player1.getNumberOfPokemon() > player2.getNumberOfPokemon()) {
            System.out.println(player1.getName() + " win!");
        }
        else if (player1.getNumberOfPokemon() < player2.getNumberOfPokemon()) {
            System.out.println(player2.getName() + " win!");
        }
        else {
            System.out.println("Draw.");
        }
    }

    public void changePokemon(Player player, String pokemon1, String pokemon2, String pokemon3) {
        if (player.getPokemons()[0].getHp() > 0 && player.getUsingPokemon() != 0) {
            System.out.println("Press " + pokemon1 + " for " + player.getPokemons()[0].getName());
        }
        if (player.getPokemons()[1].getHp() > 0 && player.getUsingPokemon() != 1) {
            System.out.println("Press " + pokemon2 + " for " + player.getPokemons()[1].getName());
        }
        if (player.getPokemons()[2].getHp() > 0 && player.getUsingPokemon() != 2) {
            System.out.println("Press " + pokemon3 + " for " + player.getPokemons()[2].getName());
        }
        Scanner scanner = new Scanner(System.in);
        String newUsingPokemon = scanner.nextLine();
        if (newUsingPokemon.equalsIgnoreCase(pokemon1)) {
            if (player.getPokemons()[0].getHp() <= 0) {
                System.out.println("This pokemon has 0 hp. Choose another one.");
                changePokemon(player, pokemon1, pokemon1, pokemon3);
            }
            else {
                player.setUsingPokemon(0);
            }
        }
        if (newUsingPokemon.equalsIgnoreCase(pokemon2)) {
            if (player.getPokemons()[1].getHp() <= 0) {
                System.out.println("This pokemon has 0 hp. Choose another one.");
                changePokemon(player, pokemon1, pokemon1, pokemon3);
            }
            else {
                player.setUsingPokemon(1);
            }
        }
        if (newUsingPokemon.equalsIgnoreCase(pokemon3)) {
            if (player.getPokemons()[2].getHp() <= 0) {
                System.out.println("This pokemon has 0 hp. Choose another one.");
                changePokemon(player, pokemon1, pokemon1, pokemon3);
            }
            else {
                player.setUsingPokemon(2);
            }
        }
    }

    public void chooseName(Player player) {
        Scanner scanner = new Scanner(System.in);
        player.setName(scanner.nextLine());
        System.out.println("Hello, " + player.getName() + ". Ready for some pokemon battle?");
    }
    public void choosePokemon(Player player) {
        System.out.println(player.getName() + ", please choose your team of three pokemon.");
        Scanner scanner = new Scanner(System.in);
        Pokemon[] pokemon = new Pokemon[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Type name of " + (i+1) + ". pokemon");
            String chosenPokemon = scanner.nextLine();
            if (chosenPokemon.equalsIgnoreCase("giratina altered")) {
                pokemon[i] = new GiratinaAltered();
            }
            else if (chosenPokemon.equalsIgnoreCase("giratina origin")) {
                pokemon[i] = new GiratinaOrigin();
            }
            else if (chosenPokemon.equalsIgnoreCase("groudon")) {
                pokemon[i] = new Groudon();
            }
            else if (chosenPokemon.equalsIgnoreCase("mewtwo")) {
                pokemon[i] = new Mewtwo();
            }
            else if (chosenPokemon.equalsIgnoreCase("togekiss")) {
                pokemon[i] = new Togekiss();
            }
            else if (chosenPokemon.equalsIgnoreCase("zekrom")) {
                pokemon[i] = new Zekrom();
            }
            else {
                System.out.println("wrong name of pokemon, try again.");
                i --;
            }
        }
        player.setNumberOfPokemon(3);
        player.setPokemons(pokemon);

        System.out.println();
        System.out.print("Team "+ player.getName() + ": ");
        for (int i = 0; i <= player.getPokemons().length-1; i++) {
            System.out.print(player.getPokemons()[i].getName() + "  ");
        }
    }

    public void chooseFastMove(Pokemon pokemon) {
        System.out.println();
        System.out.print("Choose one fast move for " + pokemon.getName() + ". You can choose from: ");
        for (int i = 0; i <= pokemon.getFastMoves().length-1; i++) {
            System.out.print(i+1 + " " + pokemon.getFastMoves()[i].getName() + "  ");
        }
        Scanner scanner = new Scanner(System.in);

        int chosenFastMove;

        while (true) {
            try {
                chosenFastMove = Integer.parseInt(scanner.nextLine());
                if (chosenFastMove < 1 || chosenFastMove > pokemon.getFastMovesCount()) {
                    System.out.println("Error: Please enter number from interval 1 to " + pokemon.getFastMovesCount());
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Please, enter integer.");
            }
        }

        pokemon.setUsingFastMove(chosenFastMove-1);

        System.out.println(pokemon.getName() + " now knows " + pokemon.getFastMoves()[pokemon.getUsingFastMove()].getName() + ".");
    }

    public void chooseChargedMove(Pokemon pokemon) {
        System.out.println();
        System.out.print("Choose two charged moves for " + pokemon.getName() + ". You can choose from: ");
        for (int i = 0; i <= pokemon.getChargedMoves().length-1; i++) {
            System.out.print(i+1 + " " + pokemon.getChargedMoves()[i].getName() + "  ");
        }
        Scanner scanner = new Scanner(System.in);

        int chosenChargedMove1 = Integer.parseInt(scanner.nextLine());
        pokemon.setUsingChargeMove1(chosenChargedMove1-1);

        while (pokemon.getUsingChargeMove2() == -1) {
            int chosenChargedMove2 = Integer.parseInt(scanner.nextLine());
            if (chosenChargedMove1 == chosenChargedMove2) {
                System.out.println("Second charged move must be different.");
            }
            else {
                pokemon.setUsingChargeMove2(chosenChargedMove2-1);
            }
        }
        System.out.println(pokemon.getName() + " now knows " + pokemon.getChargedMoves()[pokemon.getUsingChargeMove1()].getName() +
                " and " + pokemon.getChargedMoves()[pokemon.getUsingChargeMove2()].getName());
    }

}
