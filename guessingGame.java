import java.util.*;
public class guessingGame {
    public static void main(String[]args){
        int guess;
        int num=0;
        int comp=(int)(Math.random()*101);
        System.out.print("guess a random int 0-100: ");
        Scanner input= new Scanner(System.in);
        guess=input.nextInt();
        while(guess!=comp){
            num+=1;
            if(guess>comp){
                System.out.println("to high! guess again: ");
                guess=input.nextInt();
            }
            if(guess<comp){
                System.out.println("too low! guess again: ");
                guess=input.nextInt();
            }
        }
        if(num<8){
            System.out.println("congrats, you guessed in less than 8 tries: "+num);
        }
        else{
            System.out.println("congrats, you got it in "+num+" many tries");
        }
    }

}
