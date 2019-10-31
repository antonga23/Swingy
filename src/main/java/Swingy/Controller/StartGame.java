package Swingy.Controller;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class StartGame {
    public void readUserInput() {
        try{
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            do{
                while(input != null)
                System.out.print("Hello there! Welcome to the world of POKEMON! My name is OAK! People call me the POKEMON PROF! This world is inhabited by creatures called POKEMON! For some people, POKEMON are pets. Others use them for fights. Myself...I study POKEMON as a profession. First, would you like to play?\n;");
                input.toString() = "quit";
            }while(input.toString() != "quit");
        }
        catch (IOException e){
            JOptionPane.showMessageDialog(null,e, "error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
