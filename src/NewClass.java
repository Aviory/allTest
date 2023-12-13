import interfaces.WherePrintTXT;

public class NewClass {
    private final WherePrintTXT wherePrintTXT;

    public NewClass(WherePrintTXT wherePrintTXT) {
        this.wherePrintTXT = wherePrintTXT;
    }

    public void print(String txt){
        wherePrintTXT.send(txt);
    }
}
