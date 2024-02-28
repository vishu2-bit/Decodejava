package basics;

import java.util.Scanner;

public class HalfOfaInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer : ");

        int i = sc.nextInt();
        double d = (double) i;

        System.out.print("Half of an Integer is : "+d/2);
    }
}
