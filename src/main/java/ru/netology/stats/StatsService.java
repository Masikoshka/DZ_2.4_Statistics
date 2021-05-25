package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    public long totalSales(long[] sales) {
        long sum = 0;

        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSales(long[] sales, long sum) {
        long average = sum / sales.length;

        return average;
    }

    public long belowAverageSales(long[] sales, long average) {
        int countMonth = 0;

        for (long sale: sales) {
            if (average > sale)
                countMonth++;
        }
        return countMonth;
    }

    public long aboveAverageSales(long[] sales, long average) {
        int countMonth = 0;

        for (long sale: sales) {
            if (average < sale)
                countMonth++;
        }
        return countMonth;
    }

}
