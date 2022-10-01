package citaMedico;
import java.util.ArrayList;
import java.util.Date;

public class Doctor{
	
	
	//Atributos
	static int id= 0; //autoincremental
	private String name;
	private String speciality;	
	
	public ArrayList<AvailableAppointment> availableAppointmentsList = new ArrayList<>();
	
	Doctor(){
		System.out.println("construyendo el objeto Doctor");	
	}
	


	Doctor(String name,String speciality){	
		this.name= name;
		this.speciality = speciality;
		System.out.println("el nombre del Doctor asignado es:"+name);
	
	}	
	
	
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	

	
	
					//Comportamientos
					/*public void showName(){
						System.out.println(name);
					}
					
					public void showId() {
						System.out.println("ID Doctor:"+id);
					}*/
	
	
	
	
	
	public void addAvailableAppoinment(Date date, String time) {
//		AvailableAppointment aux = new AvailableAppointment(date, time);
//		availableAppointmentsList.add(aux);
		
		availableAppointmentsList.add(new AvailableAppointment(date,time));

	}

	public ArrayList<AvailableAppointment> getAvailableAppointments() {
		return availableAppointmentsList;
	}
	
	
	public static class AvailableAppointment{
		private int id;
		private Date date;
		private String time;
		
		public AvailableAppointment(Date date, String time) {
			super();
			this.date = date;
			this.time = time;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}
		
		
		
	}
	
}


