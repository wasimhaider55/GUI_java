import java.util.Scanner;
import java.util.InputMismatchException;
public class test {
    public static void main(String[] args) {
        int number1,number2,result;
        Scanner input = new Scanner(System.in);
        boolean repeat=true;
        while(repeat)
        {
        try{
        System.out.println("enter your first number");
        number1  = input.nextInt();
        System.out.println("enter your second number");
        number2 = input.nextInt();
        result = number1+number2;
        System.out.println("the result of two number addition is equal  to  "+result+" " );
        repeat = false;
        
        }catch(InputMismatchException ime)
        {
           System.out.println("plz enter the interger number only");
           input.nextLine();
        }
        }
        System.out.println("the programm will terminta now .......");
        
    }
    
}
