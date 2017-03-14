package kr.or.dgit.mybatis_dev.services;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import kr.or.dgit.mybatis_dev.dao.utill.MybatisSqlSessionFactory;
import kr.or.dgit.mybatis_dev.dto.Tutor;
import kr.or.digt.mybatis_dev.dao.TutorMapper;

public class TutorService {
	private static final Logger logger = Logger.getLogger(TutorService.class);
	private static final TutorService instence= new TutorService();
	
	public static TutorService getInstence() {
		return instence;
	}

	public TutorService() {}
	
	public Tutor findTutorById(int id){
		logger.debug("findTutorById(");
		try(SqlSession sqlsesstion = MybatisSqlSessionFactory.opensesstion();){
			TutorMapper tutorMapper = sqlsesstion.getMapper(TutorMapper.class);
			return tutorMapper.findTutorById(id);
		}
	}
	
	
	

}
