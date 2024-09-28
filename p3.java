import java.util.Scanner;

public class p3 {

    public p3() {
    }
    
    //fibonaci cal
    static int fib(int n){
        // Base Case
        if (n <= 1)
            return n;
        // Recursive call
        else
       		return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Enter amount to generate: ");
        int j = scanner.nextInt();
        
		//output
        for (int i = 0; i < j; i++) {

            System.out.print(fib(i) + " ");
        }
    }
}