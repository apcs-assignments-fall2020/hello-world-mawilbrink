import java.util.Scanner;

public class MyMain {
     public static void main(String[] args) {

        //In class scanner assignment
        //Scanner scan = new Scanner(System.in);
        //System.out.println("What is your favorite number?");
        //int favorite = scan.nextInt();
        //int myfavorite = favorite*2;
        //System.out.println("Cool! My favorite number is " + myfavorite);

        //Chatbot Assignment
        Scanner scanchatbot1 = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanchatbot1.next();
        System.out.println("Hello, " + name + "! It's nice to meet you!");
        System.out.println("");
         
        Scanner scanchatbot2 = new Scanner(System.in);
        System.out.println("What is your favorite color, " + name + "?");
        String color = scanchatbot2.next();
        System.out.println("Oh I like " + color + " too!");


        

    }
}
