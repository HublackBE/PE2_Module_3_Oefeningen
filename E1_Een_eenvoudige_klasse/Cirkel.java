public class Cirkel {
    private double straal = 0;
    private String kleur = "wit";
    private final double pi = Math.PI;

    public Cirkel() {
    }

    public Cirkel(double straal) {
       this.straal = straal;
    }

    public Cirkel(String kleur) {
        this.kleur = kleur;
    }

    public Cirkel(double straal, String kleur) {
        this.straal = straal;
        this.kleur = kleur;
    }

    public double getStraal() {
        return this.straal;
    }

    public void setStraal(double straal) {
        this.straal = straal;
    }

    public String getKleur() {
        return this.kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public void print() {
        System.out.println("Straal: " + this.straal);
        System.out.println("Kleur: " + this.kleur);
    }

    public double getOmtrek() {
        return 2 * pi * this.straal;
    }

    public double getOppervlakte() {
        return pi * this.straal * this.straal;
    }
}
