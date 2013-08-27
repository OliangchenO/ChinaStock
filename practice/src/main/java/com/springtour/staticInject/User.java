package com.springtour.staticInject;

public class User {
	private static UserTypeService userType;
	
	public void setUserType(UserTypeService userType){
		User.userType = userType;
    }
	
	public static String getType(String typeId){
		if(typeId.equals("0")){
			return userType.getAdmin();
		}else{
			return userType.getTour();
		}
	}
}
