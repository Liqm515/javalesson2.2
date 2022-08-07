public class Main {
    public static void main(String[] args) {

        int beforbalance = 100;
        int popolnenie = 1500;
        int bonus = beforbalance + popolnenie / 100;
        if (popolnenie < 1000)
            bonus = 0;
        int total = beforbalance + popolnenie + bonus;
        System.out.println("Кол-во бонусов: " + bonus);
        System.out.println("Итоговый баланс: " + total);
    }
    }