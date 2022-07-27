public class main {

    public static void main(String[] args) {
        int ticketCost = 1000; // стоимость билета
        int rub = 20; // количество рублей для одной бонусной мили
        int bonusMiles= ticketCost / rub; // колличество начисленных бонусных миль

        System.out.println("Количество начисленных миль за купленный билет составляет:");
        System.out.println(bonusMiles + " бонусных миль");
    }
}

