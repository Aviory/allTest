import interfaces.WherePrintTXT;

public class Worker {
    private final WherePrintTXT wherePrintTXT;//абстракция

    public Worker(WherePrintTXT wherePrintTXT) {
        this.wherePrintTXT = wherePrintTXT;
    }

    public void print(String txt){
        wherePrintTXT.send(txt);
    }
}
