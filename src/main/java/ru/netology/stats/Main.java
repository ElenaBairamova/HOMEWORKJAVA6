package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        System.out.println("Сумма всех продаж " + service.salesAmount(sale));
        System.out.println("Средняя сумма продаж " + service.averageSalesAmount(sale));
        System.out.println("Пик продаж был в " + service.maxSales(sale) + " месяце");
        System.out.println("Минимум продаж было в " + service.minSales(sale) + " месяце");
        System.out.println("Выше среднего было в " + service.aboveAverageSalesAmount(sale) + " месяцах");
        System.out.println("Ниже среднего было в " + service.belowAverageSalesAmount(sale) + " месяцах");
    }

}
