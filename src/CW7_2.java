import sendble.ConsolePrinter;
import sendble.Saver;

public class CW7_2 {
    public static void main(String[] args) {
        NewClass runConsole = new NewClass(new ConsolePrinter());
        NewClass runSaver = new NewClass(new Saver());

        runConsole.print("Hello");
        runSaver.print("world");
    }


}

