package com.springtour.util;

import java.text.SimpleDateFormat;
import java.util.*;

public final class DateUtils {

	private DateUtils() {

	}

	public static Date copyWithoutSencondsAndMillis(Date prototype) {
		Calendar c = Calendar.getInstance();
		c.setTime(prototype);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		return c.getTime();
	}
	
	/**
     * 转变日期格式
     * 
     * @return 日期，格式如：20070110
     */
    public static String getDate(Date date) {
        SimpleDateFormat d = new SimpleDateFormat();
        d.applyPattern("yyyyMMdd");
        String strDate = d.format(date);
        return strDate;
    }

    /**
     * 转变时间格式
     * 
     * @return 返回格式为HHMISS HH为24小时制 (eg: 165838)
     */
    public static String getTime(Date date) {
    	SimpleDateFormat d = new SimpleDateFormat();
        d.applyPattern("HH:mm:ss");
        String strTime = d.format(date);
        return strTime;
    }
    
    public static String getDateAndTime(Date date) {
    	SimpleDateFormat d = new SimpleDateFormat();
        d.applyPattern("yyyyMMddHHmmss");
        String strTime = d.format(date);
        return strTime;
    }
}
