package kr.or.dgit.mybatis_dev;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_dev.dto.Address;
import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.dto.Gender;
import kr.or.dgit.mybatis_dev.dto.PhoneNumber;
import kr.or.dgit.mybatis_dev.dto.Tutor;
import kr.or.dgit.mybatis_dev.services.AddressService;
import kr.or.dgit.mybatis_dev.services.TutorService;

public class AddressServiceTest {
	private static AddressService addressService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		addressService = new AddressService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		addressService = null;
	}

	@Test
	public void aselectAddressByAddrIdAndState() {
		Address address= addressService.selectAddressByAddrIdAndState("ca", "92110");
		
	}
	
	@Test
	public void bselectAddressByAddrIdAndStateForMap() {
		Map<String, Object> param =new HashMap<>();
		param.put("state", "ca");
		param.put("zip", "92110");
		Address address = addressService.selectAddressByAddrIdAndStateForMap(param);
	}
	
	@Test
	public void cselectAddressByAddresLimit(){
		RowBounds rowbound = new RowBounds(0,3);
		List<Address> list= addressService.selectAddressByAddresLimit(rowbound);
	}


}
