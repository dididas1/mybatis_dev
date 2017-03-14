package kr.or.dgit.mybatis_dev;

import java.util.ArrayList;
import java.util.Collections;
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
	
	@Test
	public void testselectStudentByNoForResultMap(){
		Student std= new Student();
		std.setStudId(2);
		Student selectstd = service.selectStudentByNoForResultMap(std);
		Assert.assertNotNull(selectstd);
		
	}
	@Test
	public void testselectStudentByAllForResultMap(){
		List<Student> list = service.selectStudentByAllForResultMap();
		List<Student> emplist = Collections.emptyList();
		Assert.assertNotEquals(emplist, list);
	}
}
