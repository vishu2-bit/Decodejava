package basics;

import java.util.Scanner;

public class VolumeOfaSphereInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");

        double r = sc.nextDouble();
        double v = (4 * 3.141592 * r * r * r )/3;

        System.out.print("volume of a sphere is : " +v);

    }
}
