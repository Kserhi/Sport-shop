package app.caps;

import app.Item;
import app.poroducers.Producer;
import app.poroducers.CapProducer;

public abstract class Cap implements Item {
        public Producer producer(){
            return  new CapProducer();
        }

        public abstract double price();
        public abstract String name();

}
