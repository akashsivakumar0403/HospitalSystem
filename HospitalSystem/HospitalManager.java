import java.util.*;

public class HospitalManager {
    private Map<String, Person> people = new HashMap<>();

    public void addPerson(Person p) {
        people.put(p.getId(), p);
    }

    public void getPerson(String id) {
        Person p = people.get(id);
        if (p != null) {
            p.displayInfo();
        } else {
            System.out.println("Person not found.");
        }
    }

    public void updateName(String id, String newName) {
        Person p = people.get(id);
        if (p != null) p.setName(newName);
    }

    public void deletePerson(String id) {
        people.remove(id);
    }

    public void assignTreatment(String id) {
        Person p = people.get(id);
        if (p != null) {
            try {
                if (!(p instanceof Patient)) {
                    throw new HospitalException("Only patients can receive treatment.");
                }
                System.out.println("Treating patient: " + p.getName());
            } catch (HospitalException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Treatment attempt complete.");
            }
        }
    }

    public void checkType(String id) {
        Person p = people.get(id);
        if (p instanceof Doctor) {
            System.out.println(p.getName() + " is a Doctor.");
        } else if (p instanceof Patient) {
            System.out.println(p.getName() + " is a Patient.");
        }
    }
}