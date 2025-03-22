import java.util.*;
public class NumGuessing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int guess=0;
        int answer = (int)(Math.random()*10+1);
        do { 
            System.out.println("Enter a number between 1 and 10:");
            guess=sc.nextInt();
            if(guess > answer){
                System.out.println("Your guess is too high");
            }
            else if(guess < answer){
                System.out.println("Your answer is too low");
            }
            
        } while (guess != answer);
        System.out.println("Your guess is correct");
    }
}
