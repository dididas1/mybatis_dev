package kr.or.dgit.mybatis_dev.dao.utill;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.UserPic;
import kr.or.digt.mybatis_dev.dao.UserPicMapper;

public class UserMapperImpl implements UserPicMapper {
	private static final Log log = LogFactory.getLog(UserPic.class);
	private SqlSession sqlsession;
	private String namespace="kr.or.digt.mybatis_dev.dao.UserPicMapper.";
	
	
	
	public UserMapperImpl(SqlSession sqlsession) {
		super();
		this.sqlsession = sqlsession;
	}

	@Override
	public int inserUserPic(UserPic userpic) {
		log.debug("inserUserPic()");
		return sqlsession.insert(namespace+"inserUserPic", userpic);
	}

	@Override
	public UserPic selectUserPicById(int id) {
		log.debug("selectUserPicById()");
		return sqlsession.selectOne(namespace+"selectUserPicById", id);
	}

}
