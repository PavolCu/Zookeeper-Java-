import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max4 = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a % 4 == 0 && a > max4) {
                max4 = a;
            }
        }
        System.out.println(max4);
    }
}
