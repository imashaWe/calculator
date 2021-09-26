package lk.imasha.uni.v5;

import lk.imasha.uni.v5.input.Inputs;
import lk.imasha.uni.v5.input.InvalidInputException;
import lk.imasha.uni.v5.operations.*;
import lk.imasha.uni.v5.repository.NumberRepository;
import lk.imasha.uni.v5.repository.NumberRepositoryException;
import lk.imasha.uni.v5.ui.UI;

public class CalculatorApp {
    private final Inputs inputs;
    private final NumberRepository numberRepository;
    private final OperationFactory operationFactory;
    private final UI ui;

    public CalculatorApp(Inputs inputs, NumberRepository numberRepository, OperationFactory operationFactory, UI ui) {
        this.inputs = inputs;
        this.numberRepository = numberRepository;
        this.operationFactory = operationFactory;
        this.ui = ui;
    }

    public void execute() {

        try {
            String operator = inputs.getOperator();
            Double[] numbers = numberRepository.getNumbers();
            Operation operation = operationFactory.getInstance(operator);
            Double result = operation.execute(numbers);
            ui.showMessage("Result is " + result);
        } catch (InvalidOperationException | InvalidInputException | NumberRepositoryException e) {
            ui.showMessage("Error occurred: " + e.getMessage());

        }

    }
}
