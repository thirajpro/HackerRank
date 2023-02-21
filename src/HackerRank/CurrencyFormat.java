package HackerRank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.*;
import java.util.Currency;

public class CurrencyFormat extends NullPointerException {
    CurrencyFormat(Locale locale){

    }

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        // Write your code here.


        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat formatterFr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat formatterCh = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat formatterInd = NumberFormat.getCurrencyInstance(Locale.of(locale.getVariant()));
        String us = formatter.format(payment);
        String india = formatterInd.format(payment);
        String china = formatterCh.format(payment);
        String france = formatterFr.format(payment);
        System.out.println("US: " + us);
        System.out.println("India: "+ india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }


    }

