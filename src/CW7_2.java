import sendble.ConsolePrinter;
import sendble.Saver;

public class CW7_2 {
    public static void main(String[] args) {
        NewClass runConsole = new NewClass(new ConsolePrinter());
        Saver saver = new Saver();
        NewClass runSaver = new NewClass(saver);

        runConsole.print("Hello");
        runSaver.print("world");
        saver.printAllSaveItem();
        
    }


}

