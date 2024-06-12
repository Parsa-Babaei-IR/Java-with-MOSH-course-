public class Main {
    public static void main(String[] args) {
        var RC = new RemoteControlMachine();
        RC.setSpeed(12.7);
        RC.setModel("Benz");
        RC.setPrice(2000);
        System.out.println(RC.getPrice());
    }
}