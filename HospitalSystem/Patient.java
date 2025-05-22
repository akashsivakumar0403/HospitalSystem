public class Patient extends Person {
    private String disease;

    public Patient(String id, String name, int age, String disease) {
        super(id, name, age);
        this.disease = disease;
    }

    @Override
    public void displayInfo() {
        System.out.println("Patient: " + getName() + ", Age: " + getAge() + ", Disease: " + disease);
    }

    public String getDisease() { return disease; }
}