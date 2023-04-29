package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindAmountSales() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAmount = 180;
        int actualAmount = service.salesAmount(sale);
        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void shouldFindAverageSalesAmount() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.averageSalesAmount(sale);
        Assertions.assertEquals(expectedAverage, actualAverage);

    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxSales = 8;
        int actualMaxSales = service.maxSales(sale);
        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinSales = 9;
        int actualMinSales = service.minSales(sale);
        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void shouldFindAboveAverageSalesAmount() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAboveAverage = 5;
        int actualAboveAverage = service.aboveAverageSalesAmount(sale);
        Assertions.assertEquals(expectedAboveAverage, actualAboveAverage);
    }

    @Test
    public void shouldFindBelowAverageSalesAmount() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedBelowAverage = 5;
        int actualBelowAverage = service.belowAverageSalesAmount(sale);
        Assertions.assertEquals(expectedBelowAverage, actualBelowAverage);
    }
}