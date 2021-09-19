package lk.imasha.uni.v5.operations;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class AddOperatorTest {
    @Test
    public void should_add_positive_value() {
        AddOperator addOperator = new AddOperator();
        Double result = addOperator.execute(new Double[]{5.0,6.0});
      assertThat(result,is(11.0));
    }
}