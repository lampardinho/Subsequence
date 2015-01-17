package com.tsystems.javaschool.tasks;

import java.util.List;
import java.lang.Object;
import java.util.Arrays;

/**
 * @author Prigodich Nikolay
 */
public class SubsequenceImpl implements Subsequence {


    public static void main(String[] args) {
        Subsequence s = new SubsequenceImpl();
        boolean b = s.find(Arrays.asList("AB", "AB"), Arrays.asList("AB", "AB"));
        System.out.println(b);
    }


    @Override
    public boolean find(List x, List y)
    {
        int j = 0;
        for (int i = 0; i < x.size(); i++)
        {
            while (j < y.size() && y.get(j) != x.get(i)) j++;

            if (j < y.size() && y.get(j) == x.get(i))
            {
                j++;
                continue;
            }
            else return false;
        }
        return true;
    }
}
