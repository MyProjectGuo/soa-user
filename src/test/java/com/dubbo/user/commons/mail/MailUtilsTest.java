package com.dubbo.user.commons.mail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dubbo.user.SoaUserApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SoaUserApplication.class)
public class MailUtilsTest {

	@Test
	public void test() {
		MailUtils mail = new MailUtils();
		 try {
			mail.sendMail();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
