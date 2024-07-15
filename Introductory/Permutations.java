import java.util.*;

public class Permutations {
    
    // Function to construct a beautiful permutation
    static void permutation(int N) {
        // Check if N is 2 or 3, as a beautiful permutation is
        // not possible for these cases
        if (N == 2 || N == 3) {
            System.out.println("NO SOLUTION");
            return;
        }
        
        // Output all even numbers first
        for (int i = 2; i <= N; i += 2) {
            // Print even numbers with a step of 2
            System.out.print(i + " ");
        }
        
        // Output all odd numbers next
        for (int i = 1; i <= N; i += 2) {
            // Print odd numbers with a step of 2
            System.out.print(i + " ");
        }
    }
    
    // Driver Code
    public static void main(String[] args) {
        int N = 5;
        // Call the permutation function with input N
        permutation(N);
    }
}