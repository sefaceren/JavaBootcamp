
public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(2,"Sefa","h.sefaceren@gmail.com");
		
		StudentManager studentManager = new StudentManager();
		studentManager.AddToCourse(student);
		System.out.println(student.getId());
		
	}

}
