package com.example.user.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

/**
 * Created by user on 05/07/2017.
 */

public class GameTest {
    Game game;

    @Before
    public void before() {
        game = new Game();
    }

    @Test
    public void canGetOptionAtIndex() {
       assertEquals("Paper", game.getOptionAtIndex(1));
    }

    @Test
    public void canGetOption() {
        String option = game.getOption();
        System.out.println("getOptionTest. Option = " + option);
        assertNotNull(option);
    }

    @Test
    public void canRunGame() {
        assertEquals("You win!", game.run("Paper", "Rock"));
    }


}
