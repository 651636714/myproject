package com.sys.table;

public class MessageTable {
	
	int message_id;
	int message_user_id;
	String message_content;
	String message_status;
	public int getMessage_id() {
		return message_id;
	}
	public void setMessage_id(int message_id) {
		this.message_id = message_id;
	}
	public int getMessage_user_id() {
		return message_user_id;
	}
	public void setMessage_user_id(int message_user_id) {
		this.message_user_id = message_user_id;
	}
	public String getMessage_content() {
		return message_content;
	}
	public void setMessage_content(String message_content) {
		this.message_content = message_content;
	}
	public String getMessage_status() {
		return message_status;
	}
	public void setMessage_status(String message_status) {
		this.message_status = message_status;
	}
	@Override
	public String toString() {
		return "MessageTable [message_id=" + message_id + ", message_user_id=" + message_user_id + ", message_content="
				+ message_content + ", message_status=" + message_status + "]";
	}
	public MessageTable(int message_id, int message_user_id, String message_content, String message_status) {
		super();
		this.message_id = message_id;
		this.message_user_id = message_user_id;
		this.message_content = message_content;
		this.message_status = message_status;
	}
	
	

}
