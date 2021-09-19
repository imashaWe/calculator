package lk.imasha.uni.v3;

import lk.imasha.uni.v3.operations.AddOperator;
import lk.imasha.uni.v3.operations.MulOperator;
import lk.imasha.uni.v3.operations.SubOperator;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        CommandLineInputs commandLineInputs = new CommandLineInputs(args);
        String opr = commandLineInputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();

        double result;

        switch (opr) {
            case "add":
                AddOperator addOperator = new AddOperator();
                result = addOperator.execute(numbers);
                break;
            case "sub":
                SubOperator subOperator = new SubOperator();
                result = subOperator.execute(numbers);
                break;
            default:
                MulOperator mulOperator = new MulOperator();
                result = mulOperator.execute(numbers);
                break;
        }

        System.out.println(result);
    }
}
