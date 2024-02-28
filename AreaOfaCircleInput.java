package basics;

import java.util.Scanner;

public class AreaOfaCircleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius : ");

        double r = sc.nextDouble();
        double a = 3.141592 *r *r;

        System.out.print("Area of a circle is : "+a);
    }
}
