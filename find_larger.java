import java.util.Scanner;

public class Largest_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : ");
        int n1 = sc.nextInt();
        System.out.println();
        System.out.print("enter second number : ");
        int n2 = sc.nextInt();
        System.out.println();
        System.out.print("enter third number : ");
        int n3 = sc.nextInt();
        System.out.println();

        if(n1>n2 && n3>n2){
            if(n1>n3){
                System.out.println("n1 is greater number !");
            }
            else{
                System.out.println("n3 is greater");
            }
        }
        else if(n1>n3 && n2>n3){
            if(n1>n2){
                System.out.println("n1 is greater number !");
            }
            else{
                System.out.println("n2 is greater");
            }
        }
        else if(n2>n1 && n2>n3){
            System.out.println("n2 is greater ");
        }
        
    }
}
