import interfaces.IEngnine;

public class Engnine implements IEngnine {
    private int power;
    public void start(){
        System.out.println("add gas");
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
