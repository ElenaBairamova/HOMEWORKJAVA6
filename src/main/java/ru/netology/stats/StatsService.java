package ru.netology.stats;

public class StatsService {

    public int salesAmount(int[] sale) {
        int sum = 0;

        for (int sales : sale) {
            sum += sales;
        }
        return sum;
    }

    public int averageSalesAmount(int[] sale) {
        int average = 0;
        if (sale.length > 0) {
            int sum = 0;
            for (int i = 0; i < sale.length; i++) {

                sum += sale[i];
            }
            average = sum / sale.length;
        }
        return average;
    }

    public int maxSales(int[] sale) {
        int maxMonth = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] >= sale[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;

    }

    public int minSales(int[] sale) {
        int minMonth = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] <= sale[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int aboveAverageSalesAmount(int[] sale) {
        int average = 0;
        int aboveAverage = 0;
        if (sale.length > 0) {
            int sum = 0;
            for (int i = 0; i < sale.length; i++) {

                sum += sale[i];
            }
            average = sum / sale.length;
        }
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] > average) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }

    public int belowAverageSalesAmount(int[] sale) {
        int average = 0;
        int belowAverage = 0;
        if (sale.length > 0) {
            int sum = 0;
            for (int i = 0; i < sale.length; i++) {

                sum += sale[i];
            }
            average = sum / sale.length;
        }
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] < average) {
                belowAverage++;
            }
        }
        return belowAverage;
    }
}
