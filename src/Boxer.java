public class Boxer extends Person{
    private int gewicht;

    public Boxer(String vorname, String nachname, int gewicht){
        super(vorname, nachname);
        this.gewicht = gewicht;
    }

    public int getGewicht(){
        return this.gewicht;
    }

    @Override
    public String toString(){
        String fullName = getVorname()+", "+getNachname()+" "+getGewicht();
        return fullName;
    }
}
