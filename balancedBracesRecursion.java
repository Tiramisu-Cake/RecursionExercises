package com.company;

public class balancedBracesRecursion {
    /*
    начальные значения:
    n - количество открывающихся скобок;
    openCount = 0;
    open = "";
    result = "";
    */

    public static void balancedBraces(int n, int openCount, String open, String result){
        if (openCount==n && open.length()==0){
            System.out.print(result+" ");
            return;
        }

        // если можно добавить открытую скобку, добавляем её
        if(openCount<n){
            balancedBraces(n, openCount+1, open+"(", result+"(");
        }

        // если можно закрыть скобку, закрываем её
        if(open.length()>0){
            if (open.charAt(open.length()-1)=='('){
                balancedBraces(n, openCount, open.substring(0, open.length()-1), result+")");
            }
        }
    }

}
