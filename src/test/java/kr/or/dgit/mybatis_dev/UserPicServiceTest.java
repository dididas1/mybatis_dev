package kr.or.dgit.mybatis_dev;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.Address;
import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.dto.Gender;
import kr.or.dgit.mybatis_dev.dto.PhoneNumber;
import kr.or.dgit.mybatis_dev.dto.Tutor;
import kr.or.dgit.mybatis_dev.dto.UserPic;
import kr.or.dgit.mybatis_dev.services.TutorService;
import kr.or.dgit.mybatis_dev.services.UserPicService;

@FixMethodOrder (MethodSorters.NAME_ASCENDING)
public class UserPicServiceTest {
	private static UserPicService userPicService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		userPicService = new UserPicService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		userPicService = null;
	}

	/*@Test
	public void atestInserUserPic(){
		byte[] pic =null;
		File file= new File(System.getProperty("user.dir")+"\\DataFiles\\1.jpg");
		try (InputStream is = new FileInputStream(file);){
			pic = new byte[is.available()];
			is.read(pic);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		UserPic userpic= new UserPic(1, "미나", pic, "트와이스");
		int res=userPicService.inserUserPic(userpic);
		Assert.assertEquals(1, res);
		
	}*/
	/*@Test
	public void btestFindUserPic(){
		UserPic userpic = userPicService.selectUserPicById(1);
		byte[] pic= userpic.getPic();
		File file = new File(System.getProperty("user.dir")+"\\DownloadFiles\\미나.jpg");
		try(OutputStream os= new FileOutputStream(file);) {
			os.write(pic);
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Assert.assertNotNull(userpic);
	}*/
}
