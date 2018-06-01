package com.leon.example.javajokelibrary;

import java.util.Random;

public class Joke {

    public static String getJoke() {
        Random randomizer = new Random();
        int randomInt = randomizer.nextInt();
        String jokeString = "";

        switch ((randomInt % 13)) {
            case 0:
                jokeString = "I'm reading a book about anti-gravity. It's impossible to put down!";
                break;
            case 2:
                jokeString = "What do you get when you cross a snowman with a vampire? Frostbite.";
                break;
            case 3:
                jokeString = "Why do chicken coops only have two doors? Because if they had four, they would be chicken sedans!";
                break;
            case 4:
                jokeString = "How do you make a Kleenex dance? Put a little boogie in it!";
                break;
            case 5:
                jokeString = "Why did the invisible man turn down the job offer? He couldn't see himself doing it.";
                break;
            case 6:
                jokeString = "I used to have a job at a calendar factory but I got the sack because I took a couple of days off.";
                break;
            case 7:
                jokeString = "Standing in the park, I was wondering why a Frisbee gets larger the closer it gets. Then it hit me.";
                break;
            case 8:
                jokeString = "I was reading a book on Helium. Could not put it down.";
                break;
            case 9:
                jokeString = "Is Silicon the same in Spanish? Si";
                break;
            case 10:
                jokeString = "How often do I like jokes about chemistry? Periodically.";
                break;
            case 11:
                jokeString = "I tried walking up a hill without a watch but had neither the time nor the inclination.";
                break;
            case 12:
            default:
                jokeString = "Five out of four people admit they are bad with fractions";
        }

        return jokeString;
    }

    public static String getJokeExtra() {
        return "JOKE_EXTRA";
    }
}
