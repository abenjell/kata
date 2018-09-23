package fr.management.abe.rules;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Adil on 23/09/2018.
 */
public class ContainingRule implements Rule {


    private static final Map<Character, String> KATA_CONTAINING_RULES = new LinkedHashMap<>();

    static {
        KATA_CONTAINING_RULES.put('3', "Foo");
        KATA_CONTAINING_RULES.put('5', "Bar");
        KATA_CONTAINING_RULES.put('7', "Qix");
    }

    @Override
    public String apply(int number) {
        StringBuilder sb = new StringBuilder();

        //convert number to char to analyse content in the order they appear
        char[] numberAsCharArray = String.valueOf(number).toCharArray();

        for (char c : numberAsCharArray) {
            KATA_CONTAINING_RULES.forEach((key, value) -> {
                if (key.charValue() == c) {
                    sb.append(value);
                }
            });
        }

        return sb.toString();
    }
}
