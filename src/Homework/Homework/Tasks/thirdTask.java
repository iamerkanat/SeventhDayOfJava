package Homework.Tasks;
import java.util.Scanner;
public class thirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A: ");
        int a = scanner.nextInt();
        System.out.println("Enter B: ");
        int b = scanner.nextInt();

        String answer = (a % b == 0) ? "devisible" : "undevisible";
        System.out.println(answer);

    }
}
