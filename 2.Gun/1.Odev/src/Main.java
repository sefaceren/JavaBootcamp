
public class Main {

	public static void main(String[] args) {
		
		//Student class'�ndan bir instance olu�turduk.(Attribute Class)
		Student student = new Student(2,"Sefa","h.sefaceren@gmail.com",80);
		
		//StudentManager class'�ndan bir instance olu�turduk.(Work Class)
		StudentManager studentManager = new StudentManager();
		
		//AddToCourse Method'u ile student nesnesini ilgili derse ekleme i�lemi yapt�k.
		studentManager.AddToCourse(student);
		
		//GiveAGrade Method'u ile student nesnesine not verildi.
		studentManager.GiveAGrade(student);
		
		
	}

}
