package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期处理工具类
 * @author RanJi
 *
 */
public class DateUtil {
	/**
	 * 根据某种格式把字符串转化为日期
	 * @param dateFormat   日期格式
	 * @param dateStr   日期字符串
	 * @return  日期
	 */
	public static Date toDate(String dateFormat, String dateStr){
		SimpleDateFormat sdf = 
				new SimpleDateFormat(dateFormat);
		try {
			return sdf.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 根据某种日期格式把日期转化为字符串
	 * @param dateFormat  日期格式
	 * @param date  日期
	 * @return  日期字符串
	 */
	public static String dateToString(String dateFormat, Date date){
		return new SimpleDateFormat(dateFormat).format(date);
	}
}
