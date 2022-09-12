package com.company;

import java.util.ArrayList;
import java.util.Arrays;
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
        if (L.size() == 0) {
            return 0;
        }
        L.pop();
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
    public static void recursionPrintEven(int N, ArrayList<Integer> A) {
        if (N == 0) {
            return;
        }
        int x = A.get(N - 1);
        if (x % 2 == 0) {
            System.out.println(x);
        }
        recursionPrintEven(N - 1,A);
    }

    public static void printEven(ArrayList<Integer> A) {
        int Asize = A.size();
        recursionPrintEven(Asize, A);
    }

    // 6. Печать элементов с четными индексами
    public static void recursionPrintEvenIndexes(int N, ArrayList A) {
        if (N == 0) {
            return;
        }
        if (( A.size() - N) % 2 == 0) {
            System.out.println(A.get(A.size() - N));
        }
        recursionPrintEvenIndexes(N-1,A);
    }
    public static void printEvenIndexes(ArrayList A) {
        int Asize = A.size();
        recursionPrintEvenIndexes(Asize,A);
    }

}
