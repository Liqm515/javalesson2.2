public class Main {
    public static void main(String[] args) {

        int BeforeReplenishment = 100;
        int Replenishment = 1500;
        int Bonus = BeforeReplenishment + Replenishment / 100;
        if (Replenishment < 1000) {
            Bonus = 0;
        }
        int Total = BeforeReplenishment + Replenishment + Bonus;
        System.out.println("Кол-во бонусов: " + Bonus);
        System.out.println("Итоговый баланс: " + Total);
    }
    }