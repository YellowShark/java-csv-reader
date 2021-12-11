package data.services.generator;

import java.util.Random;

public class IdGenerator {
    final Random random = new Random();

    public int generateNewId() {
        return random.nextInt(100_000);
    }
}
