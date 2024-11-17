public class Main {
    public static void main(String[] args) {
        int ticket = 45_000;
        boolean mile = true;

        int value;
        if (mile) {
            value = 20;
        } else {
            value = 0;
        }
        int bonus = ticket / value;

        System.out.println("Итог:" + bonus);




    }
}