public class Student extends Person {
    private int matrikelnummer;

    public Student(String vorname, String nachname, int matrikelnummer) {
        super(vorname, nachname);
        this.matrikelnummer = matrikelnummer;
    }

    public int getMatrikel() {
        return this.matrikelnummer;
    }

    @Override
    public String toString() {
        String fullName = getVorname() + ", " + getNachname() + " " + getMatrikel();
        return fullName;
    }

    public boolean equals(Student s) {
        return super.equals(s) && this.matrikelnummer == s.getMatrikel();
    }

    public static void main(String[] args) {
        Student student = new Student("Kai", "Glasenapp", 12345);
        Student student1 = new Student("Kai", "Glasenapp", 12345);
        Student student2 = new Student("Karl", "Glasenapp", 12345);
        System.out.println(student.getVorname());
        System.out.println(student.toString());
        System.out.println(student.equals(student1));
        System.out.println(student.toString().equals(student2.toString()));
    }

}
