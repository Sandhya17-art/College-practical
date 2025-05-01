  import java.util.Scanner;
        public class Calculate {
        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the first number:");
            float a= scanner.nextFloat();
             System.out.println("enter the second number:");
             float b= scanner.nextFloat();
        System.out.println("Sum =" +(a+b));
        System.out.println("Difference =" +(a-b));
        System.out.println("Product =" +(a*b));
        if(b != 0){
        System.out.println("Division=" +(a/b));
        }
        else{
            System.out.println("Division by zero is not possible" );
        }

        }
        }