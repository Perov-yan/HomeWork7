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
    }
}