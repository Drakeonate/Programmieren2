package regex.email;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchContent {

	private String content;
	private Email [] emails;
	
	public SearchContent(String content, Email [] emails) {
		this.content = content;
		this.emails = emails;
	}
	
	
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
