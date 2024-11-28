public class Auto {
    private double kilometerteller = 0;
    private double brandstoftank = 0;
    private double inhoudBrandstoftank = 60;
    private double verbruik = 10;

    public Auto(double kilometerteller, double brandstoftank, double inhoudBrandstoftank, double verbruik) {
        this.kilometerteller = kilometerteller;
        this.brandstoftank = brandstoftank;
        this.inhoudBrandstoftank = inhoudBrandstoftank;
        this.verbruik = verbruik;
    }

    public Auto() {}

    public void tankVullen() {
        this.brandstoftank = this.inhoudBrandstoftank;
    }

    public double rijden(double aantalKilometer) {
        aantalKilometer = Math.abs(aantalKilometer);
        double brandstofNodig = (this.verbruik / 100) * aantalKilometer;
        double brandstofGebruikt;
        if (this.brandstoftank - brandstofNodig <= 0) {
           brandstofGebruikt = this.brandstoftank;
        } else {
            brandstofGebruikt = brandstofNodig;
        }
        this.brandstoftank -= brandstofGebruikt;
        double afstandGereden = (100 / this.verbruik) * brandstofGebruikt;
        kilometerteller += afstandGereden;
        return afstandGereden;
    }

    public void show() {
        System.out.println("Kilometerteller: " + this.kilometerteller);
        System.out.println("Brandstoftank: " + this.brandstoftank);
        System.out.println("Inhoud van de brandstoftank: " + this.inhoudBrandstoftank);
        System.out.println("Verbruik: " + this.verbruik);
    }
}
