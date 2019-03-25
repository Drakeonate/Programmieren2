package quiz;

public class MultiplayerQuestion extends GeneralQuestion {

	private String [] playerNames;
	
	public MultiplayerQuestion(String question, String answer) {
		super(question, answer);

	}

	public MultiplayerQuestion(String question, String answer, boolean isUsed, boolean isRightAnswer) {
		super(question, answer, isUsed, isRightAnswer);

	}


	public void setPlayerNames(String[] playerNames) {
		this.playerNames = playerNames;
	}
	
	public String[] getPlayerNames() {
		return playerNames;
	}
	
	@Override
	public String areYouSure() {
		return "Bist du dir wirklich sicher? Das wäre ich mir nicht!";
	}
	
	

}
