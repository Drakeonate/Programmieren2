package quiz;

public abstract class GeneralQuestion {
	
	private String question;
	private String answer;
	private boolean isUsed;
	private boolean isRightAnswer;
	
	
	public GeneralQuestion(String question, String answer) {
		this(question, answer, false, false);
	}

	//dieser Konstruktor macht dann Sinn, wenn wir Daten in Dateien schreiben können
	//Ansonsten sind isUsed und isRightAnswer false
	public GeneralQuestion(String question, String answer, boolean isUsed, boolean isRightAnswer) {		
		this.question = question;
		this.answer = answer;
		this.isUsed = isUsed;
		this.isRightAnswer = isRightAnswer;
	}

	public boolean isUsed() {
		return isUsed;
	}

	public void setUsed(boolean isUsed) {
		this.isUsed = isUsed;
	}

	public boolean isRightAnswer() {
		return isRightAnswer;
	}

	public void setRightAnswer(boolean isRightAnswer) {
		this.isRightAnswer = isRightAnswer;
	}

	public String getQuestion() {
		return question;
	}

	public String getAnswer() {
		return answer;
	}

	public abstract String areYouSure();

	

	
	
	
	

}
