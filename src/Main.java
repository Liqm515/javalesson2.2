public class Main {
    public static void main(String[] args) {

        int beforeReplenishment = 100;
        int replenishment = 1500;
        int bonus = beforeReplenishment + replenishment / 100;
        if (replenishment < 1000) {
            bonus = 0;
        }
        int total = beforeReplenishment + replenishment + bonus;
        System.out.println("Кол-во бонусов: " + bonus);
        System.out.println("Итоговый баланс: " + total);
    }
    }