package environment.plants;

import products.Storage;

public class Wheat extends Plant implements Collectable {
    {
        setName("Пшеница");
        setColor("Желтый");
        setHeight(0.05f);
    }

    @Override
    public void collect() {
        Storage.WHEAT.quantity.add((int) (getHeight() * 100));
        setHeight(0.05f);
    }

    @Override
    public void grow() {
        setHeight((float) (getHeight() + Math.random() * 0.3));
    }
}
