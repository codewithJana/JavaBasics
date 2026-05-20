package Java_Project_2;
import java.util.Scanner;

interface Service {
    void serviceDetails();
}

//==Patient class==

class Patient {
    int patientid;
    String patientname;

//Constructor

    Patient(int patientid, String patientname) {

        this.patientid = patientid;
        this.patientname = patientname;
    }

    void displayPatient() {
        System.out.println("\nPatient ID : " + patientid);
        System.out.println("Patient Name : " + patientname);

    }

}
// ================= DOCTOR CLASS =================
class Doctor {
    int doctorId;
    String doctorName;
    String specialization;

    // Constructor
    Doctor(int doctorId, String doctorName, String specialization) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.specialization = specialization;
    }
    void displayDoctor() {
        System.out.println("\nDoctor ID : " + doctorId);
        System.out.println("Doctor Name : " + doctorName);
        System.out.println("Specialization : " + specialization);
    }

}

// ================= APPOINTMENT CLASS =================
class Appointment {
    int appointmentId;
    Patient patient;
    Doctor doctor;
    String date;

    // Constructor
    Appointment(int appointmentId, Patient patient, Doctor doctor, String date) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    void displayAppointment() {
        System.out.println("\nAppointment ID : " + appointmentId);
        System.out.println("Patient : " + patient.patientname);
        System.out.println("Doctor : " + doctor.doctorName);
        System.out.println("Date : " + date);
    }
}
// ================= BILL CLASS =================
class Bill {
    int billId;
    Patient patient;
    double amount;
    double medicine_amount;

    // Constructor for Bill
    Bill(int billId, Patient patient, double amount) {
        this.billId = billId;
        this.patient = patient;
        this.amount = amount;
    }
    //Constructor for Medicine bill
    Bill(int billId, double medicine_amount) {
        this.billId = billId;
        this.medicine_amount=medicine_amount;
    }


    void generateBill() {
        System.out.println("\n===== BILL =====");
        System.out.println("Bill ID : " + billId);
        System.out.println("Patient Name : " + patient.patientname);
        System.out.println("Total Amount : Rs." + amount);
    }
}
// ================= PHARMACY CLASS =================
class Pharmacy implements Service {

    public void serviceDetails() {
        System.out.println("\nPharmacy Service Available");
        System.out.println("Medicines Provided Successfully");
    }
}
// ================= LAB CLASS =================
class Lab implements Service {

    public void serviceDetails() {
        System.out.println("\nLab Test Booked Successfully");
    }
}

public class HospitalManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Patient patient = null;
        Doctor doctor = null;
        Appointment appointment = null;

        int choice;

        do {

            System.out.println("\n===== HOSPITAL MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patient");
            System.out.println("3. Add Doctor");
            System.out.println("4. View Doctor");
            System.out.println("5. Book Appointment");
            System.out.println("6. Generate Bill");
            System.out.println("7. Consultation Status");
            System.out.println("8. Pharmacy Service");
            System.out.println("9. Lab Test Service");
            System.out.println("10. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Add Patient
                    System.out.print("Enter Patient ID: ");
                    int pid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Patient Name: ");
                    String pname = sc.nextLine();
                    patient = new Patient(pid, pname);

                    System.out.println("Patient Added Successfully!");
                    break;

                case 2:
                    // View Patient
                    if (patient != null)
                        patient.displayPatient();
                    else
                        System.out.println("No Patient Record Found!");
                    break;


                case 3:
                    //Add Doctor
                    System.out.println("Enter Doctor Id");
                    int did = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Doctor Name :");
                    String dname = sc.nextLine();

                    System.out.print("Enter Specialization: ");
                    String spec = sc.nextLine();

                    doctor = new Doctor(did, dname, spec);
                    break;

                case 4:
                    // View Doctor
                    if (doctor != null)
                        doctor.displayDoctor();
                    else
                        System.out.println("No Doctor Record Found!");
                    break;

                case 5:
                    // Book Appointment
                    if (patient != null && doctor != null) {
                        System.out.print("Enter Appointment ID: ");
                        int aid = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Appointment Date: ");
                        String date = sc.nextLine();

                        appointment = new Appointment(aid, patient, doctor, date);

                        System.out.println("Appointment Booked Successfully!");
                    } else {
                        System.out.println("Please Add Patient and Doctor First!");
                    }

                    break;
                case 6:
                    // Generate Bill
                    if (patient != null) {

                        System.out.print("Enter Bill ID: ");
                        int bid = sc.nextInt();

                        System.out.print("Enter Amount: ");
                        double amount = sc.nextDouble();

                        Bill bill = new Bill(bid, patient, amount);

                        bill.generateBill();

                    } else {
                        System.out.println("Patient Record Not Found!");
                    }
                    break;

                case 7:
                    // Consultation Status
                    if (appointment != null) {
                        System.out.println("\nConsultation Completed");
                        appointment.displayAppointment();
                    } else {
                        System.out.println("No Appointment Found!");
                    }
                    break;

                case 8:
                    // Pharmacy Service
                    if (patient != null) {
                        System.out.print("Enter Bill ID: ");
                        int bid = sc.nextInt();

                        System.out.print("Enter Medicine Amount: ");
                        double medicine_amount = sc.nextDouble();
                        Service pharmacy = new Pharmacy();
                        pharmacy.serviceDetails();
                    }
                    else {
                        System.out.println("Patient Record Not Found!");
                    }

                    break;

                case 9:
                    // Lab Test Service
                    Service lab = new Lab();
                    lab.serviceDetails();
                    break;

                case 10:
                    System.out.println("Exiting System...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }


        } while (choice != 10);

        sc.close();

    }
}