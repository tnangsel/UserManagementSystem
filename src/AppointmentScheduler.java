
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import models.Appointment;
import models.Patient;
import models.Provider;

public class AppointmentScheduler {
    
	private List<Appointment> appointments;

    //explain this code
    public AppointmentScheduler() {
        this.appointments = new ArrayList<>();
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void scheduleAppointment(LocalDateTime dateTime, Patient patient, Provider provider, String reason) {
        Appointment appointment = new Appointment(dateTime, patient, provider, reason);
        appointments.add(appointment);
        System.out.println("Appointment scheduled successfully.");
        System.out.println(appointment);
    }

    public void cancelAppointment(Appointment appointment) {
        appointments.remove(appointment);
        System.out.println("Appointment canceled successfully:");
        System.out.println(appointment);
    }

    public void updateAppointment(Appointment appointment, LocalDateTime newDateTime, Provider provider) {
        appointment.setDateTime(newDateTime);
        appointment.setProvider(provider);
        System.out.println("Appointment updated successfully:");
        System.out.println(appointment);
    }

    public static void main(String[] args) {
        AppointmentScheduler scheduler = new AppointmentScheduler();

        System.out.println(scheduler.getAppointments());
        System.out.println("====================================================");
        
        // Creating providers
        Provider doctor1 = new Provider("Dr. Smith", "Cardiologist");
        Provider doctor2 = new Provider("Dr. Johnson", "Dermatologist");

        // Creating patients
        Patient patient1 = new Patient("John Doe", 40, "Male");
        Patient patient2 = new Patient("Jane Smith", 35, "Female");

        patient1.addToMedicalHistory("Diagnosed with hypertension.");
        patient1.addToMedicalHistory("Traumatic heart break.");
        patient2.addToMedicalHistory("Sleep apeanea.");
        
        // Scheduling appointments
        scheduler.scheduleAppointment(LocalDateTime.of(2024, 6, 15, 10, 0), patient1, doctor1, "Routine checkup");
        scheduler.scheduleAppointment(LocalDateTime.of(2024, 6, 16, 15, 30), patient2, doctor1, "Skin examination");

        // Displaying scheduled appointments
        System.out.println("All Appointments:");
        
        scheduler.getAppointments().stream().forEach(System.out::println);

        // Counting how many patients Dr. Smith has
        long drSmithPatientCount = scheduler.getAppointments().stream()
            .filter(appointment -> "Dr. Smith".equals(appointment.getProvider().getName()))
            .map(Appointment::getPatient)
            .distinct()
            .count();

        System.out.println("Dr. Smith has " + drSmithPatientCount + " patients.");
  
        // Canceling all appointments
//        scheduler.cancelAppointment(scheduler.getAppointments().get(0));

        // Canceling the first appointment of Dr. Smith's first patient
        Optional<Appointment> appointmentToCancel = scheduler.getAppointments().stream()
            .filter(appointment -> "Dr. Smith".equals(appointment.getProvider().getName()))
            .findFirst();

        if (appointmentToCancel.isPresent()) {
            scheduler.cancelAppointment(appointmentToCancel.get());
            System.out.println("Canceled appointment: " + appointmentToCancel.get());
        } else {
            System.out.println("No appointments found for Dr. Smith's patients.");
        }
        
        // Updating an appointment
        scheduler.updateAppointment(scheduler.getAppointments().get(0), LocalDateTime.of(2024, 6, 17, 9, 0), doctor2);
       
     // Counting how many patients Dr. Smith has
        long drSPatientCount = scheduler.getAppointments().stream()
            .filter(appointment -> "Dr. Smith".equals(appointment.getProvider().getName()))
            .map(Appointment::getPatient)
            .distinct()
            .count();
        System.out.println("Dr. Smith has " + drSPatientCount + " patients.");
        
    }
}

