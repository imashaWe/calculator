package lk.imasha.uni.v5.operations;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class OperationFactoryTest {
    @Test
    public void should_return_AddOperator_object_when_operator_is_add() {
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("add");

        assertThat(operation, instanceOf(AddOperator.class));
    }

    @Test
    public void should_return_SubOperator_object_when_operator_is_sub() {
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("sub");

        assertThat(operation, instanceOf(SubOperator.class));
    }

    @Test
    public void should_return_MulOperator_object_when_operator_is_mul() {
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("mul");

        assertThat(operation, instanceOf(MulOperator.class));
    }

    @Test
    public void should_return_DivOperator_object_when_operator_is_div() {
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("div");

        assertThat(operation, instanceOf(DivOperator.class));
    }
}