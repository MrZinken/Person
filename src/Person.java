public abstract class Person {
    private String vorname;
    private String nachname;

    public Person(String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
    }
    public String getVorname(){
        return this.vorname;
    }
    public String getNachname(){
        return this.nachname;
    }
    @Override
    public String toString(){
        String fullName = getVorname()+getNachname();
        return fullName;
    }
}
