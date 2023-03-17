// Simple Calculator
// Christiane A, Bacani
import java.util.Scanner;
public class JavaCalculator {
    static int Add(int num1,int num2){
        int sum = num1 + num2;
        return sum;
    }
    static int Subtract(int num1, int num2){
        int subtract = num1 - num2;
        return subtract;
    }
    static int Multiply(int num1,int num2){
        int product = num1 * num2;
        return product;
    }
    static int Divide(int num1,int num2){
        int quotient = num1 / num2;
        return quotient;
    }
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print("Welcome to Bacani`s Calculator!\n");
       
       System.out.print("1.) Add\n2.) Subtract\n3.) Multiply\n4.) Divide\n");
       System.out.print("Enter your choice here : ");
       String choice = input.nextLine();
             
       System.out.print("Enter your first digit : ");
       int num1 = input.nextInt();
       
       System.out.print("Enter your second digit : ");
       int num2 = input.nextInt();
       
       if (choice.equals("1")){
           System.out.print(Add(num1,num2));
           
       }else if(choice.equals("2")){
           System.out.print(Subtract(num1,num2));
           
       }else if(choice.equals("3")){
           System.out.print(Multiply(num1,num2));
           
       }else if(choice.equals("4")){
       System.out.print(Divide(num1,num2));
       
   }else{
           System.out.print("Invalid choice!");
           }
       
       

       
       
       
       
       
        
    }
}
