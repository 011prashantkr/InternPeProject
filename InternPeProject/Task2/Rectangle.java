package Task2;

import java.util.Scanner;

//araa and parameter of rectangle
public class Rectangle {
    public static void main(String[] args) {
        double length,breath,area,parameter;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the length of rectangle:");
        length=scanner.nextDouble();
        System.out.println("enter the breath of rectangle:");
        breath=scanner.nextDouble();
        area=length*breath;
        parameter=2*(length*breath);
        System.out.println("area of ractangle is: " +area);
        System.out.println("parameter of ractangle is: " +parameter);

    }
}
