package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Recursion {
    // 1. Возведение в степень
    public static int power(int N, int M) {
        if (M == 1) {
            return N;
        }
        return N * power(N, M - 1);
    }

    // 2. Сумма цифр числа
    public static int sumOfNumbers(int N) {
        if(N < 10) {
            return N;
        }
        return N % 10 + sumOfNumbers(N/10);
    }

    // 3. Подсчет элементов в списке через pop()
    public static int listCount(LinkedList L) {
        try {
            L.pop();
        }
        catch (NoSuchElementException E) {
            return 0;
        }
        return 1 + listCount(L);
    }

    // 4. Является ли строка палиндромом
    public static boolean isPalindromic(String S) {
        int lengthOfS = S.length();
        if (lengthOfS == 1 || lengthOfS == 0) {
            return true;
        }
        // Проверка первого и последнего элемента на равенство и их удаление
        if(S.charAt(0) == S.charAt(S.length() - 1)) {
            String subS = S.substring(1,S.length() - 1);
            return isPalindromic(subS);
        }
        return false;
    }

    // 5. Печать четных чисел из списка
    public static void printEven(ArrayList<Integer> A) {
        ArrayList<Integer> Acopy = new ArrayList();
        Acopy.addAll(A);
        try {
            int x = Acopy.get(0);
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }
        catch (IndexOutOfBoundsException e) {
            return;
        }
        Acopy.remove(0);
        printEven(Acopy);
    }

    // 6. Печать элементов с четными индексами
    public static void printEvenIndexes(ArrayList A) {
        ArrayList Acopy = new ArrayList();
        Acopy.addAll(A);
        try {
            System.out.println(Acopy.get(0));
            Acopy.remove(0);
            Acopy.remove(0);
        }
        catch (IndexOutOfBoundsException e) {
            return;
        }
        printEvenIndexes(Acopy);
    }

}
