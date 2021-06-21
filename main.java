 public class Main {
    public static void main(String[] args) {
        int account = 100;
        int replenish = 1100;
        int bonus;
        if (replenish >= 1000) {
            bonus = replenish / 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}