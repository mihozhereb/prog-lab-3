package persons;

public class NotEnoughSpirituality extends Exception {
    public NotEnoughSpirituality(String message) {
        super(message);
    }

    public NotEnoughSpirituality() { }

    @Override
    public String getMessage() {
        return "Недостаточно духовности, чтобы сказать фразу.";
    }
}
