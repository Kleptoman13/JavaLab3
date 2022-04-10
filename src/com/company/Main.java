package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        task13();
        //task24();
        //task47();
    }

    /**Дана строка. Подсчитать количество содержащихся в ней цифр.*/

    public static void task13()
    {
        int k =0;
        String str = "hththftft1346546 dsfdsfsddc13";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
            {
                k++;
            }
        }
        System.out.println("Количество чисел в строке " + k);
    }

    public static void task24()
    {
        String str = "101101110";
        System.out.println(str);
        System.out.println(Integer.parseInt(str, 2));
    }

    public static void task47()
    {
        String str = "Собака кот мышь";

        System.out.println(str);
        System.out.println(str.replaceAll(" ", "."));

    }
}
