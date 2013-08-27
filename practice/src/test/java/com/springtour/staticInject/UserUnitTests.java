package com.springtour.staticInject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.*;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:context-practice-static-inject.xml" })
public class UserUnitTests extends TestCase {
	@Test
	public void testStaticInject(){
		String expectedAdmin = "管理员";
		String expectedUser = "用户";
		String actualAdmin = User.getType("0");
		String actualUser = User.getType("1");
		Assert.assertEquals(expectedAdmin, actualAdmin);
		Assert.assertEquals(expectedUser, actualUser);
	}
}
