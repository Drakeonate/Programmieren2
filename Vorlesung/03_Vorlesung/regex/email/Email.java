package regex.email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

	private String title;
	private String sender;
	private String receiver;
	private String message;
	private String date;
//	private String state;
//	
//	private static final String INBOX_STATE = "Mail.Inbox";
//	private static final String DELETE_STATE = "Mail.Delete";
//	private static final String OUTBOX_STATE = "Mail.Outbox";
//	private static final String DRAFT_STATE = "Mail.Draft";
	
	public Email() {
//		state = DRAFT_STATE;
	}

	public Email(String title, String message) {
		this();
		this.message = message;
		this.title = title;
	}
	
	public Email(String title, String sender, String receiver, String message, String date) {
		//TODO check values
		this.title = title;
		this.sender = sender;
		this.receiver = receiver;
		this.message = message;
		this.date = date;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
			this.title = title;			
	}


	public String getSender() {
		return sender;
	}


	public void setSender(String sender) {
		this.sender = sender;
	}


	public String getReceiver() {
		return receiver;
	}


	public void setReceiver(String receiver) {
			this.receiver = receiver;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
			this.message = message;
	}


	public String getDate() {
		return date;
	}


//	public boolean sendMail() {
//		if(state.equals(DRAFT_STATE)) {
//			state = OUTBOX_STATE;
//			return true;
//		}
//		return false;
//	}
//
//	public boolean forwardMail() {
//		
//	}
//	
	
	
	private boolean checkEmailAddress(String address) {
		Pattern pattern = Pattern.compile("((\\w)|(.))+@[a-zA-Z]+.[a-zA-Z]{2,4}");
		Matcher matcher = pattern.matcher(address);
		
		if(matcher.find()) {
			return true;
		}
		else 
			return false;
	}
	
	@Override
	public String toString() {
		
		String mail = title + "\n\n" + message;
		return mail;
	}
}
