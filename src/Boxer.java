public class Boxer extends Person {
    private int gewicht;

    public Boxer(String vorname, String nachname, int gewicht) {
        super(vorname, nachname);
        this.gewicht = gewicht;
    }

    public int getGewicht() {
        return this.gewicht;
    }

    @Override
    public String toString() {
        String fullName = getVorname() + ", " + getNachname() + " " + getGewicht();
        return fullName;
    }


    public boolean equals(Boxer b) {
        return super.equals(b) && this.gewicht == b.gewicht;
    }
}