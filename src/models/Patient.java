package models;
import java.time.LocalDateTime;

public class Patient {
    // Attributes
    private String name;
    private int age;
    private String gender;
    private String medicalHistory;

    // Constructors
    public Patient(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.medicalHistory = ""; // Initialize medical history as empty
    }

    // Methods to retrieve and update patient information
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void addToMedicalHistory(String historyEntry) {
        this.medicalHistory += historyEntry + "'\'";
    }

	@Override
	public String toString() {
		return "\nPatient:  [name=" + name + ", age=" + age + ", gender=" + gender + ", medicalHistory=" + medicalHistory
				+ "]";
	}

    // toString method to provide a string representation of the patient object
//    @Override
//    public String toString() {
//        return "Patient{ " +
//                "name = '" + name + '\'' +
//                ", age = " + age +
//                ", gender = '" + gender + '\'' +
//                ", medicalHistory = '" + medicalHistory + '\'' +
//                '}';
//    }

}
