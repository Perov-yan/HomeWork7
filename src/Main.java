public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1:");
        double totalMoney = 0;
        short moneyPerMount = 15000;
        int targetMoney = 2459000;
        int month = 0;
        double rate = 0;
        while (totalMoney < targetMoney){
            rate = (totalMoney / 100) * 1;
            totalMoney = totalMoney + rate + moneyPerMount;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalMoney + " рублей");
        }
        System.out.println("Для накопления суммы " + totalMoney + " рублей понадобилось " + month + " месяцев");
        System.out.println(" ");
        System.out.println("Задача 2:");
        int i = 1;
        while (i <= 10){
            System.out.print(i + " ");
            i++;
        }
        System.out.println(" ");
        i = 10;
        for (; i >= 1;){
            System.out.print(i + " ");
            i--;
        }
        System.out.println(" ");
        System.out.println("Задача 3:");
        int population = 12000000;
        int birth = 17;
        int dead = 8;
        int birthRate = 0;
        int deadRate = 0;
        int populationPerYear = 0;
        for (int year = 1; year <= 10; year++){
            birthRate = birth * population/1000;
            deadRate = dead * population/1000;
            populationPerYear = birthRate - deadRate;
            population = population + populationPerYear;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }


    }
}