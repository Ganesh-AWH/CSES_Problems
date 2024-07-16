import java.util.Scanner;

public class TrailingZeros {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(long i=5; n/i>=1; i*=5){
            count += n/i;
        }
        sc.close();
        System.out.println(count);
    }
}
