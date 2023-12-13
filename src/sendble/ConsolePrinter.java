package sendble;

import interfaces.WherePrintTXT;

public class ConsolePrinter implements WherePrintTXT {
    @Override
    public void send(String txt) {
        System.out.println(txt);
    }
}
