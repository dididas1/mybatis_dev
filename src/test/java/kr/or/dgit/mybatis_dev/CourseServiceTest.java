package kr.or.dgit.mybatis_dev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.dto.Tutor;
import kr.or.dgit.mybatis_dev.services.CourseService;
import kr.or.dgit.mybatis_dev.services.TutorService;

public class CourseServiceTest {
	private static CourseService courseservice;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		courseservice = new CourseService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		courseservice = null;
	}

/*	@Test
	public void testsearchCourse() {
		Map<String, Object> param = new HashMap<>();
		param.put("tutorId", 1);
		param.put("courseName",	"%java%");
		param.put("startDate", "2013-01-01");
		param.put("endDate", "2013-08-01");
		List<Course> searchCourse = courseservice.searchCourse(param);
		Assert.assertNotNull(searchCourse);

	}*/
/*	@Test
	public void testsearchChoose() {
		Map<String, Object> param = new HashMap<>();
		param.put("searchBy", "Tutor");
		param.put("tutorId", 1);
		List<Course> searchCourse = courseservice.searchChoose(param);
		Assert.assertNotNull(searchCourse);
		
		param.replace("searchBy", "courseName");
		param.remove("tutorId");
		param.put("courseName", "%java%");
		searchCourse =courseservice.searchChoose(param);

		param.remove("courseName");
		param.remove("searchBy");
		searchCourse =courseservice.searchChoose(param);

	}
	*/
	/*@Test
	public void testsearchWhere(){
		Map<String, Object> param = new HashMap<>();
		param.put("tutorId", 1);
		List<Course> searchCourse = courseservice.searchWhere(param);
		param.clear();
		param.put("courseName", "%java%");
		searchCourse = courseservice.searchWhere(param);
		param.clear();
		param.put("startDate", "2013-01-01");
		searchCourse = courseservice.searchWhere(param);
		param.clear();
		param.put("endDate", "2013-08-01");
		searchCourse = courseservice.searchWhere(param);
	}*/
	/*@Test
	public void testsearchTrim(){
		Map<String, Object> param = new HashMap<>();
		
		List<Course> searchCourse = courseservice.searchTrim(param);
		
		param.put("tutorId", 1);
		searchCourse = courseservice.searchTrim(param);
		
		param.clear();
		param.put("courseName", "%java%");
		searchCourse = courseservice.searchTrim(param);
		
		param.clear();
		param.put("courseName", "%java%");
		param.put("tutorId", 1);
		searchCourse = courseservice.searchTrim(param);
	}*/
	/*@Test
	public void testsearchForeach(){
		List<Integer> tutorIds= new ArrayList<Integer>();
		tutorIds.add(1);
		tutorIds.add(2);
	
		
		Map<String, Object> param = new HashMap<>();
		param.put("tutorIds", tutorIds);
		
		List<Course> searchCourse = courseservice.searchForeach(param);
	}*/
}
