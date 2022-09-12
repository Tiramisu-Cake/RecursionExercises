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
    public static void printEven(ArrayList<Integer> A) {
        ArrayList<Integer> Acopy = new ArrayList();
        Acopy.addAll(A);
        if (A.size() == 0) {
            return;
        }
        int x = Acopy.get(0);
        if (x % 2 == 0) {
            System.out.println(x);
        }
        Acopy.remove(0);
        printEven(Acopy);
    }

    // 6. Печать элементов с четными индексами
    public static void printEvenIndexes(ArrayList A) {
        ArrayList Acopy = new ArrayList();
        Acopy.addAll(A);
        int Asize = Acopy.size();
        if (Asize == 0) {
            return;
        }
        System.out.println(Acopy.get(0));
        if (Acopy.size() < 2) {
            return;
        }
        Acopy.remove(0);
        Acopy.remove(0);
        printEvenIndexes(Acopy);
    }

    // 7. Нахождение второго максимального в списке
    // Подразумевается, что рекурсивная функция вызывается только из основной,
    // т.к. она меняет входящий список
    public static int recursionSecondMax(ArrayList<Integer> A) {
        int max = A.get(0);
        if (A.size() == 1) {
            return max;
        }
        if (max < A.get(1)) {
            A.remove(0);
        } else {
            A.remove(1);
        }
        return recursionSecondMax(A);
    }
    public static int secondMax(ArrayList<Integer> A) {
        ArrayList<Integer> Acopy = new ArrayList<>(A);
        int firstMax = recursionSecondMax(Acopy); // находим первый максимальный
        Acopy = new ArrayList<>(A);
        Acopy.removeAll(Arrays.asList(firstMax)); // удаляем все первые максимальные
        return recursionSecondMax(Acopy);
    }

}
