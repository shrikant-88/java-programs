import java.util.Scanner;

public class check_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        if(n == 0){
            System.out.println("number is 0 !");
        }
        else if(n>0){
            System.out.println("number is positive !");
        }
        else{
            System.out.println("number is negative !");
        }
    }
}
