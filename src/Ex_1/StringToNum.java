package Ex_1;

import java.util.ArrayList;
import java.util.Scanner;

public class StringToNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strings = str.split(" ");
        int sum = 0;
        int[] num = new int[strings.length];
        try {
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(strings[i]);
            sum += num[i];
            }
        }catch (NumberFormatException nf){
            sum = 0;
        }
        System.out.println(sum);
    }
}
