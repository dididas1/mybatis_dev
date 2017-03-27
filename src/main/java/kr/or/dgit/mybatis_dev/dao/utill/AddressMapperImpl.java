package kr.or.dgit.mybatis_dev.dao.utill;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.Address;
import kr.or.digt.mybatis_dev.dao.AddressMapper;

public class AddressMapperImpl implements AddressMapper {
	private static final Log log = LogFactory.getLog(AddressMapperImpl.class);
	private SqlSession sqlsession;
	private String namespace ="kr.or.digt.mybatis_dev.dao.AddressMapper.";
	
	
	public AddressMapperImpl(SqlSession sqlsession) {
		super();
		this.sqlsession = sqlsession;
	}

	@Override
	public Address selectAddressByAddrIdAndState(String state, String zip) {
		log.debug("selectAddressByAddrIdAndState()");
		return sqlsession.getMapper(AddressMapper.class).selectAddressByAddrIdAndState(state, zip);
	}

	@Override
	public Address selectAddressByAddrIdAndStateForMap(Map<String, Object> pram) {
		log.debug("selectAddressByAddrIdAndStateForMap()");
		return sqlsession.selectOne(namespace + "selectAddressByAddrIdAndStateForMap",pram);
	}

	@Override
	public List<Address> selectAddressByAddresLimit(RowBounds rowbound) {
		log.debug("selectAddressByAddresLimit()");
		return sqlsession.selectList(namespace + "selectAddressByAddresLimit",null,rowbound);
		
	}

}
