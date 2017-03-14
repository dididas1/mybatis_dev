package kr.or.dgit.mybatis_dev.services;

import java.util.List;
import java.util.Map;

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
		log.debug("selectStudentByAllForResultMap()");
		try(SqlSession sqlsession = MybatisSqlSessionFactory.opensesstion();){
			return sqlsession.getMapper(StudentMapper.class).selectStudentByAllForResultMap();
		}

	}


	public Student selectStudentByNoForResultMap(Student studnet){
		log.debug("selectStudentByAllForResultMap()");
		try(SqlSession sqlsession = MybatisSqlSessionFactory.opensesstion();){
			return sqlsession.selectOne(namespace + ".selectStudentByNoForResultMap", studnet);
		}
	}
	
	public Map<String, Object> selectStudentByNoForHashMap(Student studnet){
		log.debug("selectStudentByNoForHashMap()");
		try(SqlSession sqlsession = MybatisSqlSessionFactory.opensesstion();){
			return sqlsession.selectOne(namespace + ".selectStudentByNoForHashMap", studnet);
		}
	}
	

	public List<Map<String, Object>> selectStudentByAllForHashMap(){
		log.debug("selectStudentByAllForHashMap()");
		try(SqlSession sqlsession = MybatisSqlSessionFactory.opensesstion();){
			return sqlsession.selectList(namespace +".selectStudentByAllForHashMap");
		}

	}
	
	public Student selectStudentByNoWithAddress(Student studnet){
		log.debug("selectStudentByNoWithAddress()");
		try(SqlSession sqlsession = MybatisSqlSessionFactory.opensesstion();){
			return sqlsession.selectOne(namespace + ".selectStudentByNoWithAddress", studnet);
		}
		
	}
	
	public Student selectStudentByNoAssociationAddress(Student studnet){
		log.debug("selectStudentByNoAssociationAddress()");
		try(SqlSession sqlsession = MybatisSqlSessionFactory.opensesstion();){
			return sqlsession.selectOne(namespace + ".selectStudentByNoAssociationAddress", studnet);
		}
	}
	
}
