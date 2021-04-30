
public class Main {

	public static void main(String[] args) {

		StudentManager student = new StudentManager();
		student.setFirstName("Ahmet");
		student.setLastName("Ozkan");
		student.setId(1);
		student.setGetCourses("Java-React");
		
		InstructorManager instructor = new InstructorManager();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setId(2);
		instructor.setCourses("Java-React");
		
		UserManager userManager = new UserManager();
		userManager.add(student);
		
		
	}

}
