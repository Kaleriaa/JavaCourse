package Ex_2;

import java.util.Scanner;

public class PrimeFactors {
        public static void searchPrimeFactors(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число: ");
            int num = scanner.nextInt();
            int digit = 2;
            while (num != 1) {
                if (num % digit == 0){
                    System.out.println(digit + "  ");
                    num /= digit;
                }else if (digit == 2)
                    digit++;
                 else
                    digit += 2;
            }
        }
}
