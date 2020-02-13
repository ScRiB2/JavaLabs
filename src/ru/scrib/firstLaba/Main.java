package ru.scrib.firstLaba;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int w = Initiator.initW(in), h = Initiator.initH(in), s = Initiator.initS(in, w, h);
        in.close();

        Printer.printHyphenLine(w);

        char startSymbol = '*';
        char intermediateSymbol = ' ';
        int i = 0;
        int k = 0;
        while (i < h - 2) {
            if (k == s) {
                char tempSymbol = startSymbol;
                startSymbol = intermediateSymbol;
                intermediateSymbol = tempSymbol;
                k = 0;
            }

            Printer.printMainLine(startSymbol, intermediateSymbol, w, s);

            k++;
            i++;
        }

        Printer.printHyphenLine(w);
    }
}
