package lk.imasha.uni.v5.input;

public class CommandLineInputs implements Inputs{
    private final String args[];

    public CommandLineInputs(String args[]) {
        this.args = args;
    }

    public String getOperator() {
        if (args.length == 0) {
            System.out.println("Please provide any arguments");
            return "";
        }

        String opr = args[0];

        if (!(opr.equals("add") || opr.equals("sub") || opr.equals("mul") || opr.equals("div"))) {
            System.out.println("Please provide any valid operation");
            return "";
        }
        return opr;
    }
}
