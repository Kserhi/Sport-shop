package app.shirts;

import app.Item;
import app.poroducers.Producer;
import app.poroducers.ShirtProducer;

public abstract class Shirt implements Item {
    @Override
    public Producer producer() {
        return new ShirtProducer();
    }

    @Override
    public abstract String name();

    @Override
    public abstract double price();
}
