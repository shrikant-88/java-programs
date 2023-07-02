import java.util.Scanner;
// time complexity = O(2^n) and space complexity O(n) ;
public class fibonacchi {
    // sequence of fibonacchi no = 0,1,1,2,3,5,8,13,21........
    public static int fibonacchi_num(int n) {
        int result;
        if(n==1||n==2){
            return n-1;
        }
        else{
            result = fibonacchi_num(n-1)+fibonacchi_num(n-2);
        }
        return result;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number to find fibonacchi number : ");
        int n = sc.nextInt();
        for(int i = 1 ; i<=n ; i++){
        int result = fibonacchi_num(i);
        System.err.print(result + "  ");
        }

    }
}
