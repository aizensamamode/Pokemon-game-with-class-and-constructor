import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Pokemon P1 = new Pokemon("Pikachu");
        Pokemon P2 = new Pokemon("Bulbasaur");
        Pokemon P3 = new Pokemon("Phoenix");
        Pokemon P4 = new Pokemon("Legendary kingkong");
        

        Pokemon[] pokemons = { P1, P2, P3, P4 };

        Scanner scan = new Scanner(System.in);
        Random R = new Random();

        System.out.println("Do you want a pokemon? press y = yes n = no");
        String ans = scan.nextLine();

        if (ans.equalsIgnoreCase("y")) {
            Pokemon randomPokemon = pokemons[R.nextInt(pokemons.length)];
            System.out.println("You got: " + randomPokemon.name);
            randomPokemon.talk();
        } else {
            System.out.println("Maybe next time 🙂");
        }

        scan.close();
    }
}
