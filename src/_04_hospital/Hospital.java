package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	private ArrayList<Doctor> doctors;
	private ArrayList<Patient> patients;
	public Hospital() {
		doctors = new ArrayList<Doctor>();
		patients = new ArrayList<Patient>();
	}
	
	public void addPatient(Patient p) {
		patients.add(p);
	}
	public void addDoctor(Doctor d) {
		doctors.add(d);
	}
	
	public ArrayList<Doctor> getDoctors(){
		return doctors;
	}
	public ArrayList<Patient> getPatients(){
		return patients;
	}
	
	public void assignPatientsToDoctors() throws DoctorFullException {
		if(doctors.size() > 0 && patients.size() > 0) {
			int patientsPer = patients.size()/doctors.size() + 1;
			int patientsNotAssigned = patients.size();
			for(Doctor d: doctors) {
				for(int i = 0; i<patientsPer; i++) {
					if(patientsNotAssigned > 0) {
						d.assignPatient(patients.get(patientsNotAssigned - 1));
						patientsNotAssigned--;
					}
				}
			}
		}
	}
	
}
