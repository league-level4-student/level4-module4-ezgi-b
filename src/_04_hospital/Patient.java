package _04_hospital;

public class Patient {
	private boolean caredFor;
	public Patient() {
		caredFor = false;
	}
	
	public void checkPulse() {
		caredFor = true;
	}
	
	public boolean feelsCaredFor() {
		return caredFor;
	}
}
