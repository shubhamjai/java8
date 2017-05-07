package main.java.part2.functionalinterface.predicate;

public class Example {

    public static void main(String args[]) {
        Predicate<String> p1 = s -> s.length() > 10;
        Predicate<String> p2 = s -> s.length() < 12;

        System.out.println("Applying predicate : length >10");
        testPredicate(p1);

        Predicate<String> p3 = p1.and(p2);
        System.out.println("\nApplying predicate : length >10 and length <12");
        testPredicate(p3);

        Predicate<String> p4 = p1.or(p2);
        System.out.println("\nApplying predicate : length >10 or length <12");
        testPredicate(p4);

        Predicate<String> p5 = Predicate.isEqualTo("Yes");
        Predicate<Integer> p6 = Predicate.isEqualTo(1);

        System.out.println("\n Applying is equal to predicate");
        System.out.println("Yes equals Yes -> Result : "+ p5.test("Yes"));
        System.out.println("Yes equals No -> Result : "+ p5.test("No"));
        System.out.println("1 equals 1 -> Result : "+ p6.test(1));
        System.out.println("1 equals 2 -> Result : "+ p6.test(2));

    }

    private static void testPredicate(Predicate<String> p) {
        System.out.println("test String: abcdefghij  Result : " + p.test("abcdefghij"));
        System.out.println("test String: abcdefghijk  Result : " + p.test("abcdefghijk"));
        System.out.println("test String: abcdefghijklm  Result : " + p.test("abcdefghijklm"));
    }
}
