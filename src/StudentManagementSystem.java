

public class StudentManagementSystem {

	private StudentRepository repo=new SimpleStudentRepository();

	public void listAllStudents() {
        repo.findAllStudents();
    }

	public void registerStudent(Student stu){
		//Save the new student using repository
        repo.saveStudent(stu);
	}
}
