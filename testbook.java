package Lab3;
import java.lang.*;
public class testbook {
    public static void main(String[] args) {
        book b1 = new book("Герой нашего времени","Михаил Лермонтов",450,160);
        book b2 = new book("Капитанская дочка","Александр Сергеевич Пушкин",205,230);
        book b3 = new book("Собачье сердце","Михаил Булгаков",154,600);
        book b4 = new book("Над пропастью во ржи","Джером Дэвид Сэлинджер",800,1569);
        b1.GetPrice();
        b2.GetPrice();
        b3.GetPrice();
        b4.GetPrice();
    }
}