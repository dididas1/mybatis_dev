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
	public Student findStudentByNo(Student student){
		log.debug("findStudentByNo()");
		try(SqlSession sqlsession= MybatisSqlSessionFactory.opensesstion();){
			return sqlsession.getMapper(StudentMapper.class).selectStudentByNo(student);
		}
	}
	
	public Student findStudentByNoApi(Student student){
		log.debug("findStudentByNoApi()");
		try(SqlSession sqlsession= MybatisSqlSessionFactory.opensesstion();){
			return sqlsession.selectOne(namespace + ".selectOne", student);
		}
	}
	
	public Student selectStudnetByNoAnnotation(Student studnet){
		log.debug("selectStudnetByNoAnnotation()");
		try(SqlSession sqlsession= MybatisSqlSessionFactory.opensesstion();){
			return sqlsession.getMapper(StudentMapper.class).selectStudnetByNoAnnotation(studnet);
		}
	}

	public List<Student> selecStudentByAll() {
		log.debug("selectStudentByNo()");
		try(SqlSession sqlsession = MybatisSqlSessionFactory.opensesstion();){
		return sqlsession.getMapper(StudentMapper.class).selecStudentByAll();
	}
}
	
	public List<Student> selecStudentByApi() {
		log.debug("selecStudentByApi()");
		try(SqlSession sqlsession= MybatisSqlSessionFactory.opensesstion();){
			return sqlsession.selectList(namespace + ".selectAll");
		}
	}

	public List<Student> selecStudentByAnnotation() {
		log.debug("selectStudnetByNoAnnotation()");
		try(SqlSession sqlsession= MybatisSqlSessionFactory.opensesstion();){
			return sqlsession.getMapper(StudentMapper.class).selecStudentByAnnotation();
		}
	}
	
	public int updateStudent(Student student) {
		log.debug("updateStudent()");
		int res= -1;
		try(SqlSession sqlsession= MybatisSqlSessionFactory.opensesstion();){
			res= sqlsession.getMapper(StudentMapper.class).updateStudent(student);
			sqlsession.commit();
			return res;
			
		}
	}


	public int updateStudentApi(Student student) {
		log.debug("updateStudentApi()");
		int res= -1;
		try(SqlSession sqlsession = MybatisSqlSessionFactory.opensesstion();){
		res =sqlsession.update(namespace + ".updateitem", student);
		sqlsession.commit();
		return res;
	}
}

	public int updateStudentAnnotation(Student student) {
		log.debug("updateStudentApi()");
		int res= -1;
		try(SqlSession sqlsession = MybatisSqlSessionFactory.opensesstion();){
		res =  sqlsession.getMapper(StudentMapper.class).updateStudentAnnotation(student);
		sqlsession.commit();
		return res;
		}
		
	}
	public int insertStudent(Student student) {
		log.debug("insertStudent()");
		int res= -1;
		try(SqlSession sqlsession = MybatisSqlSessionFactory.opensesstion();){
		res =  sqlsession.getMapper(StudentMapper.class).insertStudent(student);
		sqlsession.commit();
		return res;
		}
	}

	public int insertStudentApi(Student student) {
		log.debug("insertStudentApi()");
		int res= -1;
		try(SqlSession sqlsession = MybatisSqlSessionFactory.opensesstion();){
		res =sqlsession.update(namespace + ".insertitem", student);
		sqlsession.commit();
		return res;
	}
}
	public int insertStudentAnnotation(Student student) {
		log.debug("insertStudentAnnotation()");
		int res= -1;
		try(SqlSession sqlsession = MybatisSqlSessionFactory.opensesstion();){
		res =  sqlsession.getMapper(StudentMapper.class).insertStudentAnnotation(student);
		sqlsession.commit();
		return res;
	}
}
	

	public int deleteStudent(Student student) {
		log.debug("deleteStudent()");
		int res= -1;
		try(SqlSession sqlsession = MybatisSqlSessionFactory.opensesstion();){
		res =  sqlsession.getMapper(StudentMapper.class).deleteStudent(student);
		sqlsession.commit();
		return res;
		}
	}
	
	public int deleteStudentApi(Student student) {
		log.debug("deleteStudentApi()");
		int res= -1;
		try(SqlSession sqlsession = MybatisSqlSessionFactory.opensesstion();){
		res =  sqlsession.delete(namespace + ".deleteitem", student);
		sqlsession.commit();
		return res;
		}
	}

	public int deleteStudentAnnotation(Student student) {
		log.debug("deleteStudentAnnotation()");
		int res= -1;
		try(SqlSession sqlsession = MybatisSqlSessionFactory.opensesstion();){
		res =  sqlsession.getMapper(StudentMapper.class).deleteStudentAnnotation(student);
		sqlsession.commit();
		return res;
		}
	}
}
