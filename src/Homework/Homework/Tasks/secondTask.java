package Homework.Tasks;
import java.util.Scanner;
public class secondTask {
    public static void main(String[] args) {
        double USD = 475.0;
        double EUR = 463.50;
        double GBP = 520.98;
        System.out.println("Insert amount in KZT:");
        Scanner sumOfCurrency = new Scanner(System.in);
        int tenge = sumOfCurrency.nextInt();
        System.out.println("Choose currency"+"\n"+"[1] USD"+"\n"+"[2] EUR"+"\n"+"[3] GBP");
        Scanner numbers = new Scanner(System.in);
        int number = numbers.nextInt();
        switch(number){
            case 1:
                System.out.println("Will be:" + "\n" + (double)tenge/USD + " USD");
                break;
            case 2:
                System.out.println("Will be:" + "\n" + (double)tenge/EUR + " EUR");
                break;
            case 3:
            System.out.println("Will be:" + "\n" + (double)tenge/GBP + " GBP");
                break;
    }
}}
