public class Doctor extends Person {
    private String specialty;

    public Doctor(String id, String name, int age, String specialty) {
        super(id, name, age);
        this.specialty = specialty;
    }

    @Override
    public void displayInfo() {
        System.out.println("Doctor: " + getName() + ", Specialty: " + specialty);
    }

    public String getSpecialty() { return specialty; }
}