package fr.management.abe.launch;

import fr.management.abe.Kata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.IntStream;

/**
 * Created by Adil on 23/09/2018.
 */
public class Main {
    protected static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String... args) {
        Kata kata = new Kata();
        IntStream.range(Kata.MIN_NUMBER, Kata.MAX_NUMBER + 1)
                .forEach(number -> {
                    LOGGER.info("{} : {}", number, kata.compute(number));
                });

    }
}
