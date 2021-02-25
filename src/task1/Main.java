package task1;

public class Main {
    public static void main(String[] args) {
        int clock = 0;
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 59; j++) {
                if (i / 10 % 10 == j % 10 && i % 10 == j / 10 % 10) {
                    clock++;
                }
            }
        }
        System.out.println(clock + " раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация для той, что справа от двоеточия");
    }
}