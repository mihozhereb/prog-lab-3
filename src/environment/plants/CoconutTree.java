package environment.plants;

import counters.Counter;
import products.Storage;

public class CoconutTree extends Plant implements Collectable {
    private final Counter coconutCounter = new Counter();

    {
        setName("Кокосовая пальма");
        setColor("Зеленый");
        setHeight(0.2f);
    }

    @Override
    public void grow() {
        coconutCounter.add(1 + (int)(Math.random() * 3));
        setHeight((float) (getHeight() + Math.random() * 0.25));
    }

    public int GetNumberOfCoconuts() {
        return coconutCounter.getCounter();
    }

    @Override
    public void collect() {
        Storage.COCONUT.quantity.add(GetNumberOfCoconuts());
        coconutCounter.reset();
    }
}
