
public class Main {

	public static void main(String[] args) {
		
		// student1 instance inherited from User
		Student student1 = new Student();
		// getter and setter performed.
		student1.setFullName("Hüseyin Sefa Ceren");
		student1.setEmail("sefaceren@gmail.com");
		String[] courses = {"Java","C#"};
		student1.setCourses(courses);
		System.out.println(student1.getFullName());
		
		// Active courses
		for(String course: courses) {
			System.out.println(course);
		}
		
		// student manager instance
		StudentManager studentManager = new StudentManager();
		studentManager.addCourse("Angular");
		studentManager.deleteCourse("Java");
		
		// student manager <- inherited from user manager
		studentManager.changeEmail("sefaceren@hotmail.com");
		studentManager.changeFullName("Hüseyin Ceren");
	
		
		
		// instructor instance
		Instructor instructor = new Instructor();
		instructor.setFullName("Engin Demiroğ");
		instructor.setEmail("engindemirog@gmail.com");
		instructor.setInstructorId("123");
		System.out.println(instructor.getFullName());
		
		
		// instructor manager
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.teach("Java");
		
		
		

	}

}
