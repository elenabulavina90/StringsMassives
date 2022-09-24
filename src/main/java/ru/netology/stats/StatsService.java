package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
        result += sale;
        }
        return result;
    }

    public long average(long[] sales) {
        return sum(sales) / 12;
    }

    public int maximum(long[] sales) {
        long maxSale = sales[0];
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxSale = sales[i];
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public int minimum(long[] sales) {
        long minSale = sales[0];
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                minSale = sales[i];
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int belowMonth(long[] sales) {
        long average = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }
        }
        return counter;
    }

    public int aboveMonth(long[] sales) {
        long average = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > average) {
                counter++;
            }
        }
        return counter;
    }
}
