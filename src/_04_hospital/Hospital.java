package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	private ArrayList<Doctor> doctors;
	private ArrayList<Patient> patients;
	
	
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
	
}
