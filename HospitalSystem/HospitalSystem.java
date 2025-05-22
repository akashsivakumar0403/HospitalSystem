public class HospitalSystem {
    public static void main(String[] args) {
        HospitalManager manager = new HospitalManager();

        Person d1 = new Doctor("D001", "Dr. Smith", 45, "Cardiology");
        Person p1 = new Patient("P001", "John Doe", 30, "Flu");

        manager.addPerson(d1);
        manager.addPerson(p1);

        manager.getPerson("P001");
        manager.assignTreatment("P001");

        manager.assignTreatment("D001");

        manager.updateName("P001", "John A. Doe");
        manager.getPerson("P001");

        manager.checkType("D001");
        manager.deletePerson("D001");
        manager.getPerson("D001");
    }
}