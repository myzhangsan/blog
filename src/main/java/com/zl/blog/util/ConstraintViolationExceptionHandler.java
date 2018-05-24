package com.zl.blog.util;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.apache.commons.lang3.StringUtils;

/**
 * @author 作者 Zhang Liang:
 * @version 创建时间：2018年5月24日 下午11:36:59
 */
public class ConstraintViolationExceptionHandler {

	/**
	 * @Title: getMessage   
	 * @Description: TODO(获取批量异常信息)   
	 * @param: @param exception
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	public static String getMessage(ConstraintViolationException exception) {
		List<String> msgList = new ArrayList<>();
		for (ConstraintViolation<?> constraintViolation : exception.getConstraintViolations()) {
			msgList.add(constraintViolation.getMessage());
		}
		String message = StringUtils.join(msgList.toArray(), ";");
		return message;
	}
}
