package regex.email;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchContent {

	private String content;
	private Email [] emails;
	
	/**
	 * SearchContent searches for a regular expression in every mail. For that this class need this expression as first argument in this constructor.
	 * @param content regular expression that you are searching for
	 * @param emails Array of email objects in which you want to search
	 */
	public SearchContent(String content, Email [] emails) {
		this.content = content;
		this.emails = emails;
	}
	
	
	/**
	 * This method will return the search result of the regular expression and the array of email objects given in the constructor.
	 * @return arraylist of mails which matches the search
	 */
	public ArrayList<Email> getResults() {

		ArrayList<Email> tmp = new ArrayList<>();
		
		Pattern pattern = Pattern.compile(content);
		
		for(Email e : emails) {

			Matcher matcher = pattern.matcher(e.getTitle());
			
			if(matcher.find()) {
				tmp.add(e);
			}
			else {
				matcher = pattern.matcher(e.getMessage());
				
				if(matcher.find()) {
					tmp.add(e);
				}
			}
		}

		return tmp;
	}
	
	
}
