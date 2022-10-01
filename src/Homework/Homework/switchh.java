package Homework;
import java.util.Scanner;

public class switchh {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        String color = text.next();
        switch (color){
            case "green":
                System.out.println("Go Go");
                break;
            case "yellow":
                System.out.println("Wait, wait!");
                break;
            case "red":
                System.out.println("STOOOOOOOOOOP!");
                break;
            default:
                System.out.println("Wrong value");

        }
    }
}
