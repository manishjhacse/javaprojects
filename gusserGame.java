import java.util.Scanner;
import java.util.Random;
class randomNumber{
    int guessNum;
    int guessingNumber()
    {
        Random random=new Random();
        int guessNum=random.nextInt((100-1)+1)+1;
        return guessNum;
    }
}
class player
{
    int guessNum;
    int guessingNumber()
    {
        System.out.println("Player,Guess the number:");
        Scanner scan=new Scanner(System.in);
        guessNum=scan.nextInt();
        return guessNum;
    }
    
}
class umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser()
    {
        randomNumber g=new randomNumber();
        numFromGuesser=g.guessingNumber();
    }
    void collectNumFromPlayer()
    {
        player p1=new player();
        player p2=new player();
        player p3=new player();
        numFromPlayer1=p1.guessingNumber();
        numFromPlayer2=p2.guessingNumber();
        numFromPlayer3=p3.guessingNumber();


    }
    void compare()
    {
        if(numFromGuesser==numFromPlayer1)
        {
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
            {
                System.out.println("All player guesses right.");
            }
            else if(numFromGuesser==numFromPlayer2)
            {
                System.out.println("player 1 and  player 2 guesses right.");
            }
            else if(numFromGuesser==numFromPlayer3)
            {
                System.out.println("player 1 and  player 3 guesses right.");
            }
            else{
                System.out.println("Player 1 guesses right.");
            }
        
        }
        else if(numFromGuesser==numFromPlayer2)
        {
            if(numFromGuesser==numFromPlayer3)
            {
                System.out.println("player 2 and player 3 guesses rght.");
            }
            else{
                System.out.println("player 2 guesses right.");
            }
        }
        else if(numFromGuesser==numFromPlayer3)
        {
            System.out.println("player 3 guesses right.");
        }
        else{
            System.out.println("No player can guess the number,try again");
        }
    }
}

public class gusserGame {
   public static void main(String args[])
   {
    umpire u=new umpire();
    u.collectNumFromGuesser();
    int rem=u.numFromGuesser%10;
    System.out.println("HINT:");
    System.out.println("number ends with "+rem);
    do
    {
        u.collectNumFromPlayer();
        u.compare();
    }while(u.numFromGuesser!=u.numFromPlayer1&&u.numFromGuesser!=u.numFromPlayer2&&u.numFromGuesser!=u.numFromPlayer3);
   } 
}
