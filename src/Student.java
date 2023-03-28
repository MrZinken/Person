public class Student extends Person{
    private int matrikelnummer;
    public Student(String vorname, String nachname, int matrikelnummer) {
        super(vorname, nachname);
        this.matrikelnummer = matrikelnummer;
    }

    public int getMatrikel(){
        return this.matrikelnummer;
    }

    @Override
    public String toString(){
        String fullName = getVorname()+", "+getNachname()+" "+getMatrikel();
        return fullName;
    }


    public static void main(String[] args){
        Student student = new Student("Kai", "Glasenapp", 12345);
        Student student1 = new Student("Kai", "Glasenapp", 12345);
        Student student2 = new Student("Karl", "Glasenapp", 12345);
        System.out.println(student.getVorname());
        System.out.println(student.toString());
        System.out.println(student.toString().equals(student1.toString()));
        System.out.println(student.toString().equals(student2.toString()));
    }

}
