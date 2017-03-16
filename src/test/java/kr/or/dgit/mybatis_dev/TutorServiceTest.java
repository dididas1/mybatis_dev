package kr.or.dgit.mybatis_dev;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_dev.dto.Address;
import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.dto.Gender;
import kr.or.dgit.mybatis_dev.dto.PhoneNumber;
import kr.or.dgit.mybatis_dev.dto.Tutor;
import kr.or.dgit.mybatis_dev.services.TutorService;

public class TutorServiceTest {
	private static TutorService tutorservice;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		tutorservice = new TutorService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		tutorservice = null;
	}

	/*@Test
	public void testfindTutorById() {
		Tutor tutor= tutorservice.findTutorById(1);
		Assert.assertNotNull(tutor);
		System.out.println("testfindTutorById()"+tutor);
		List<Course> course = tutor.getCourses();
		Assert.assertNotNull(course);
		for(Course c:course){
			Assert.assertNotNull(c);
			System.out.println(c);
		}
	}
*/
	@Test
	public void testInserTutor(){
		Tutor tutor = new Tutor();
		tutor.setTutorId(6);
		tutor.setName("이승우");
		tutor.setEmail("2@3.net");
		tutor.setPhone(new PhoneNumber("010-1111-1111"));
		tutor.setGender(Gender.MALE);
		tutorservice.insertTutor(tutor);
		
		
	}
}
