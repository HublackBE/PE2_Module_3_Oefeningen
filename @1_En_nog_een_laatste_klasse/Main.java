public class Main {
    public static void main(String[] args) {
        BankRekening rekeningLuke = new BankRekening(1000);
        System.out.println(rekeningLuke.getBedrag());
        rekeningLuke.storten(42);
        System.out.println(rekeningLuke.getBedrag());
        rekeningLuke.afhalen(42.5);
        System.out.println(rekeningLuke.getBedrag());
        rekeningLuke.afhalen(1000);
        System.out.println(rekeningLuke.getBedrag());
        rekeningLuke.afhalen(500);
        rekeningLuke.afhalen(-1);
        System.out.println(rekeningLuke.getBedrag());
        rekeningLuke.afhalen(9999);
        System.out.println(rekeningLuke.getBedrag());
    }
}
