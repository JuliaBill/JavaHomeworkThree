package Homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeworkThree {

    public static void main(String[] args) {

        adition();
        substruction();
        multiplication();
        division();

        convertEuroToDollar(2000, 1.10);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое слово состоящее из четного числа символов:");
        String firstWord = scanner.nextLine();

        System.out.println("Введите второе слово состоящее из четного числа символов:");
        String secondWord = scanner.nextLine();

        String sum = returnNewWord(firstWord, secondWord);
        System.out.println("В результате сложения первой половины первого слова и второй половины второго слова " +
                "получилось: " + sum);
        System.out.println("returnNewWord(\"java\", \"lesson\") = " + returnNewWord("java", "lesson"));
    }

    static String returnNewWord(String strOne, String strTwo) {

        int lengthOfFirstString = strOne.length();
        int lengthOfSecondString = strTwo.length();


        int midIndexOfFirstString = lengthOfFirstString / 2;
        int midIndexOfSecondString = lengthOfSecondString / 2;


        String firstHalfOfFirstString = strOne.substring(0, midIndexOfFirstString);
        String secondHalfOfSecondString = strTwo.substring(midIndexOfSecondString, lengthOfSecondString);

        String resultOfConcatenation = firstHalfOfFirstString + secondHalfOfSecondString;

        return resultOfConcatenation;


    }

    static void adition() {
        int a = 5, b = 7;
        int c = a + b;
        System.out.println(c);
    }

    static void substruction() {
        int c = 12;
        short d = (short) (c - 7);
        System.out.println(d);

    }

    static void multiplication() {
        double a = 2.5;
        double i = 3.2 * a;
        System.out.println(i);
    }

    static void division() {

        int a = 200;
        int b = 20;
        int c = a / b;
        System.out.println(c);
    }

    static void convertEuroToDollar(double amountInEuro, double exchangeRate) {

        double amountInDollars = amountInEuro * exchangeRate;
        System.out.printf("Beim Kurs vom %.2f USD für ein EUR, im Umtausch von %.2f EUR, bekommen Sie %.2f USD."+" ",
                exchangeRate, amountInEuro, amountInDollars);
    }
}