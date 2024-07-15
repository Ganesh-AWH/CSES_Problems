import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0){
            long row = sc.nextLong();
            long col = sc.nextLong();
            //finding the inner square area
            long area = 0;
            if(row > col){
                area = (row-1) * (row-1);
                long ans;
                //row odd
                if(row%2 == 1){
                    ans = col;
                }else{
                    ans = 2 * row - col;
                }
                System.out.println(ans + area);
            }else{
                area = (col-1) * (col-1);
                long ans;
                if(col%2 == 0){
                    ans = row;
                }else{
                    ans = 2 * col - row;
                }
                System.out.println(ans + area);
            }
        }
        sc.close();
    }

}
