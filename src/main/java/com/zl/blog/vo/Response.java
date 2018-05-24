package com.zl.blog.vo;

/**
 * @author ���� Zhang Liang:
 * @version ����ʱ�䣺2018��5��24�� ����11:32:30
 */
public class Response {
	private boolean success;   //�����Ƿ�ɹ�
	private String message;     //��Ϣ��ʾ
	private Object body;        //���ص�����

	
	
	
	public Response(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}

	public Response(boolean success, String message, Object body) {
		super();
		this.success = success;
		this.message = message;
		this.body = body;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getBody() {
		return body;
	}

	public void setBody(Object body) {
		this.body = body;
	}

}
