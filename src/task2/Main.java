package task2;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 999999; i++) {
            int digit1 = i / 100000;
            int digit2 = (i % 100000) / 10000;
            int digit3 = (i % 10000) / 1000;
            int digit4 = (i % 1000) / 100;
            int digit5 = (i % 100) / 10;
            int digit6 = i % 10;
            if (digit1 + digit2 + digit3 == digit4 + digit5 + digit6) {
                sum++;
            }
        }
        System.out.println("Количество счастливых билетиков: " + sum);
    }
}
