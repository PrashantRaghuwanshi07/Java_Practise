package Loops;
import java.util.Scanner;
public class Largest {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int max=n1;
        if(n2>max){
            max=n2;
        }
        if(n3> max){
            max=n3;
        }
        System.out.println(max);
    }
}
