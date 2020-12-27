package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ChessBoardTest {
    @Test
    public void wayIs2() {
        int way = ChessBoard.way(0, 0, 2, 2);
        assertThat(way, is(2));
    }

    @Test
    public void wayIs1() {
        int way = ChessBoard.way(1, 1, 2, 0);
        assertThat(way, is(1));
    }

    @Test
    public void wayIs3() {
        int way = ChessBoard.way(0, 3, 3, 0);
        assertThat(way, is(3));
    }

    @Test
    public void wayIs0() {
        int way = ChessBoard.way(0, 3, 1, 3);
        assertThat(way, is(0));
    }
}