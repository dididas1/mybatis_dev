package kr.or.dgit.mybatis_dev.services;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import kr.or.dgit.mybatis_dev.dao.utill.CourseMapperImpl;
import kr.or.dgit.mybatis_dev.dao.utill.MybatisSqlSessionFactory;
import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.dto.Tutor;
import kr.or.digt.mybatis_dev.dao.TutorMapper;

public class CourseService {

	public List<Course> searchCourse(Map<String, Object> param){
		try(SqlSession sqlsession = MybatisSqlSessionFactory.opensesstion()){
			CourseMapperImpl coursemapper = new CourseMapperImpl(sqlsession);
			return coursemapper.searchCourse(param);
		}

	}

	public List<Course> searchChoose(Map<String, Object> param){
		try(SqlSession sqlsession = MybatisSqlSessionFactory.opensesstion();){
			CourseMapperImpl coursemapper = new CourseMapperImpl(sqlsession);
			return	coursemapper.searchChoose(param);
		}
	}

	public List<Course> searchWhere(Map<String, Object> param){
		try(SqlSession sqlsession = MybatisSqlSessionFactory.opensesstion();){
			CourseMapperImpl coursemapper = new CourseMapperImpl(sqlsession);
			return	coursemapper.searchWhere(param);
		}
	}

	public List<Course> searchTrim(Map<String, Object> param){
		try(SqlSession sqlsession = MybatisSqlSessionFactory.opensesstion();){
			CourseMapperImpl coursemapper = new CourseMapperImpl(sqlsession);
			return	coursemapper.searchTrim(param);
		}
	}

	public List<Course> searchForeach(Map<String, Object> param){
		try(SqlSession sqlsession = MybatisSqlSessionFactory.opensesstion();){
			CourseMapperImpl coursemapper = new CourseMapperImpl(sqlsession);
			return	coursemapper.searchForeach(param);
		}
	}
}

