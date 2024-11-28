public class Main {
    public static void main(String[] args) {
        Auto bumblebee = new Auto(50, 2, 12, 6);
        bumblebee.show();
        bumblebee.tankVullen();
        bumblebee.show();
        bumblebee.rijden(150);
        bumblebee.show();
        bumblebee.rijden(-5);
        bumblebee.show();
        bumblebee.rijden(9999);
        bumblebee.show();
        System.out.println(bumblebee.rijden(42));
        Auto optimus = new Auto();
        optimus.show();
    }
}
