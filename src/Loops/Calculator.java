package Loops;
import java.util.Scanner;
public class Calculator {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take the input from the user till user does not press =
        int ans=0;
        while(true){
            System.out.print("Enter the operator : ");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op=='-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter two numbers : ");
                int n1 = in.nextInt();
                int n2 = in.nextInt();
                if(op == '+'){
                    ans = n1 + n2;
                }
                if(op == '-'){
                    ans = n1 - n2;
                }
                if(op == '*'){
                    ans = n1 * n2;
                }
                if(op == '/') {
                    if (n2 != 0) {
                        ans = n1 / n2;
                    }
                }
                if(op == '%'){
                    ans = n1 % n2;
                }
            }
            else if(op == '='){
                break;
            }
            else {
                System.out.println("Invalid operation");
            }
            System.out.println(ans);
        }
    }
}

