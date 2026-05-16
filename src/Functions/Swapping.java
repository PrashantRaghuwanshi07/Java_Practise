package Functions;

public class Swapping {
    static void main(String[] args) {
        // no swapping by using function because of scoping
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}
