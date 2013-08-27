package com.springtour.grouptravel;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:context-infrastructure-ws.xml" })
public class SpringService4CtripTest {
	@Resource(name="air.group.SpringService4CtripWsFacade")
	private SpringService4Ctrip target;
	@Test
	public void test(){
		SearchFlightsBatchSearchBean searchInfo = new SearchFlightsBatchSearchBean();
		searchInfo.setCodeType(1);
		searchInfo.setDateRangeFlag(1);
		searchInfo.setDestCode("SHA");
		searchInfo.setLang("ZH-CN");
		searchInfo.setMoneyClassId(0);
		searchInfo.setOriCode("CAN");
		UsernameToken usernameToken = new UsernameToken();
		usernameToken.setUsername("ctrip");
		usernameToken.setPassword("123456");
		searchInfo.setUsernameToken(usernameToken );
		SearchFlightsBatchResultBean result = target.searchFlightsBatch(searchInfo);
		System.out.println("result:"+result.getIfSuccess());
		System.out.println("size:"+result.getFlightsList().size());
		for(FlightInfo flightInfo : result.getFlightsList()){
			System.out.println("FlightBasicInfo:"+flightInfo.getFlightBasicInfo());
			System.out.println("NormSeatPriceList:"+flightInfo.getNormSeatPriceList());
			System.out.println("SuperSeatPriceList:"+flightInfo.getSuperSeatPriceList());
		}
	}
}
