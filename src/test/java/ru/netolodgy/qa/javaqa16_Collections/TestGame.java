package ru.netolodgy.qa.javaqa16_Collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGame {
    @Test
    public void firstPlayerMustWin() {
        Player player1 = new Player(01, "Anna", 150);
        Player player2 = new Player(02, "Boris", 70);

        Game game = new Game();
        game.register(player1);
        game.register(player2);
        int actual = game.round("Anna", "Boris");
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void secondPlayerMustWin() {
        Player player1 = new Player(01, "Anna", 50);
        Player player2 = new Player(02, "Boris", 70);

        Game game = new Game();
        game.register(player1);
        game.register(player2);
        int actual = game.round("Anna", "Boris");
        int expected = 2;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldToDraw() {
        Player player1 = new Player(01, "Anna", 60);
        Player player2 = new Player(02, "Boris", 60);

        Game game = new Game();
        game.register(player1);
        game.register(player2);
        int actual = game.round("Anna", "Boris");
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testNotRegisteredException() {
        Player player1 = new Player(01, "Anna", 60);
        Player player2 = new Player(02, "Boris", 60);

        Game game = new Game();
        game.register(player1);
        game.register(player2);

        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Katya", "Anna"));
        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Anna", "Mari"));
        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Katya", "Mari"));
    }

}
