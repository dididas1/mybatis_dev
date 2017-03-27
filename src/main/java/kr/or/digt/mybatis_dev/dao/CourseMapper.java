package kr.or.digt.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import kr.or.dgit.mybatis_dev.dto.Course;

public interface CourseMapper {
	List<Course> searchCourse(Map<String, Object> param);
	List<Course> searchChoose(Map<String, Object> param);
	List<Course> searchWhere(Map<String, Object> param);
	List<Course> searchTrim(Map<String, Object> param);
	List<Course> searchForeach(Map<String, Object> param);
	
	
}
