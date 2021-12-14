package data.services.generator;

import java.util.Random;

/**
 * Class for id generation.
 */
public class IdGenerator {
    final Random random = new Random();

    /**
     * Generates new id.
     * @return generated id.
     */
    public int generateNewId() {
        return random.nextInt(100_000);
    }
}
