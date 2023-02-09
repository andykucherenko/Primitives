public class Main {

    public static void main(String[] args) {
        int priceTicket = 13676;
        int bonusPerMile = 20;

        int miles;
        if (priceTicket < 0) {
            System.out.println("Стоимость билета не может быть отрицательной!");
        } else {
            miles = priceTicket / bonusPerMile;
            System.out.println("Начислено бонусов: " + miles);
        }
    }
}