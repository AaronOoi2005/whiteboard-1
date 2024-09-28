import java.util.Scanner;

public class p7 {

    public p7() {
    }
    
       public static int sqrt(int x) {
        // Edge case: if x is 0 or 1, return x
        if (x == 0 || x == 1) {
            return x;
        }

        // Initialize the binary search bounds
        int low = 1, high = x, result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Find the middle point

            // Check if mid * mid is the perfect square
            if (mid == x / mid) {
                return mid;  // If mid*mid is exactly x, return mid
            } else if (mid < x / mid) {
                low = mid + 1;  // Move to the right half
                result = mid;   // Store the result as a possible square root
            } else {
                high = mid - 1; // Move to the left half
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
   		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a perfect square: ");
		int x = scanner.nextInt();
        System.out.println("Square root of " + x + " is " + sqrt(x));
    }
}