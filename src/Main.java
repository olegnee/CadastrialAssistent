import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите стоимость квадратного метра: \nВведите 0, чтобы закончить.");
            int priceForSquareMeter = scanner.nextInt();
            if (priceForSquareMeter == 0) break;
            System.out.println("Сколько сделок Вам нужно: ");
            int amountOfDeals = scanner.nextInt();
            List<SomePlace> deals = dealCreator(amountOfDeals, priceForSquareMeter);
            System.out.println(deals);


        }

    }
    public static List<SomePlace> dealCreator (int amountOfDeals, int priceForSquareMeter) {
        List<SomePlace> listOfDeals = new ArrayList<>();
        SomePlace oneOfDeal;
        for(int i = 0; i < amountOfDeals; i++) {
            boolean isHonest;
            int length = (int) (Math.random() * 10 * 100);
            int width = (int) (Math.random() * 10 * 100);
            int price = (int) (Math.random() * 40 * 100);
            int honestPrice = length * width * priceForSquareMeter;
            if (honestPrice >= price) {
                isHonest = true;
            }else isHonest = false;
            oneOfDeal = new SomePlace(length, width, price, isHonest);
            listOfDeals.add(oneOfDeal);
        }
        return listOfDeals;
    }
}