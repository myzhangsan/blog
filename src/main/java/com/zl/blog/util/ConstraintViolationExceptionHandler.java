package com.zl.blog.util;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.apache.commons.lang3.StringUtils;

/**
 * @author ���� Zhang Liang:
 * @version ����ʱ�䣺2018��5��24�� ����11:36:59
 */
public class ConstraintViolationExceptionHandler {

	/**
	 * @Title: getMessage   
	 * @Description: TODO(��ȡ�����쳣��Ϣ)   
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
