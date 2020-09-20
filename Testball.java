package Lab2;
import java.lang.*;
public class Testball {
    public static void main(String[] args) {
        Ball b1 = new Ball(12,13);
        Ball b2 = new Ball(3,5);
        Ball b3 = new Ball(245,321);
        Ball b4 = new Ball(123,132);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        b1.move(666,675);
        b2.move(15,14);
        b3.move(754,823);
        b4.move(675,567);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}