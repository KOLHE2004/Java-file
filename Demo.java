import java.util.*;
public class Demo {
    public static void main(String[] args) {
        //operator
     Scanner sc  = new Scanner(System.in);
     System.out.println("Enter the first number:>> ");
     int number1 = sc.nextInt();
     System.out.println("Enter the second number:>> ");
     int number2 = sc.nextInt();

     System.out.println("Addition = "+(number1 + number2));
       System.out.println("subtraction = "+(number1 - number2));
         System.out.println("multiplication = "+(number1 * number2));
           System.out.println("division = "+(number1 / number2));

    //Use a switch statement in operator
     char operator; 
     System.out.println("Enter the first number:>> ");
     int value1 = sc.nextInt();
     System.out.println("Enter the second number:>> ");
     int value2 = sc.nextInt();
     System.out.println("Enter operator ( +,-,*,/):");
     operator = sc.next().charAt(0);
     
     switch(operator){
        case '+' : System.out.println("Addition = "+(value1 + value2));
        break;
        case '-': System.out.println("subtraction = "+(value1 - value2));
        break;
        case '*': System.out.println("multiplication = "+(value1 * value2));
        break;
        case '/': System.out.println("division = "+(value1 / value2));
        break;

     }


sc.close();
    }
    
}
