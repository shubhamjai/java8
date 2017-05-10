package main.java.lambda.part4.mfr;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Example2 {
    public static void main(String args[]) {
        List<Integer> ints1 = Arrays.asList(0,1,2,3,4);
        List<Integer> ints2 = Arrays.asList(5,6,7,8,9);
        BinaryOperator<Integer> op = (i1,i2) -> (i1 + i2) * (i1 + i2) ;  //non associative

        int reduction1 = reduce(ints1, 0, op);
        int reduction2 = reduce(ints2, 0, op);
        int reduction = reduce(Arrays.asList(reduction1,reduction2), 0, op);
        System.out.println("Result : "+ reduction);
    }

    private  static int reduce(List<Integer> list, int identityElement, BinaryOperator<Integer> operator)
    {
        int result = identityElement;
        for (int value: list)
        {
            result = operator.apply(result, value);
        }
        return result;
    }

}