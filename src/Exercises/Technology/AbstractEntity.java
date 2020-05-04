package Exercises.Technology;

import java.util.concurrent.ThreadLocalRandom;

public abstract class AbstractEntity {
    private int id;

    public AbstractEntity(){
        this.id = ThreadLocalRandom.current().nextInt(0, 100 + 1);
    }

    public int getId() {
        return this.id;
    }
}
