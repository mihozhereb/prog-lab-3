package environment.plants;

import counters.Counter;
import products.Storage;

public class Grape extends Plant implements Dryable, Fermentable {
    private final Counter bunchOfGrapesCounter = new Counter();

    {
        setName("Виноград");
        setColor("Темно-синий");
        setHeight(0.05f);
    }

    @Override
    public void grow() {
        bunchOfGrapesCounter.add(1 + (int)(Math.random() * 10));
        setHeight((float) (getHeight() + Math.random() * 0.05));
    }

    @Override
    public void dry() {
        Storage.RAISIN.quantity.add((int) (GetNumberOfBunchOfGrapes() * 0.5));
        bunchOfGrapesCounter.reset();
    }

    public int GetNumberOfBunchOfGrapes() {
        return bunchOfGrapesCounter.getCounter();
    }

    @Override
    public void ferment() {
        Storage.WINE.quantity.add((int) (GetNumberOfBunchOfGrapes() * 0.75));
        bunchOfGrapesCounter.reset();
    }
}
