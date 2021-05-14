
public class Main {

	public static void main(String[] args) {
		
		//Student class'ından bir instance oluşturduk.(Attribute Class)
		Student student = new Student(2,"Sefa","h.sefaceren@gmail.com",80);
		
		//StudentManager class'ından bir instance oluşturduk.(Work Class)
		StudentManager studentManager = new StudentManager();
		
		//AddToCourse Method'u ile student nesnesini ilgili derse ekleme işlemi yaptık.
		studentManager.AddToCourse(student);
		
		//GiveAGrade Method'u ile student nesnesine not verildi.
		studentManager.GiveAGrade(student);
		
		
	}

}
