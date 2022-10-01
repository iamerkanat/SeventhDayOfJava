package Homework.Tasks;
import java.util.Scanner;

public class firstTaskButAnotherWay {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();

        String answer = n>= 10 && n<=20 ? "yes" : "no"; //?-then what?
        System.out.println(answer);
    }
}
