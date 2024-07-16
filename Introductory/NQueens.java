import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NQueens {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        Scanner sc = new Scanner(System.in);
        List<char []> board = new ArrayList<>();
        for(int i=0; i<8; i++){
            String in = sc.nextLine();
            board.add(in.toCharArray());
        }
        sc.close();
        System.out.println(helper(0, board));
    }
    public static int helper(int col, List<char []> board){
        if(col == 8){
            return 1;
        }
        int count = 0;
        for(int row=0; row<8; row++){
            if(board.get(row)[col] != '*' && isPossible(row, col, board)){
                board.get(row)[col] = 'Q';
                count += helper(col+1, board);
                board.get(row)[col] = '.';
            }
        }
        return count;
    }
    public static boolean isPossible(int row, int col, List<char []> board){
        int dr = row;
        int dc = col;

        while(col>=0){
            if(board.get(row)[col] == 'Q'){
                return false;
            }
            col--;
        }
        row = dr;
        col = dc;
        while(row>=0 && col>=0){
            if(board.get(row)[col] == 'Q'){
                return false;
            }
            row--;
            col--;
        }
        row = dr;
        col = dc;
        while(row<8 && col>=0){
            if(board.get(row)[col] == 'Q') return false;
            row++;
            col--;
        }

        return true;
    }
}

