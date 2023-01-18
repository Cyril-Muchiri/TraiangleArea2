package muchiri;
//Print the average of three numbers entered by user by creating a class named
// 'Average' having a method to calculate and print the average.


import java.util.Scanner;

public class Average {
    double a,b,c;
    double getAverage(){

        double result=(a+b+c)/3;

        return result;

    }




}
class Compute{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);

        Average answer=new Average();

        System.out.println("Enter 3 numbers to compute the average");
        System.out.println("Enter 1st number: a");

        answer.a= scan.nextInt();

        System.out.println("Enter 2nd number b: ");
        answer.b= scan.nextInt();

        System.out.println("Enter 3rd number c: ");
        answer.c= scan.nextInt();

        scan.close();

        System.out.println("Your average is "+answer.getAverage());




    }
}
