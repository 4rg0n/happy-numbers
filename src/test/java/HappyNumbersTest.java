import com.company.happy.HappyNumbers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dominic Roenicke <droenicke@cyberport.de>
 */
public class HappyNumbersTest
{
    private Map<Integer, Boolean> testData;

    private HappyNumbers happyNumbers;

    @Before
    public void init()
    {
        testData = new HashMap<>();

        testData.put(19, true);
        testData.put(1, true);
        testData.put(5, false);
        testData.put(2, false);

        happyNumbers = new HappyNumbers();
    }

    @Test
    public void testIsHappy()
    {
        for (final Integer number : testData.keySet()) {
            final boolean isHappy = happyNumbers.isHappy(number);

            Assert.assertEquals(testData.get(number), isHappy);
        }
    }
}
