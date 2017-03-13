package kr.or.dgit.mybatis_dev;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.PhoneNumber;
import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.services.StudentService;

@FixMethodOrder (MethodSorters.NAME_ASCENDING)
public class StudentServiceTest {
	private static StudentService service;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
		service = new StudentService();
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
		service = null;
	}
	
	@Before
	public void setUp(){
		System.out.println("setUp()");
	}
	@After
	public void tearDown(){
		System.out.println("tearDown()");
	}
	
/*	@Test
	public void testselectStudentByNo() {
		Student std= new Student();
		std.setStudId(1);
		
		Student findstd= service.findStudentByNo(std);
		Assert.assertNotNull(findstd);
	}
	
	@Test
	public void testselectStudentByNoApi() {
		Student std= new Student();
		std.setStudId(1);
		Student findstd= service.findStudentByNoApi(std);
	}
	
	@Test
	public void testselectStudnetByNoAnnotation() {
		Student std= new Student();
		std.setStudId(1);
		Student findstd= service.selectStudnetByNoAnnotation(std);
	}
	*/
/*	@Test
	public void testselecStudentByAll(){
		List<Student> list= new ArrayList<>();
		list = service.selecStudentByAll();
		for(Student e:list){
			System.out.println(e);
		}
		
	}*/
	/*@Test
	public void testselecStudentByApi(){
		List<Student> list= new ArrayList<>();
		list = service.selecStudentByApi();
		for(Student e:list){
			System.out.println(e);
		}
		
	}*/
	
/*	@Test
	public void testselecStudentAnnotation(){
		List<Student> list= new ArrayList<>();
		list = service.selecStudentByAnnotation();
		for(Student e:list){
			System.out.println(e);
		}
	
	}
	*/
	/*@Test
	public void testupdateStudent(){
		Student std = new Student(1, "kk", "kk@kk.net", new Date(), new PhoneNumber("010", "4040","3981" ));
		service.updateStudent(std);
		}*/
	/*@Test
	public void testupdateStudentAip(){
		Student std = new Student(1, "cc", "kk@kk.net", new Date(), new PhoneNumber("010", "4040","3981" ));
		service.updateStudentApi(std);
	}*/
	/*@Test
	public void testupdateStudentAnnotation(){
		Student std = new Student(1, "bb", "kk@kk.net", new Date(), new PhoneNumber("010", "4040","3981" ));
		service.updateStudentAnnotation(std);
	}*/
	
	/*@Test
	public void testinsertStudent(){
		Student std = new Student(3, "bb", "kk@kk.net", new Date(), new PhoneNumber("010", "4040","3981" ));
		service.insertStudent(std);
	}*/
	/*@Test
	public void testinsertStudentApi(){
		Student std = new Student(4, "ee", "kk@kk.net", new Date(), new PhoneNumber("010", "4040","3981" ));
		service.insertStudentApi(std);
	}*/
	
	/*@Test
	public void testinsertStudentAnnotation(){
		Student std = new Student(5, "ff", "kk@kk.net", new Date(), new PhoneNumber("010", "4040","3981" ));
		service.insertStudentAnnotation(std);
	}*/
	
/*	@Test
	public void testinsertStudent(){
		Student std = new Student();
		std.setStudId(5);
		service.deleteStudent(std);
	}*/
	@Test
	public void testinsertStudentApi(){
		Student std = new Student();
		std.setStudId(4);
		service.deleteStudentApi(std);
	}
	@Test
	public void testinsertStudentAnnotation(){
		Student std = new Student();
		std.setStudId(3);
		service.deleteStudentAnnotation(std);
	}
}
