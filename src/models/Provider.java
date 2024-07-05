package models;

public class Provider {
    private String name;
    private String specialty;

    public Provider(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "\nProvider: [" +
                "name = '" + name + '\'' + ", specialty = '" + specialty + '\'' +
                " ]";
    }
}

