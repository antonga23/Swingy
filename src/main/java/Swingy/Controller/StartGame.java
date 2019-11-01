package Swingy.Controller;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class StartGame {
    public static void readUserInput() {
        Scanner input = new Scanner(System.in);
        while (input != null) {
            System.out.print("Hello there! Welcome to the world of POKEMON! My name is OAK! People call me the POKEMON PROF! This world is inhabited by creatures called POKEMON! For some people, POKEMON are pets. Others use them for fights. Myself...I study POKEMON as a profession. First, would you like to play?\n");
            String answer = input.nextLine();
            if (answer.toLowerCase() == "yes" || answer.toString().toLowerCase() == "y"){
                System.out.println("Great");
            }
            else if (answer.toLowerCase() == "no" || answer.toString() == "n") {
                System.out.println("What a pity. Bye Bye");
                answer = "quit";
                System.exit(0);
            }
            System.exit(0);
        }
    }
}
