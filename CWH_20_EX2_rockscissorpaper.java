import java.util.Random;
import java.util.Scanner;

public class CWH_20_EX2_rockscissorpaper {
    public static void main(String[] args) {
        System.out.println("\tselect 0 for rock \n\t select 1 for paper\n\t select 2 for scissor");
        Scanner sc = new Scanner(System.in);
        Random rc = new Random();
        System.out.println("its your turn! ");
        int human = sc.nextInt();

        if(human == 0){
            System.out.println("you have selected ROCK");
        }
        if(human == 1){
            System.out.println("you have selected PAPER");
        }
        if(human == 2){
            System.out.println("you have selected SCISSOR");
        }
        System.out.println("now its computer turn! ");
        int computer = rc.nextInt(3);
        if (computer == 0){
            System.out.println("computer have selected ROCK");
        }
        if (computer == 1){
            System.out.println("computer have selected PAPER");
        }
        if (computer == 2){
            System.out.println("computer have selected SCISSOR ");
        }
        if (human == computer){
            System.out.println("match is draw");
        }
        else if (human == 0 && computer==2 || human == 1 && computer == 0 || human == 2 && computer == 1 ){
            System.out.println(" congratulations , you have won");
        }
        else {
            System.out.println("you lose! \n better luck next time");
        }


    }
}
