package homework.cycles;

public class MoneyTask8 {
    public static void main(String[] args) {
//        howManyRubles(2);
    }

    public static void howManyRubles(int rubles) {
        if (rubles >= 5 || rubles == 0) {
            System.out.println("У тебя " + rubles + " рублей ;)");
        }
        if (rubles < 5){
            System.out.println("Печально: у тебя " + rubles + " рубля");
            if (rubles == 1){
                System.out.println("У тебя " + rubles + "рубль");
            }
        }
    }
}
