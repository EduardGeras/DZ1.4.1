public class Main {
    public static void main(String[] args) {

        // Задание 4
        for (int i = 1; i <=30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": ping pong");
            } else if (i % 3 == 0) {
                System.out.println(i + ": ping");
            } else if (i % 5 == 0) {
                System.out.println(i + ": pong");
            } else {
                System.out.println(i + ":");
            }
        }

        // Задание 5
        int k = 0;
        int j = 1;
        System.out.print(k + " ");
        System.out.print(j + " ");
        for(int t = 0; t < 9; t++) {
            k = k + j;
            System.out.print(k + " ");
            j = k - j;
        }
    }
}