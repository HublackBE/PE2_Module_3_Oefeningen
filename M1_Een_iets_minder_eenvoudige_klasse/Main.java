public class Main {
    public static void main(String[] args) {
        Adres john = new Adres("Brusselsesteenweg", 499, "", 1731, "Zellik");
        john.show();
        john.setPostcode(42);
        john.show();
    }
}
