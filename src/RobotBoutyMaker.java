public class RobotBoutyMaker extends Robot {
    public RobotBoutyMaker(String name, Engnine engnine) {
        super(name,engnine);
        super.cooking();
    }

    @Override
    public void cooking() {
        super.cooking();
        System.out.println("cook any baunty for: "+getName());
    }

    public void addCocos(){

    }
}
