package quiz;

public class MultipleChoiseQuestion extends GeneralQuestion{

	private String [] wrongAnswers;
	
	public MultipleChoiseQuestion(String question, String answer) {
		super(question, answer);
	}
	
	public MultipleChoiseQuestion(String question, String answer, boolean isUsed, boolean isRightAnswer) {
		super(question, answer, isUsed, isRightAnswer);
	}

	public String[] getWrongAnswers() {
		return wrongAnswers;
	}
	
	public void setWrongAnswers(String[] wrongAnswers) {
		this.wrongAnswers = wrongAnswers;
	}
	
	@Override
	public String areYouSure() {
		return "Hast du dir das gut überlegt?";
	}

	


	@Override
	public String toString() {
		
		String antworten = "";
		if(wrongAnswers != null) {
			for(int i = 0; i < wrongAnswers.length; i++) {
				antworten += wrongAnswers[i] + "\n";
			}
		}
		
		String str = super.getQuestion() + "\nAntwort: " + super.getAnswer() + "\n\nisUsed: " + isUsed() + 
				"\nisRightAnswer: " + isRightAnswer() + "\n\nAntwortmöglichkeiten:\n" + antworten;
				
		return str;
	}
	

}
