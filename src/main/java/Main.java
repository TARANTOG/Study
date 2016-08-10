public class Main {
    public static void main(String args[]) {
        int div;
        for (int num = 2; num <= 100; num++) {
            div = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) div++;
            }
            if (div <= 2) System.out.println(num);
        }
    }
}