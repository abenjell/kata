package fr.management.abe.rules;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Adil on 23/09/2018.
 */
public class DivisibilityRule implements Rule {

    private static final Map<Integer, String> KATA_DIVISIBILITY_RULES = new LinkedHashMap<>();


    static {
        KATA_DIVISIBILITY_RULES.put(3, "Foo");
        KATA_DIVISIBILITY_RULES.put(5, "Bar");
    }

    @Override
    public String apply(int number) {
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Integer, String> entry : KATA_DIVISIBILITY_RULES.entrySet()) {
            if (number % entry.getKey() == 0) {
                sb.append(entry.getValue());
            }
        }

        return sb.toString();
    }
}
