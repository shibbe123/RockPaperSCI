import java.util.Random;
import java.util.Scanner;


public class Game {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);


   public void startGame(){
    String aiChoice = "";
    String playerChoice;
    int playerPoints = 0;
    int aiPoints = 0;
    int maxTurn = 5;

        while (playerPoints != maxTurn && aiPoints != maxTurn){
            System.out.flush();
            System.out.println("Please enter your choice, (rock, paper, scissor)");
            System.out.println("First to get to " + maxTurn + " points will win");
            System.out.println("Player: " + playerPoints + " - AI: " + aiPoints);


            playerChoice = scanner.nextLine();

            if (playerChoice.equals("rock")|| playerChoice.equals("paper")|| playerChoice.equals("scissor")){
         
  
            int randomNr = random.nextInt(3);

            switch (randomNr) {
                case 0:

                aiChoice = "rock";
                System.out.println("AI chose rock");
            
                    break;

                case 1:
                aiChoice = "paper";
                System.out.println("AI chose paper");
                break;

                case 2:
                aiChoice = "scissor";
                System.out.println("AI chose scissor");
                break;
                default:
                System.out.println("jing har fel muhahaha" + randomNr);
                    break;
            }



            if (playerChoice.equals("rock")&& aiChoice.equals("rock") || playerChoice.equals("paper")&& aiChoice.equals("paper") || playerChoice.equals("scissor")&& aiChoice.equals("scissor")){

                System.out.println("Both scored the same thing, it´s a draw");
            }
            else if (playerChoice.equals("rock")&& aiChoice.equals("scissor") || playerChoice.equals("paper")&& aiChoice.equals("rock") || playerChoice.equals("scissor")&& aiChoice.equals("paper")){
                System.out.println("Good YOU Scored a Point +1");
                playerPoints +=1;
            }
            else if (playerChoice.equals("scissor")&& aiChoice.equals("rock") || playerChoice.equals("rock")&& aiChoice.equals("paper") || playerChoice.equals("paper")&& aiChoice.equals("scissor")){
                System.out.println("aouch");
                System.out.println("AI +1p");

                aiPoints +=1;

            }
        }
        else{
            System.out.println("Invalid answer");

        }
     }
     if (aiPoints > playerPoints){
        System.out.println("YOU SUCK MF");
     }else {
        System.out.println("CONGRATZ YOU WON");

     }
    
}

   
    
}
