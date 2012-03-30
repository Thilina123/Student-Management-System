
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SmsStarter {

    public static void main(String[] args) {
        StudentManagementSystem sms = null;
        //load the bean from spring
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        context.start();
        sms = (StudentManagementSystem) context.getBean("SMS");
        Student stu=(Student) context.getBean("stu");

//		sms.listAllStudents();
////		sms.registerStudent(stu);
//		sms.listAllStudents();
    }
}
