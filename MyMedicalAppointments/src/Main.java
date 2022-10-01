import java.util.Date;

//import static ui.UIMenu.*; 

public class Main {
	public static void main(String[] args) {
		
		/*Doctor myDoctor = new Doctor();
		myDoctor.name = "Alejandro Rodriguez";
		myDoctor.showName();
		myDoctor.showId();
	
		
		Doctor myDoctorAnn = new Doctor();
		myDoctor.showId();*/
		
	//	UIMenu.showMenu(); 
	Doctor myDoctor = new Doctor("Anahí Salgado","Pediatria");
	myDoctor.addAvailableAppoinment(new Date(),"4pm");
	myDoctor.addAvailableAppoinment(new Date(),"10pm");
	myDoctor.addAvailableAppoinment(new Date(),"1pm");
	System.out.println(myDoctor.getAvailableAppointments());
	
	for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()) {
		System.out.println(availableAppointment.getDate()+ " " + availableAppointment.getTime());
	}
	
	
	
						/*System.out.println(myDoctor.name);
						System.out.println(myDoctor.speciality);
						
						int i = 0;	
						int b = 2;
						b =i;
						String name = "Ann";*/
	
	Patient patient = new Patient("Alejandra","alejandra@mail.com");
	Patient patient2 = new Patient("Anahi","anahi@mail.com");

	System.out.println(patient.getName());
	System.out.println(patient2.getName());
	patient2 = patient;
	
	System.out.println(patient.getName());
	System.out.println(patient2.getName());
	
	patient2.setName("Manuel");
	System.out.println(patient.getName());
	System.out.println(patient2.getName());
	/*patient.setWeight(54.6);
	System.out.println(patient.getWeight());
	
	patient.setPhoneNumber("12345678");
	System.out.println(patient.getPhoneNumber());*/

	}
}
 