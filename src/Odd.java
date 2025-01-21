import java.util.Scanner;
public class Odd {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        short num = sc.nextShort();
        System.out.println(num);
        if (num/2==0){
            System.out.println(num+" is even number");
        }
        else {
            System.out.println(num+" is odd number");
        }
    }
}
