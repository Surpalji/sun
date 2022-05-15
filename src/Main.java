public class Main {
    public static void main(String[] args) {

        int check = 100;
        int pay = 2000;
        int bonus;
        int sum = check + pay;
        if (pay > 1000) {
            bonus = pay / 100;
        } else {
            bonus = 0;

        }
        System.out.println("miles: " + bonus);
        System.out.println("итоговый счет: " + sum);
    }
}








