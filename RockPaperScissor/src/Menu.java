import java.util.Scanner;
public class Menu {

Game game = new Game();
 Scanner scanner = new Scanner(System.in);

    public void play(){
        System.out.flush();

        System.out.println("WELCOME TO THE GAME OF ROCK-PAPER-SCISSOR!");
        System.out.println("Press p to play");
        System.out.println("Press q to quit");

        String userInput = scanner.nextLine();

         if (userInput.equals("p")){
            game.startGame();
        }

        else if (userInput.equals("q")){
            quit();
        }


    }

    public void quit(){
        System.out.println("THANK YOU, COME AGAIN(apu voice)");
    }
    
}
