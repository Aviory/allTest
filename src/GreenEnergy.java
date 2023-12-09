import interfaces.IEngnine;

public class GreenEnergy implements IEngnine {
    private int power;
    public void start(){
        System.out.println("add wt");
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
