import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = (long)n * (n+1)/2;
        long sum = 0;
        while(n-->1){
            sum += sc.nextInt();
        }
        long missingNumber = ans - sum;
        System.out.println(missingNumber);
        sc.close();
    }
}
