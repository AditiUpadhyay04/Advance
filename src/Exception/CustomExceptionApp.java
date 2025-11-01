package Exception;
import java.util.Scanner;

class TooOldException extends RuntimeException{
    TooOldException(String msg){
        super(msg);
    }
}
 class TooYoungException extends RuntimeException{
     TooYoungException(String msg){
         super(msg);
     }
 }

public class CustomExceptionApp  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age to check marriage eligibility");

        int age = sc.nextInt();

        if(age< 21){
            try {
                throw new TooOldException("age bhut zyada hai");
            }catch(TooOldException toe){
                System.out.println("meri shaadi nahi hui h");
            }
        }
        else if(age < 30){
            throw new TooYoungException("wait kro kuch years");
        }
        else
        {
            System.out.println("you are eligible for marriage");

        }
    }
}
