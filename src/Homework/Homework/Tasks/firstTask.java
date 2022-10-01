package Homework.Tasks;
import java.util.Scanner;

public class firstTask {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();

        if(10<=n && n<=20)
            System.out.println("Yes");
        else
            System.out.println("No");


    }
    /*
    I enter number - n , if n between 10 and 20, program prints YES or NO.
     */

}
