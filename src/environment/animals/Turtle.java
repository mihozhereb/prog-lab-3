package environment.animals;

import products.Storage;

public class Turtle extends Animal{
    {
        setName("Черепаха");
        setSize((float) (Math.random() * 0.1 + 0.1));
    }

    @Override
    public void die() throws AnimalAlreadyDied {
        if (!isAlive()) {
            throw new AnimalAlreadyDied(this);
        }
        Storage.TurtleMeat.quantity.add((int) (getSize()));
        notAlive();
    }

    @Override
    public void grow() {
        setSize((float) (getSize() * (1 + Math.random() * 0.5)));
    }
}
