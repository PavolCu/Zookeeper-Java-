import java.util.Scanner;

import static java.lang.System.in;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double sum = 0;
        double counter = 0;
        for (double i = a; i <= b; i++) {

            if (i % 3 == 0) {
                counter++;
                sum += i++;

            }
        }
        double average = sum / counter;
        System.out.println(average);
    }

}