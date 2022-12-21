import java.util.Scanner;
public class test {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int number1;
       int number2;
       int result =0;
       boolean repeat = (true);
       while(repeat)
       {
       System.out.println("enter your first number ");
       number1= input.nextInt();
       System.out.println("enter your second number ");
       number2= input.nextInt();
       try{
                  result = number1/number2;
                  System.out.println("the result is equal to "+result +"");
                  repeat = false;
       }
       catch(ArithmeticException ae)
       {
           System.out.println("plz don't enter 0 in the denomineter");
       }

       }
       System.out.println("the program will termiante now......... ");
            
       
    }
    
}
