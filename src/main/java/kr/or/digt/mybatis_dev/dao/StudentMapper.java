package kr.or.digt.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import kr.or.dgit.mybatis_dev.dto.Student;

public interface StudentMapper {
	Student selectStudentByNoForResultMap(Student studnet);
	List<Student> selectStudentByAllForResultMap();
	
	Map<String, Object> selectStudentByNoForHashMap(Student studnet);
	List<Map<String, Object>> selectStudentByAllForHashMap();
	
	Student selectStudentByNoWithAddress(Student studnet);
	Student selectStudentByNoAssociationAddress(Student studnet);
	
	
}
