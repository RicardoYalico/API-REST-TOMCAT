package student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Listado {

	private static String [] lastNames = {"Messi", "Jordan", "Ruth", "Phells"};
	
	private static String [] firstNames = {"Leo", "Michael", "Baby", "Michael"};
	
	public String listar() {
		List<Student> studentList = new ArrayList<>();
		Random random = new Random();
		
		for(int i=0; i<3; i++) {
			String tempFirstName = firstNames[random.nextInt(lastNames.length)];
			String tempLasttName = lastNames[random.nextInt(firstNames.length)];
			
			int age = 18 + random.nextInt(20);
			
			Student tempStundent = new Student(tempFirstName, tempLasttName, age);
			
			studentList.add(tempStundent);
		}
		String cadena = "";
		for (Student temp: studentList) {
			cadena = cadena + (temp.getFirstName()+" "+temp.getLastName()+" "+temp.getAge()+" ");
		}
		return cadena;
	}
	
	
}
