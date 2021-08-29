package lk.imasha.uni.v3;

public class CommandLineInputs {
    private final String args[];

    public CommandLineInputs(String args[]) {
        this.args = args;
    }

    public  String getOperator() {
        if (args.length == 0) {
            System.out.println("Please provide any arguments");
            return "";
        }

        String opr = args[0];

        if (!(opr.equals("add") || opr.equals("sub") || opr.equals("mal"))) {
            System.out.println("Please provide any valid operation");
            return "";
        }
        return  opr;
    }
}
