package fr.management.abe;


import fr.management.abe.rules.ContainingRule;
import fr.management.abe.rules.DivisibilityRule;
import fr.management.abe.rules.Rule;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Adil on 23/09/2018.
 */
public class Kata {

    public static final Integer MIN_NUMBER = 1;
    public static final Integer MAX_NUMBER = 100;

    //Rules to apply
    private static final List<Rule> RULES = new LinkedList<>();

    static {
        RULES.add(new DivisibilityRule());
        RULES.add(new ContainingRule());
    }

    public String compute(int number) {
        StringBuilder sb = new StringBuilder();

        //apply rules
        RULES.forEach(rule -> {
            sb.append(rule.apply(number));
        });

        if (sb.length() == 0) {
            return String.valueOf(number);
        }

        return sb.toString();
    }
}
