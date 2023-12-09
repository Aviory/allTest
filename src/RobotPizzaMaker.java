public class RobotPizzaMaker extends Robot{
    public RobotPizzaMaker(String name) {
        super(name);
    }

    @Override
    public void cooking() {
        System.out.println("cook any pizza for: "+getName());
    }
}
