
public class StudentManager extends UserManager{
	
	public void addCourse(String course) {
		System.out.println(course + " isimli kurs eklendi.");
	}
	
	public void deleteCourse(String course) {
		System.out.println(course + " isimli kurs silindi.");
	}

}
