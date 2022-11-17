
import java.util.Random;
import java.util.Scanner;
public class Chapter3 {
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    public String chapter3_1(){

        System.out.print("Enter a,b,c: " );
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double discriminant = Math.pow(b*b-4*a*c,0.5);
        double r1 = (-b + discriminant)/2*a;
        double r2 = (-b - discriminant)/2*a;
        if (discriminant == 0){
            return "The equation has one root " + r1;
        }
        else if (discriminant > 0){
            return "The equation has two roots " + r1 + " and " + r2;
        }
        return "The equation has no real roots";


    }
    public String chapter3_2(){
        int n1 = random.nextInt(100);
        int n2 = random.nextInt(100);
        System.out.print("what is " + n1 +" "+ n2 + "? ");
        int result = scanner.nextInt();
        return n1 + n2 == result? " correct! ": "you are wrong,\nthe answer is " + (n1 + n2);
    }
    public String chapter3_3(){
        System.out.print("Enter a,b,c,d,e,f:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        int x = (e * d - f * b)/(a * d - c * b);
        int y = (a * f - c * e)/(a * d - c * b);
        try {
            if (a * d - b * c == 0)
                return "The equation has no solution";
        }catch (Exception exception){
            exception.printStackTrace();
        }

        return "x is " + x + " and y is " + y;
    }


}
