
public class Student extends User {
	private String[] courses;
	
	public Student() {
		
	}

	public Student(String[] courses) {
		this.courses = courses;
	}
	
	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}
}
