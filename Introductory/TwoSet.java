import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoSet {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        List<Integer> set1 = new ArrayList<>();
        List<Integer> set2 = new ArrayList<>();
        long totalSum = (long)n * (n+1)/2;
        //set1 and contains half sum and set2 contains half sum
        if(totalSum%2 != 0){
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
        long target = totalSum/2;
        for(int i=n; i>=1; i--){
            if(target - i >=0){
                set1.add(i);
                //track only set1 sum
                target -= i;
            }else{
                set2.add(i);
            }
        }
        System.out.println(set1.size());
        for(Integer i:set1) System.out.print(i+" ");
        System.out.println("\n"+set2.size());
        for(Integer i:set2) System.out.print(i+" ");
    }
}
