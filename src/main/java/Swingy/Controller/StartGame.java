package Swingy.Controller;
import javax.swing.*;
import java.io.*;
import Swingy.Model.Character.*;
import java.util.*;

public class StartGame {
    public static void readUserInput() {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.toString();
        while (answer != "quit") {
            System.out.print("Hello there! Welcome to the world of POKEMON! My name is OAK! People call me the POKEMON PROF! This world is inhabited by creatures called POKEMON! For some people, POKEMON are pets. Others use them for fights. Myself...I study POKEMON as a profession. First, would you like to play?\n");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("yes")){
                HeroGeneration.generateHero();
                answer = "quit";
            }
            else if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n")) {
                System.out.println("What a pity. Bye Bye");
                System.exit(0);
            }
            else{
                System.out.println("Error. Incorrect input! Only yes or no is a valid input.");
                System.exit(0);
            }
        }
    }
}