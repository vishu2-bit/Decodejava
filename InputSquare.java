package basics;

import java.util.Scanner;

public class InputSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its square : ");
        int n = sc.nextInt();
        System.out.print("the square is : "+n*n);
    }
}
