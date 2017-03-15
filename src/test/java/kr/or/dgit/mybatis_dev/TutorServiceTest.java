package kr.or.dgit.mybatis_dev;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_dev.dto.Course;
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
}
