package lk.imasha.uni.v2;

public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide any arguments");
            return;
        }

        String opr = args[0];

        if (!(opr.equals("add") || opr.equals("sub") || opr.equals("mal"))) {
            System.out.println("Please provide any valid operation");
            return;
        }
    }
}
