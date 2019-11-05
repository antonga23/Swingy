package Swingy.Controller;
import Swingy.Model.Character.*;

import java.util.Random;
import java.util.Scanner;

public class HeroGeneration {

    public static Hero generateHero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Great. Lets create a hero for you");
        System.out.println("What will you name your hero?");
        String heroName = scanner.nextLine();
        System.out.println("What class is your hero?");
        String heroClass = scanner.nextLine();
        System.out.println(".........................");
        System.out.println("Initialising hero stats");
        Random seed = new Random();
        int randomAttack = seed.nextInt(800) + 200;
        System.out.println("The randomly generated attack is " + randomAttack);
        int randomDefense = seed.nextInt(500) + 200;
        System.out.println("The randomly generated attack is " + randomDefense);
        int randomHitPoints = seed.nextInt(700) + 200;
        System.out.println("The randomly generated hitPoints are " + randomHitPoints);
        Hero userHero = new Hero(heroName,randomAttack,randomDefense,randomHitPoints,heroClass);
        System.out.println(userHero);
        return userHero;
    }

    public void validateUserInput(){}

    public Hero[] loadsavedHeros(){
        Ash ash = new Ash("Ash");
        Misty misty = new Misty("Misty");
        Brock brock = new Brock("Brock");
        Hero heros[] = new Hero[2];
        heros[0] = ash;
        heros[1] = misty;
        heros[2] = brock;
        return heros;
    }
}
