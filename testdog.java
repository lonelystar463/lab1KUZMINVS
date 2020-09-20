package Lab1;
import java.lang.*;
public class testdog {
    public static void main(String[] args) {
        dog d1 = new dog("Саша",3);
        dog d2 = new dog("Керчик", 8);
        dog d3 = new dog("Бернард");
        dog d4 = new dog("Веник");
        d3.setAge(13);
        d4.setAge(7);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
        d4.intoHumanAge();
    }
}