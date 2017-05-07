package main.java.part2.functionalinterface;

import java.util.function.Predicate;

public class LambdaExpressionExample {
    public static void main(String args[])
    {
        Predicate<String> anonymousPredicate = getAnonymousPredicate();
        testPredicate(anonymousPredicate);
        Predicate<String> lambdaPredicate = getLambdaPredicate();
        testPredicate(lambdaPredicate);
    }

    private static void testPredicate(Predicate<String> anonymousPredicate) {
        System.out.println(anonymousPredicate.test("0123456789"));
        System.out.println(anonymousPredicate.test("012345678910"));
    }

    private static Predicate<String> getAnonymousPredicate() {
         return new Predicate<String>(){
            @Override
            public boolean test(String s) {
                return s.length() > 10;
            }
        };
    }

    private static Predicate<String> getLambdaPredicate() {
        return s -> s.length() > 10;
    }

}
