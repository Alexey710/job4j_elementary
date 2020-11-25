package ru.job4j.array;

public class MatrixCheck {
    public static boolean horizontal(char[][] board, int row) {
        boolean result = true;
        for (int line = 0; line < board[row].length; line++) {
            if (board[row][line] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean vertical(char[][] board, int column) {
        boolean result = true;
        for (int line = 0; line < board.length; line++) {
            if (board[line][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int row = 0; row < board.length; row++) {
            rsl[row] = board[row][row];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            if (board[row][row] == 'X' && (horizontal(board, row) || vertical(board, row))) {
                result = true;
                break;
            }
        }
        return result;
    }
}