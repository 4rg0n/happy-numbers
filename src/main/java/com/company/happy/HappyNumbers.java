package com.company.happy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dominic Roenicke <droenicke@cyberport.de>
 */
public class HappyNumbers
{
    private List<Integer> resultList = new ArrayList<>();

    public boolean isHappy(int number)
    {
        int result = calculateHappiness(number);

        System.out.println(number + "=>" +result);

        return (result == 1);
    }

    private int calculateHappiness(final int number)
    {
        final String stringInt = String.valueOf(number);
        final String[] splittedNumbersStringInt = stringInt.split("");
        int result = 0;

        for (final String stringNumber : splittedNumbersStringInt) {
            final Integer intNumber = Integer.valueOf(stringNumber);

            result += Math.pow(intNumber, 2);

            if (resultList.contains(result)) {
                return result;
            }

            resultList.add(result);

            calculateHappiness(result);
        }

        return result;
    }
}
