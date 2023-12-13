package sendble;

import interfaces.WherePrintTXT;

public class ConsolePrinter implements WherePrintTXT {
    private static ConsolePrinter consolePrinter;
    public static ConsolePrinter getInstance() {
        if (consolePrinter == null)
            consolePrinter = new ConsolePrinter();

        return consolePrinter;
    }
    private ConsolePrinter() {

    }
    @Override
    public void send(String txt) {
        System.out.println(txt);
    }
}
