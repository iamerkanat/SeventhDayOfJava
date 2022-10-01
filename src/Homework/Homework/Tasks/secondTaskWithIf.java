package Homework.Tasks;
import java.util.Scanner;

public class secondTaskWithIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble(); //tenge

        double USD = 475.0;
        double EUR = 463.50;
        double GBP = 520.98;

        System.out.print("[1] USD" + "\n");
        System.out.print("[2] EUR" + "\n");
        System.out.print("[3] GBP" + "\n");

        int choice = scanner.nextInt();
        if (choice == 1){
            amount = amount / USD;
            System.out.println(amount + " USD");
        } else if (choice == 2){
            amount = amount / EUR;
            System.out.println(amount + " EUR");
        } else {
            amount = amount / GBP;
            System.out.println(amount + " GBP");
        }



    }
}
