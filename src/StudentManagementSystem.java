

public class StudentManagementSystem {

	private StudentRepository repo;

	public void listAllStudents() {
        for (Student student : repo.findAllStudents()) {
              System.out.println(student.getFirstName()+" "+student.getLastName());
        }
    }

	public void registerStudent(Student stu){
		//Save the new student using repository
        repo.saveStudent(stu);
	}
}
