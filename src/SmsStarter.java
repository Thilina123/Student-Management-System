
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SmsStarter {

    public static void main(String[] args) {
        StudentManagementSystem sms = null;
        //load the bean from spring
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        context.start();
        sms = (StudentManagementSystem) context.getBean("SMS");
        
        sms.registerStudent((Student) context.getBean("std1"));
        sms.registerStudent((Student) context.getBean("std2"));
        sms.registerStudent((Student) context.getBean("std3"));
		sms.listAllStudents();
		
		
    }
}
