package kr.or.dgit.mybatis_dev;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.services.StudentService;

@FixMethodOrder (MethodSorters.NAME_ASCENDING)
public class StudentServiceTest {
	private static final int Vector = 0;
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
	public void atestselectStudentByNoForResultMap(){
		Student std= new Student();
		std.setStudId(2);
		Student selectstd = service.selectStudentByNoForResultMap(std);
		Assert.assertNotNull(selectstd);
		
	}
	@Test
	public void btestselectStudentByAllForResultMap(){
		List<Student> list = service.selectStudentByAllForResultMap();
		List<Student> emplist = Collections.emptyList();
		Assert.assertNotEquals(emplist, list);
	}
	
	@Test
	public void ctestselectStudentByNoForHashMap(){
		Student std= new Student();
		std.setStudId(2);
		Map<String, Object> selectstd = service.selectStudentByNoForHashMap(std);
		for(Entry<String, Object> e:selectstd.entrySet()){
			System.out.printf("key:%s -> value:%s %n",e.getKey(),e.getValue());
		}
		Assert.assertNotNull(selectstd);
		
	}
	@Test
	public void dtestselectStudentByAllForHashMap(){
		List<Map<String, Object>> list = service.selectStudentByAllForHashMap();
		List<Map<String, Object>> emplist = Collections.emptyList();
		for(Map<String, Object> map:list){
			for(Entry<String, Object> e:map.entrySet()){
				System.out.printf("key:%s -> value:%s %n",e.getKey(),e.getValue());
			}
		}
		Assert.assertNotEquals(emplist, list);
	}
	@Test
	public void eTestselectStudentByNoWithAddress(){
		Student std = new Student();
		std.setStudId(1);
		Student selectstd = service.selectStudentByNoWithAddress(std);
		Assert.assertNotNull(selectstd);
	}
	@Test
	public void fTestselectStudentByNoAssociationAddress(){
		Student std = new Student();
		std.setStudId(1);
		Student selectstd = service.selectStudentByNoAssociationAddress(std);
		Assert.assertNotNull(selectstd);
	}
}
