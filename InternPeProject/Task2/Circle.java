package Task2;
import java.util.Scanner;
//area and parameter of circle

public class Circle {
    public static void main(String[]args){
        double radius,area,parameter;
       final float PI=3.14F;
       Scanner sacnner=new Scanner(System.in);
        System.out.println("enter the radius of circle");
        radius=sacnner.nextDouble();
        area=PI*(radius*radius);
        parameter=2*PI*radius;
        System.out.println("The area of circle is :" +area);
        System.out.println("The Parameter of circle is :" +parameter);

    }
}
