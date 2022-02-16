import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x,y;
        System.out.println("input a:");
        double a = input.nextDouble();
        System.out.println("input b:");
        double b =input.nextDouble();
        System.out.println("input c:");
        double c =input.nextDouble();
        System.out.println("input d:");
        double d =input.nextDouble();
        System.out.println("input e:");
        double e =input.nextDouble();
        System.out.println("input f:");
        double f =input.nextDouble();
    
        x=((e*d)-(b*f))/((a*d)-(b*c));
        y=((a*f)-(e*c))/((a*d)-(b*c));
        System.out.println("value of x = "+x);
        System.out.print("value of y = "+y);
    }
}
