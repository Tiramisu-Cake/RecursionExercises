package com.company;

import java.util.ArrayList;

public class secondMaxFinder {

    // Подразумевается не менее двух элементов в списке
    public static int recursionSecondMax(int firstMax, int secondMax, int N, ArrayList<Integer> A) {
        if (N == 2) {
            return secondMax;
        }

        int currentElement = A.get(N-1);

        // если текущий элемент между первым и вторым максимальными
        if (secondMax <= currentElement && currentElement <= firstMax) {
            secondMax = currentElement;
        }

        // если текущий элемент максимальный
        if (firstMax <= currentElement) {
            secondMax = firstMax;
            firstMax = currentElement;
        }

        return recursionSecondMax(firstMax, secondMax, N - 1, A);
    }

    public static int secondMax(ArrayList<Integer> A) {
        //начальные значение для рекурсии
        int firstMax = A.get(0);
        int secondMax = A.get(1);

        if (firstMax <= secondMax) {
            int x = secondMax;
            secondMax = firstMax;
            firstMax = x;
        }

        int Asize = A.size();
        return recursionSecondMax(firstMax, secondMax, Asize, A);
    }
}
