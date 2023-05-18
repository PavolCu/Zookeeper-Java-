import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int b = SCANNER.nextInt();
        int h = SCANNER.nextInt();
        countAreaOfParallelogram(b, h);
    }

    public static void countAreaOfParallelogram(int b, int h) {
        System.out.println(b * h);
    }
}