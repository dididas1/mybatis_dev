package kr.or.dgit.mybatis_dev.services;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.utill.MybatisSqlSessionFactory;
import kr.or.dgit.mybatis_dev.dao.utill.UserMapperImpl;
import kr.or.dgit.mybatis_dev.dto.UserPic;

public class UserPicService {
	public int inserUserPic(UserPic userpic){
		try(SqlSession sqlsession = MybatisSqlSessionFactory.opensesstion();){
			UserMapperImpl impl = new UserMapperImpl(sqlsession);
			int res= impl.inserUserPic(userpic);
			sqlsession.commit();
			return res;
		}
		
		
	}
	public UserPic selectUserPicById(int id){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.opensesstion();){
			UserMapperImpl impl = new UserMapperImpl(sqlSession);
			return impl.selectUserPicById(id);
		}
		
	}
}
