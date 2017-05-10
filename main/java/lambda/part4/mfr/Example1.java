package main.java.lambda.part4.mfr;

import main.java.entity.Person;
import main.java.util.PersonUtil;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Example1 {
    public static void main(String args[])
    {
        List<Integer> ints = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
        BinaryOperator<Integer> op = (i1,i2) -> i1 +i2;
        int reduction = reduce(ints, 0, op);
        System.out.println("Result : "+ reduction);
    }

    private  static int reduce(List<Integer> list, int identityElement, BinaryOperator<Integer>  operator)
    {
        int result = identityElement;
        for (int value: list)
        {
            result = operator.apply(result, value);
        }
        return result;
    }
}
