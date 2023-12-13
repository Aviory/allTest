package sendble;

import interfaces.WherePrintTXT;

import java.util.ArrayList;

public class Saver implements WherePrintTXT {
    ArrayList<String> arr = new ArrayList<>();
    @Override
    public void send(String txt) {
        arr.add(txt);
    }
    public void printAllSaveItem(){
        for (String str: arr) {
            System.out.println(str);
        }
    }
}
