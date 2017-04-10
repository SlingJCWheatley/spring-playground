package com.example.ServiceTest;

import com.example.Service.MathService;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class MathServiceUnitTest {

    private MathService mathService = new MathService();

    @Test
    public void testMathCalculate() throws Exception {
        assertThat("Operation failure 'add'", "4 + 6 = 10"
                .equals(mathService.calculate("add", 4, 6)));

        assertThat("Operation failure 'multiply", "4 * 6 = 24"
                .equals(mathService.calculate("multiply", 4, 6)));

        assertThat("Operation failure 'subtract", "4 - 6 = -2"
                .equals(mathService.calculate("subtract", 4, 6)));

        assertThat("Operation failure 'divide", "30 / 5 = 6"
                .equals(mathService.calculate("divide", 30, 5)));

        assertThat("Bad operation failure", "Must specify valid operation like 'add', 'subtract', 'multiply', or 'divide'"
                .equals(mathService.calculate("NONE", 1 , 2)));
    }

    @Test
    public void testMathSum() throws Exception {
        Integer[] n = {4,5,6};
        assertThat("Sum failure", "4 + 5 + 6 = 15"
                .equals(mathService.sum(n)));
    }

    @Test
    public void testMathSum2() throws Exception {
        Integer[] n = {4,5,6,7,8};
        assertThat("Sum failure", "4 + 5 + 6 + 7 + 8 = 30"
                .equals(mathService.sum(n)));
    }

    @Test
    public void testMathVolume() throws Exception {
        assertThat("Volume failed 3x4x5", "The volume of a 3x4x5 rectangle is 60"
                .equals(mathService.volume(3,4,5)));

        assertThat("Volume failed 6x7x8", "The volume of a 6x7x8 rectangle is 336"
                .equals(mathService.volume(6,7,8)));
    }
}