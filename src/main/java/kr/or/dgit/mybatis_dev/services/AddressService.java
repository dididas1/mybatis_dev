package kr.or.dgit.mybatis_dev.services;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import kr.or.dgit.mybatis_dev.dao.utill.AddressMapperImpl;
import kr.or.dgit.mybatis_dev.dao.utill.MybatisSqlSessionFactory;
import kr.or.dgit.mybatis_dev.dto.Address;
import kr.or.dgit.mybatis_dev.dto.Tutor;
import kr.or.digt.mybatis_dev.dao.AddressMapper;
import kr.or.digt.mybatis_dev.dao.TutorMapper;

public class AddressService {
	private static final Logger logger = Logger.getLogger(AddressService.class);
	private static final AddressService instence= new AddressService();

	public static AddressService getInstence() {
		return instence;
	}

	public AddressService() {}
	public Address selectAddressByAddrIdAndState(String state, String zip) {
		logger.debug("selectAddressByAddrIdAndState()");
		try(SqlSession sqlsesstion = MybatisSqlSessionFactory.opensesstion();){
			AddressMapperImpl addressMapper = new AddressMapperImpl(sqlsesstion);
			return addressMapper.selectAddressByAddrIdAndState(state, zip);
		}
	}


	public Address selectAddressByAddrIdAndStateForMap(Map<String, Object> pram) {
		logger.debug("selectAddressByAddrIdAndStateForMap()");
		try(SqlSession sqlsesstion = MybatisSqlSessionFactory.opensesstion();){
			AddressMapperImpl addressMapper = new AddressMapperImpl(sqlsesstion);
			return addressMapper.selectAddressByAddrIdAndStateForMap(pram);
		}

	}

	public List<Address> selectAddressByAddresLimit(RowBounds rowbound){
		logger.debug("selectAddressByAddrIdAndStateForMap()");
		try(SqlSession sqlsesstion = MybatisSqlSessionFactory.opensesstion();){
			AddressMapperImpl addressMapper = new AddressMapperImpl(sqlsesstion);
			return addressMapper.selectAddressByAddresLimit(rowbound);
		}

	}




}
