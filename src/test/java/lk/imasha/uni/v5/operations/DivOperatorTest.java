package lk.imasha.uni.v5.operations;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class DivOperatorTest {
    @Test
    public void should_divide_positive_values() throws InvalidOperationException {
        DivOperator divOperator = new DivOperator();
        Double result = divOperator.execute(new Double[]{6.0,3.0});
        assertThat(result,is(2.0));
    }
    @Test
    public void should_not_divide_zero() throws InvalidOperationException {
        DivOperator divOperator = new DivOperator();
        Double result = divOperator.execute(new Double[]{6.0,0.0});

    }
}