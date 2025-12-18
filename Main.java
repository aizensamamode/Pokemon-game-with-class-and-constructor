import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        Pokemon P1 = new Pokemon("Pikachu");
        Pokemon P2 = new Pokemon("Bulbasaur");
        Pokemon P3 = new Pokemon("Phoenix");
        Pokemon P4 = new Pokemon("Legendary kingkong");
        
        Pokemon [] pokemon_array = {P1, P2, P3, P4};

        Pokemon pick_random = pokemon_array[random.nextInt(4)];
        System.out.println(pick_random.name);


    }
}
