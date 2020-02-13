package ru.scrib.firstLaba;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Initiator {
    public static int initW(Scanner in) {
        boolean isNotCorrect = true;
        int num = 0;
        while (isNotCorrect) {
            System.out.print("Введите ширину поля: ");
            try {
                num = in.nextInt();
                isNotCorrect = false;
                if (num < 3)
                    throw new OutOfRangeException("ERROR: Ширина поля должа быть не меньше 3, иначе никакой квадрат не впишем");
            } catch (InputMismatchException e) {
                isNotCorrect = true;
                System.err.println("ERROR: Введите корректное число!");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException er) {
                    er.printStackTrace();
                }
                in.next();
            } catch (OutOfRangeException e) {
                isNotCorrect = true;
                System.err.println(e.getMessage());
                try {
                    Thread.sleep(50);
                } catch (InterruptedException er) {
                    er.printStackTrace();
                }
            }
        }
        return num;
    }

    public static int initH(Scanner in) {
        boolean isNotCorrect = true;
        int num = 0;
        while (isNotCorrect) {
            System.out.print("Введите высоту поля: ");
            try {
                num = in.nextInt();
                isNotCorrect = false;
                if (num < 3)
                    throw new OutOfRangeException("ERROR: высота поля должа быть не меньше 3, иначе никакой квадрат не впишем");
            } catch (InputMismatchException e) {
                isNotCorrect = true;
                System.err.println("ERROR: Введите корректное число!");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException er) {
                    er.printStackTrace();
                }
                in.next();
            } catch (OutOfRangeException e) {
                isNotCorrect = true;
                System.err.println(e.getMessage());
                try {
                    Thread.sleep(50);
                } catch (InterruptedException er) {
                    er.printStackTrace();
                }
            }
        }
        return num;
    }

    public static int initS(Scanner in, int w, int h) {
        boolean isNotCorrect = true;
        int num = 0;
        while (isNotCorrect) {
            System.out.print("Введите размер квадрата из звездочек: ");
            try {
                num = in.nextInt();
                isNotCorrect = false;
                if (num == 0) throw new OutOfRangeException("ERROR: нет смысла рисовать пустоту");
                if (num < 0)
                    throw new OutOfRangeException("ERROR: так не пойдёт. Квадрата с отрицательной размерностью не существует");
                if (num >= w || num >= h)
                    throw new OutOfRangeException("ERROR: квадрат с таким размером не влезет в поле. Размер квадрата не должен превышать " + (Math.min(w, h) - 2));
            } catch (InputMismatchException e) {
                isNotCorrect = true;
                System.err.println("ERROR: Введите корректное число!");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException er) {
                    er.printStackTrace();
                }
                in.next();
            } catch (OutOfRangeException e) {
                isNotCorrect = true;
                System.err.println(e.getMessage());
                try {
                    Thread.sleep(50);
                } catch (InterruptedException er) {
                    er.printStackTrace();
                }
            }
        }
        return num;
    }
}
