package kr.or.dgit.mybatis_dev.dao.utill;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.services.TutorService;
import kr.or.digt.mybatis_dev.dao.CourseMapper;

public class CourseMapperImpl implements CourseMapper {
	private static final Log log = LogFactory.getLog(CourseMapperImpl.class);
	private SqlSession sqlsession;
	private String namespace ="kr.or.digt.mybatis_dev.dao.CourseMapper";
	
	public CourseMapperImpl(SqlSession sqlsession) {
		super();
		this.sqlsession = sqlsession;
	}


	@Override
	public List<Course> searchCourse(Map<String, Object> param) {
			log.debug("searchCourse()");
			return sqlsession.selectList(namespace +".searchCourse", param);
	}


	@Override
	public List<Course> searchChoose(Map<String, Object> param) {
		log.debug("searchChoose()");
		return sqlsession.selectList(namespace+".searchChoose",param);
	}


	@Override
	public List<Course> searchWhere(Map<String, Object> param) {
		log.debug("searchChoose()");
		return sqlsession.selectList(namespace+".serchWhere",param);
	}


	@Override
	public List<Course> searchTrim(Map<String, Object> param) {
		log.debug("searchChoose()");
		return sqlsession.selectList(namespace+".searchTrim",param);
	}


	@Override
	public List<Course> searchForeach(Map<String, Object> param) {
		log.debug("searchChoose()");
		return sqlsession.selectList(namespace+".searchForeach",param);
	}
	
	

}
