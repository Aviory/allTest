import sendble.ConsolePrinter;
import sendble.Saver;

public class CW7_2 {
    public static void main(String[] args) {
        ConsolePrinter consolePrinter = ConsolePrinter.getInstance();
        Worker runConsole = new Worker(consolePrinter);
        Saver saver = new Saver();
        Worker runSaver = new Worker(saver);

        runConsole.print("Hello");
        runSaver.print("world");
        runSaver.print("world1111");
        runSaver.print("world2");
        saver.printAllSaveItem();
        
    }


}

