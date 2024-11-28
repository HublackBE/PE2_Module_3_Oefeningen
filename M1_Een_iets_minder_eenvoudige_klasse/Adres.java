public class Adres {

    private String straatnaam;
    private int huisnummer;
    private String bus;
    private int postcode;
    private String woonplaats;

    public Adres(String straatnaam, int huisnummer, String bus, int postcode, String woonplaats) {
        this.straatnaam = straatnaam;
        this.huisnummer = huisnummer;
        this.bus = bus;
        if (String.valueOf(postcode).length() != 4) {
            this.postcode = 9999;
        } else {
            this.postcode = postcode;
        }
        this.woonplaats = woonplaats;
    }

    public void show() {
        System.out.println("Straatnaam: " + this.straatnaam);
        System.out.println("Huisnummer: " + this.huisnummer);
        System.out.println("Bus: " + this.bus);
        System.out.println("Postcode: " + this.postcode);
        System.out.println("Woonplaats: " + this.woonplaats);
    }

    public String getStraatnaam() {
        return this.straatnaam;
    }

    public int getHuisnummer() {
        return this.huisnummer;
    }

    public String getBus() {
        return this.bus;
    }

    public int getPostcode() {
        return this.postcode;
    }

    public String getWoonplaats() {
        return this.woonplaats;
    }

    public void setStraatnaam(String straatnaam) {
        this.straatnaam = straatnaam;
    }

    public void setHuisnummer(int huisnummer) {
        this.huisnummer = huisnummer;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public void setPostcode(int postcode) {
        if (String.valueOf(postcode).length() != 4) {
            this.postcode = 9999;
        } else {
            this.postcode = postcode;
        }
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }
}
