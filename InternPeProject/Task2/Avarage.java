package Task2;

import java.util.Scanner;

public class Avarage {
    public static void main(String[]args){
        double f1,f2,f3,avarage;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first no:");
        f1=scanner.nextDouble();
        System.out.println("enter the Second no:");
        f2=scanner.nextDouble();
        System.out.println("enter the third no:");
        f3=scanner.nextDouble();
        avarage=(f1+f2+f3)/3;
        System.out.printf("avarage is "+ avarage);
    }
}
