/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thilina
 */
public class StudentManagementSystemTest {
    
    public StudentManagementSystemTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of listAllStudents method, of class StudentManagementSystem.
     */
    @Test
    public void testListAllStudents() {
        System.out.println("listAllStudents");
        StudentManagementSystem instance = new StudentManagementSystem();
        instance.listAllStudents();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerStudent method, of class StudentManagementSystem.
     */
    @Test
    public void testRegisterStudent() {
        System.out.println("registerStudent");
        Student stu = null;
        StudentManagementSystem instance = new StudentManagementSystem();
        instance.registerStudent(stu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
