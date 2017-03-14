package kr.or.digt.mybatis_dev.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kr.or.dgit.mybatis_dev.dto.Student;

public interface StudentMapper {
	Student selectStudentByNoForResultMap(Student studnet);
	List<Student> selectStudentByAllForResultMap();
	}
