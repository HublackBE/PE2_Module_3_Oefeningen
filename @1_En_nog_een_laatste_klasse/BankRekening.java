public class BankRekening {
    private double bedrag = 0.0;

    public BankRekening() {}

    public BankRekening(double bedrag) {
        if (bedrag < 0) {
            this.bedrag = 0;
        } else {
            this.bedrag = bedrag;
        }
    }

    public double getBedrag() {
        return this.bedrag;
    }

    private void setBedrag(double bedrag) {
        this.bedrag = bedrag;
    }

    public void storten(double bedrag) {
       this.bedrag += bedrag;
    }

    public double afhalen(double bedrag) {
        if (this.bedrag - bedrag < -1000) {
            System.err.println("Jouw rekening kan niet lager dan €1000 zijn!");
            return -1;
        } else if (bedrag < 0) {
            System.err.println("Je mag geen negatief bedrag afhalen!");
            return -1;
        } else {
            this.bedrag -= bedrag;
            return bedrag;
        }
    }
}
