import java.util.Scanner;

public class PalindromeReorder {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int []freq = new int[26];

        //find the frequency of every character in string
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            freq[c-'A']++;
        }

        //count the number of odd frequency character
        int count = 0;
        for(int i: freq) if(i%2 != 0) count++;

        if(count>1){
            System.out.println("NO SOLUTION");
        }else{
            int l = 0;
            int r = str.length()-1;
            char []ans = new char[str.length()];
            for(int i=0; i<26; i++){
                while(freq[i] > 1){
                    ans[l] = ans[r] = (char)(i+'A');
                    l++;
                    r--;
                    freq[i] -= 2;
                }
            }
            int n = str.length();
            for(int i=0; i<26; i++){
                if(freq[i] == 1){
                    ans[n/2] = (char)(i+'A');
                    break;
                }
            }
            System.out.println(new String(ans));
        }
        sc.close();
    }
}
