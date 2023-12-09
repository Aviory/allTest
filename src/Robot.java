import interfaces.Actions;
import interfaces.IEngnine;

import javax.swing.*;

public class Robot implements Actions {
    private String name;
    private IEngnine engnine;//1000wt
    private int power;//500
    private ICooffeMachine cooffeMachine;
    private ICup cup;
    private ICar car;

    public Robot(String name,IEngnine engnine) {
        this.name = name;
        this.engnine = engnine;
        engnine.setPower(engnine.getPower()-power);
    }

    public String getName() {
        return name;
    }

    public void cooking(){
        System.out.println("cook any oreo for: "+name);
    }

    @Override
    public void swim() {

    }

    @Override
    public void claim() {

    }
}
