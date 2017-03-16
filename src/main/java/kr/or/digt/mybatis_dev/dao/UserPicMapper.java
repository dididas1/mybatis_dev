package kr.or.digt.mybatis_dev.dao;

import kr.or.dgit.mybatis_dev.dto.UserPic;

public interface UserPicMapper {
	int inserUserPic(UserPic userpic);
	UserPic selectUserPicById(int id);
}
