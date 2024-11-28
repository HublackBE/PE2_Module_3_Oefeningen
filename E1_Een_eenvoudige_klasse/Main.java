public class Main {
    public static void main(String[] args) {
        Cirkel cirkel1 = new Cirkel();
        System.out.println(cirkel1.getStraal());
        cirkel1.setStraal(45);
        System.out.println(cirkel1.getStraal());
        System.out.println(cirkel1.getKleur());
        cirkel1.setKleur("kleur");
        System.out.println(cirkel1.getKleur());
        System.out.println(cirkel1.getOmtrek());
        System.out.println(cirkel1.getOppervlakte());

        Cirkel cirkel2 = new Cirkel("groen");
        System.out.println(cirkel2.getStraal());
        System.out.println(cirkel2.getKleur());

        Cirkel cirkel3 = new Cirkel(12.5);
        System.out.println(cirkel3.getStraal());
        System.out.println(cirkel3.getKleur());

        Cirkel cirkel4 = new Cirkel(42, "rood");
        System.out.println(cirkel4.getStraal());
        System.out.println(cirkel4.getKleur());
    }
}
