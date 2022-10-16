import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzTest {
    //1. Positive Happy path
    // if (start <= end)
    // return array;

    // start < end
    @Test

    public void testStartEqualThanEnd_HappyPath() {
        //AAA
        //arrange
        int start = 1;
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz" };

//        FizzBuzz fizzBuzz = new FizzBuzz();

        //actual
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

// start > end

//            2, Negative testing
    // if (start > end)
    // return new String[0]

    // start == end
    @Test
    public void testStartLessThanEnd_HappyPath() {
    int start = 1;
    int end = 1;
    String[] expectedResult = {"1" };

//        FizzBuzz fizzBuzz = new FizzBuzz();

    //actual
    String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

    // assert
        Assert.assertEquals(actualResult,expectedResult);
}


    }
