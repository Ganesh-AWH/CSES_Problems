import java.util.Scanner;

public class coinPiles {
    public static void main(String[] args) {
        solve();
        //time limit exceded
    }
    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(recursion(a, b));
        }
        sc.close();
    }
    public static boolean recursion(int a, int b){
        if(a == 0 && b == 0) return true;

        if(a <= 0 || b <= 0) return false;

        boolean left = recursion(a-2, b-1);
        boolean right = recursion(a-1, b-2);

        return left || right;
    }
}
