package com.tsystems.javaschool.tasks;

import java.util.List;
import java.lang.Object;
import java.util.Arrays;

/**
 * @author Prigodich Nikolay
 */
public class SubsequenceImpl implements Subsequence {


    public static void main(String[] args)
    {
        Subsequence s = new SubsequenceImpl();
        boolean b = s.find(Arrays.asList("A", "B", "C", "D"), Arrays.asList("BD", "A", "ABC", "B", "M", "D", "M", "C", "DC", "D"));
        System.out.println(b);
    }


    @Override
    public boolean find(List x, List y)
    {
        int j = 0;
        for (Object obj1 : x)
        {
            while (j < y.size() && !y.get(j).equals(obj1))
                j++;

            if (j < y.size() && y.get(j).equals(obj1))
                j++;
            else
                return false;
        }
        return true;
    }

}
