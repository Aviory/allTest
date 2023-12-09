import java.util.ArrayList;

public class CW7_2 {

    public static void main(String[] args) {
        Engnine engnine = new Engnine();
        GreenEnergy greenEnergy = new GreenEnergy();
        Robot masha = new Robot("Masha",greenEnergy);

        masha.cooking();

        Robot den = new Robot("Den",engnine);
        den.cooking();

        Robot kos = new RobotBoutyMaker("Kostya",engnine);
        kos.cooking();
//        kos.addCocos();

        ArrayList<Robot> list = new ArrayList<>();
        list.add(kos);
        list.add(den);


    }

}

