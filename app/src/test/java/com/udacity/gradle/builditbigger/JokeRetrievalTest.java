package com.udacity.gradle.builditbigger;

import com.leon.example.javajokelibrary.Joke;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class JokeRetrievalTest {

    @Test
    public void jokeStringValidator()
    {
        assertFalse(Joke.getJoke().isEmpty() );
    }
}
