public class Main {
    public static void main(String[] args) {

        int initial = 100; //начальный баланс
        int add = 1100; // сумма пополнения
        int balance = (initial + add); // итоговый баланс
        int bonus = 1; // бонус
        int addbonus;
        if (add > 1000) {
            addbonus = (add / 100 * bonus);
        } else {
            addbonus = 0;
        }
        System.out.println((initial + add + addbonus) + " ваш баланс с бонусами");


    }
}