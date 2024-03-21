package app;

import app.poroducers.Producer;

public interface Item {
    String name();
    Producer producer();
    double price();

}
