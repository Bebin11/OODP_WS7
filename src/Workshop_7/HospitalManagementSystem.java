package Workshop_7;

public class HospitalManagementSystem {

    public static void main(String[] args) {
        Patient patient = new Patient(1, "John Doe", 25, "Male");
        Doctor doctor = new Doctor(101, "Dr. Smith", "Cardiology");

        Appointment appointment = new Appointment(5001, "12-10-2026", "10:30 AM");

        patient.bookAppointment();
        doctor.seePatientDetails();
        doctor.prescribeTreatment();

        appointment.viewAppointmentDetails();
    }
}


class Person {
    protected int personID;
    protected String name;
    protected int age;
    protected String gender;

    public void viewPersonalDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
    }
}

class Patient extends Person {
    private int patientID;

    public Patient(int patientID, String name, int age, String gender) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void bookAppointment() {
        System.out.println("Patient has booked an appointment.");
    }
}

class Doctor extends Person {
    private int doctorID;
    private String department;

    public Doctor(int doctorID, String name, String department) {
        this.doctorID = doctorID;
        this.name = name;
        this.department = department;
    }

    public void seePatientDetails() {
        System.out.println("Doctor is viewing patient details.");
    }

    public void prescribeTreatment() {
        System.out.println("Doctor has prescribed treatment.");
    }
}

class Appointment {
    private int appointmentID;
    private String appointmentDate;
    private String appointmentTime;

    public Appointment(int appointmentID, String appointmentDate, String appointmentTime) {
        this.appointmentID = appointmentID;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
    }

    public void rescheduleAppointment() {
        System.out.println("Appointment rescheduled.");
    }

    public void cancelAppointment() {
        System.out.println("Appointment cancelled.");
    }

    public void viewAppointmentDetails() {
        System.out.println("Appointment on " + appointmentDate + " at " + appointmentTime);
    }
}

class Treatment {
    private int treatmentID;
    private String type;
    private String description;

    public void updateDescription(String description) {
        this.description = description;
    }

    public void viewTreatmentDetails() {
        System.out.println("Treatment Description: " + description);
    }
}

