package Homework;
import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner colour = new Scanner(System.in); //colour is new section for colors

        //traffic light

        String color = colour.next();
        if (color.equals("green"))
            System.out.println("Go Go");
        else if(color.equals("yellow"))
            System.out.println("wait! wait!");
        else if(color.equals("red"))
            System.out.println("STOP! STOP!!!");
        else
            System.out.println("wrong color");
    }
}
