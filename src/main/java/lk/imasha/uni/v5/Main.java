package lk.imasha.uni.v5;

import lk.imasha.uni.v5.input.*;
import lk.imasha.uni.v5.operations.OperationFactory;
import lk.imasha.uni.v5.repository.*;
import lk.imasha.uni.v5.ui.*;

public class Main {
    public static void main(String[] args) {

        Inputs inputs = new CommandLineInputs(args);
        NumberRepository numberRepository = new FileNumberRepository();
        OperationFactory operationFactory = new OperationFactory();
        UI ui = new CmdLineUI();
        CalculatorApp calculatorApp = new CalculatorApp(inputs, numberRepository, operationFactory, ui);
        calculatorApp.execute();
    }
}
