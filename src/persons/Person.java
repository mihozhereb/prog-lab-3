package persons;

import environment.animals.Animal;
import environment.animals.AnimalAlreadyDied;

public abstract class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void work();

    public void kill(Animal animal) throws AnimalAlreadyDied {
        action("Пытается убить " + animal.getName());
        animal.die();
    };

    public void say(String phrase) {
        System.out.println(getName() + " сказал: \"" + phrase + "\"");
    }

    public void thought(String phrase) {
        System.out.println(getName() + " подумал: \"" + phrase + "\"");
    }

    public void action(String phrase) {
        System.out.println(getName() + " *" + phrase + "*");
    }

    public abstract String toString();

    public abstract int hashCode();

    public abstract boolean equals(Object obj);
}
