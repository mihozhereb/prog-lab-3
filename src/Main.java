import counters.TimeCounter;
import environment.animals.Turtle;
import environment.plants.Grape;

public class Main {
    public static void main(String[] args) {
        TimeCounter currentTime = new TimeCounter(1459);
        currentTime.GetNow();
        currentTime.NextDay();
        currentTime.GetNow();

//        Grape grape1 = new Grape();
//        Grape grape2 = new Grape();
//
//        grape1.grow();
//
//        grape1.ferment();
//        grape2.ferment();
//
//        System.out.println(Storage.WINE.quantity.getCounter());
//        System.out.println(Storage.RAISIN.quantity.getCounter());

//        Turtle t1 = new Turtle();
//        t1.se

//        System.out.println(1 / 0);

        System.out.println(new Grape());
    }
}