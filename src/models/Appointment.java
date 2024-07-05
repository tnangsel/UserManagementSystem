package models;
import java.time.LocalDateTime;

public class Appointment {
	
    private LocalDateTime dateTime;
    private Patient patient;
    private Provider provider;
    private String reason;

    public Appointment(LocalDateTime dateTime, Patient patient, Provider provider, String reason) {
        this.dateTime = dateTime;
        this.patient = patient;
        this.provider = provider;
        this.reason = reason;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

	@Override
	public String toString() {
		return "Appointment : [ dateTime = " + dateTime + ", " + patient + ", " + provider + ", reason = "
				+ reason + " ] "
						+ "\n";
	}

//    @Override
//    public String toString() {
//        return "Appointment{" +
//                "dateTime=" + dateTime +
//                ", patient=" + patient.getName() +
//                ", provider=" + provider.getName() +
//                ", reason='" + reason + '\'' +
//                '}';
//    }
    
    
}
