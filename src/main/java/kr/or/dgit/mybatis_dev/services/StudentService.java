package kr.or.dgit.mybatis_dev.services;

import java.util.List;

import javax.rmi.CORBA.StubDelegate;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.utill.MybatisSqlSessionFactory;
import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.digt.mybatis_dev.dao.StudentMapper;


public class StudentService{
	private static final Log log = LogFactory.getLog(StudentService.class);
	private String namespace="kr.or.digt.mybatis_dev.dao.StudentMapper";
	
	public List<Student> selectStudentByAllForResultMap(){
		log.debug("selectStudentByAllForResultMap");
		try(SqlSession sqlsession = MybatisSqlSessionFactory.opensesstion();){
			return sqlsession.getMapper(StudentMapper.class).selectStudentByAllForResultMap();
		}
		
	}
	
	
	public Student selectStudentByNoForResultMap(Student studnet){
		log.debug("selectStudentByAllForResultMap");
		try(SqlSession sqlsession = MybatisSqlSessionFactory.opensesstion();){
			return sqlsession.selectOne(namespace + ".selectStudentByNoForResultMap", studnet);
		}
	}
	}
