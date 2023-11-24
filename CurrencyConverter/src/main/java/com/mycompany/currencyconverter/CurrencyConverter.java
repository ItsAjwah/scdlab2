/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.currencyconverter;

import java.util.Scanner;
public class CurrencyConverter {

    private static String[] currencies = {"USD", "PKR", "Pound", "Dirham", "INR", "BDT", "JPY"};
    private static double[] exchangeRates = {1.0, 236.0, 0.88, 3.67, 79.0, 104.0, 142.0};

    public static double convert(String fromC, double amount, String toC) {
        int fromIndex = -1;
        int toIndex = -1;

      
        for (int i = 0; i < currencies.length; i++) {
            if (currencies[i].equals(fromC)) {
                fromIndex = i;
            }
            if (currencies[i].equals(toC)) {
                toIndex = i;
            }
        }

        if (fromIndex == -1 || toIndex == -1) {
            System.out.println(" Currency Not Available");
            return 0.0; 
        }

        double fromRate = exchangeRates[fromIndex];
        double toRate = exchangeRates[toIndex];

        return (amount / fromRate) * toRate;
    }

    public static void main(String[] args) {
        double convertedAmount = CurrencyConverter.convert("USD", 50, "Dirham");
        if (convertedAmount != 0.0) {
            System.out.println("50 USD is approximately " + convertedAmount + " Dirham");
        }
    }
}

