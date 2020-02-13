package ru.scrib.firstLaba;

public class Printer {
    /**
     * Печатает строку вида: +--+
     *
     * @param w количество символов в строке
     */
    public static void printHyphenLine(int w) {
        System.out.print('+');
        for (int i = 0; i < w - 2; i++) {
            System.out.print('-');
        }
        System.out.print('+');
        System.out.println();
    }

    /**
     * Печатает основную строку
     *
     * @param startSymbol        символ с которого начнётся строка и квадрат
     * @param intermediateSymbol символ, который будет чередоваться со стартовым
     * @param w                  количество символов в строке
     * @param s                  размер квадрата
     */
    public static void printMainLine(char startSymbol, char intermediateSymbol, int w, int s) {
        System.out.print('|');
        char tempSymb = startSymbol;
        int j = 0;
        int k = 0;
        while (j < w - 2) {
            if (k == s) {
                tempSymb = tempSymb == startSymbol ? intermediateSymbol : startSymbol;
                k = 0;
            }
            System.out.print(tempSymb);
            k++;
            j++;
        }
        System.out.print('|');
        System.out.println();
    }
}
