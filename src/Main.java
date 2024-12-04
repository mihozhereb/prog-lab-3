import counters.Counter;
import counters.TimeCounter;
import environment.Growable;
import environment.Island;
import environment.Place;
import environment.animals.Animal;
import environment.animals.AnimalAlreadyDied;
import environment.animals.Turtle;
import environment.plants.CoconutTree;
import environment.plants.Grape;
import environment.plants.Plant;
import environment.plants.Wheat;
import persons.MainCharacter;
import persons.NotEnoughSpirituality;
import persons.SpiritualPhrase;

public class Main {
    public static void main(String[] args) {
        MainCharacter mainCharacter = new MainCharacter("Робинзон Крузо", 300);
        Island island = new Island("Остров Робинзона", (float) (Math.random() * 50), (float) (Math.random() * 50));

        // интересная особенность рандома
        int b = (int) (Math.random() * 100);

        try {
            for (int i = 0; i < b; i++) {
                island.addFauna(new Turtle());
            }

            for (int i = 0; i < (int) (Math.random() * 100); i++) {
                island.addFlora(new Grape());
            }

            for (int i = 0; i < (int) (Math.random() * 100); i++) {
                island.addFlora(new CoconutTree());
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Жестко не повезло, перезапустите скрипт.");
        }


        island.addPersons(mainCharacter);

        TimeCounter currentTime = new TimeCounter(1459);

        currentTime.GetNow();

        mainCharacter.work();

        currentTime.NextDay();

        currentTime.GetNow();

        mainCharacter.pray();

        if (mainCharacter.getSpirituality() > 200) {
            mainCharacter.thought("Спокойный дух сегодня");
        } else {
            mainCharacter.thought("Мой дух беспокоен сегодня");
        }

        mainCharacter.readBible();

        if (mainCharacter.getSpirituality() > 300) {
            mainCharacter.say("Я стал видеть вещи в совсем новом свете!");
        } else {
            mainCharacter.thought("Мир потух для меня");
        }

        try {
            mainCharacter.saySpiritualPhrases(
                new SpiritualPhrase("Все мои понятия изменились, мир казался мне теперь далеким и чуждым", 100),
                new SpiritualPhrase("Он не возбуждал во мне никаких надежд, никаких желаний", 100),
                new SpiritualPhrase("Словом, мне нечего было делать там, и я был разлучен с ним" +
                        ", повидимому, навсегда", 100),
                new SpiritualPhrase("Я смотрел на него такими глазами, какими, вероятно, мы смотрим на него " +
                        "с того света, т. е. как на место, где я жил когда то, но откуда ушел навсегда", 100),
                new SpiritualPhrase("Я мог бы сказать миру теперь, как Авраам богачу: \"Между мной и тобой " +
                        "утверждена великая пропасть\"", 100),
                new SpiritualPhrase("В самом деле, я ушел от всякой мирской скверны; у меня не было ни плотских " +
                        "искушений, ни соблазна очей, ни гордости жизни", 100)
            );
        } catch (NotEnoughSpirituality e) {
            mainCharacter.thought("Хватит на сегодня умных слов...");
        }

        mainCharacter.thought("Мне нечего было желать, потому что я имел все, чем мог наслаждаться");

        float islandSquare = island.getSquare();

        if (islandSquare < 500) {
            mainCharacter.thought("Я был господином моего острова");
        } else if (islandSquare < 1500) {
            mainCharacter.thought("Я был королем всей страны, которой я владел");
        } else {
            mainCharacter.thought("Я был императором всей страны, которой я владел");
        }

        int numberOfPeopleOnIsland = island.getIslandPopulation().size();

        if (numberOfPeopleOnIsland == 1) {
            mainCharacter.thought("У меня не было соперников, не было конкурентов, никто не оспаривал моей " +
                    "власти, я ни с кем ее не делил");
        } else {
            mainCharacter.thought("У меня были соперники и конкуренты");
        }

        mainCharacter.thought("Я мог бы нагрузить целые корабли, но мне это было не нужно");

        mainCharacter.sow(island, new Wheat(), new Wheat(), new Wheat());

        mainCharacter.say("Я сеял ровно столько, чтобы хватило для меня");

        for (Plant plant : island.getFlora()) {
            if (plant instanceof Growable) {
                plant.grow();
            }
        }

        for (Animal animal : island.getFauna()) {
            if (animal instanceof Growable) {
                animal.grow();
            }
        }

        Counter turtleCounter = new Counter();
        for (Animal animal : island.getFauna()) {
            if (animal instanceof Turtle) {
                turtleCounter.add(1);
            }
        }

        if (turtleCounter.getCounter() > 50) {
            mainCharacter.say("У меня было множество черепах");
        } else {
            mainCharacter.say("У меня было не так уж и много черепах");
        }

        Animal targetAnimal = island.getFauna().get((int) (Math.random() * island.getFauna().size()));

        try {
            mainCharacter.kill(targetAnimal);
            mainCharacter.say("Я довольствовался тем, что изредка убивал по одной " + targetAnimal.getName());
        } catch (AnimalAlreadyDied e) {
            mainCharacter.thought("Какой ужас. " + e.getMessage());
        }

        Counter treeCounter = new Counter();
        for (Plant plant : island.getFlora()) {
            if (plant instanceof CoconutTree) {
                treeCounter.add(1);
            }
        }

        if (treeCounter.getCounter() > 30) {
            mainCharacter.say("У меня было столько лесу, что я мог построить целый флот");
        } else {
            mainCharacter.say("У меня было не так уж и много леса");
        }
    }
}