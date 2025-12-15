import java.util.Scanner;

class Main{

    Pokemon pikachu = new Pokemon("Pikachu", 100, 20);
    Pokemon charmander = new Pokemon("Charmander", 100, 15);
    public void battleScene(Pokemon p1, Pokemon p2) {
        System.out.println("The battle begins between " + p1.name + " and " + p2.name + "!");
        while(p1.health > 0 && p2.health > 0) {
            p1.attackPower(p2);
            p2.displayStatus();
            if(p2.health <= 0) {
                System.out.println(p2.name + " has fainted! " + p1.name + " wins!");
                break;
            }
            p2.attackPower(p1);
            p1.displayStatus();
            if(p1.health <= 0) {
                System.out.println(p1.name + " has fainted! " + p2.name + " wins!");
                break;
            }
        }
        
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
    
    Start start = new Start();

    start.scene1();

    String choice = scanner.nextLine();
        if(choice.equals("1")){
            System.out.println("You chose to fight the Charmander!");
            // Proceed to battle scene (not implemented here)
            
            
            
        } else if(choice.equals("2")){
            System.out.println("You chose to run away! You safely escape the wild Charmander.");
            // End or return to previous scene (not implemented here)
        } else {
            System.out.println("Invalid choice. Please choose 1 or 2.");
            start.scene1(); // Re-prompt the user
        }
    main.battleScene(main.pikachu, main.charmander);
    
    

        




         
    }
}