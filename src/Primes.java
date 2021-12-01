import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        int numbers;
        int count = 0;
        int num = 2;
        boolean IsPrime = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your numbers: ");
        numbers = scanner.nextInt();

        while (count < numbers) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    IsPrime = false;
                    break;
                }
            }
            if (IsPrime) {
                System.out.println(num);
                count++;
            }
            num++;
            IsPrime = true;
        }

    }

}

