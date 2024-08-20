public class Main {
    public static void main(String[] args) {
        var RC = new RemoteControlMachine();
        RC.setPrice(200);
        RC.setSpeed(59);
        RC.setStatus(true);
        System.out.printf("You should pay %.2f for this RC car\n",RC.getPrice());
        System.out.println(RC.getSpeed());
        System.out.println(RC.getStatus());
    }
}