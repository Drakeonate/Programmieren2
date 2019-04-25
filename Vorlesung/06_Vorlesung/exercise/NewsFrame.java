package exercise;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;

/*
 * Das hier ist eine kleine GUI - Klasse, die GUI ist nicht schick, aber sie erfüllt den Zweck ;)
 * Ihr müsst absolut nichts von all dem verstehen. GUI machen wir ja eh mit Android in ein paar Wochen. 
 * Dann könnt ihr das noch mal in schick aufs Smartphone bringen :)
 */
public class NewsFrame extends JFrame {

	
	/*
	 * 
	 * Bitte hier nichts verändern !
	 * Es sei denn du weißt was du tust!
	 * 
	 */

	
	private static final long serialVersionUID = 1L;
	private static final String DEGREE  = " \u00b0C";
	private DefaultListModel<String> listModel = new DefaultListModel<>();
	private JLabel tempField = new JLabel(" 0 " + DEGREE);
	private JLabel wetherField = new JLabel(" no wether data ");
	private JLabel timeField = new JLabel("00:00:00");
	
	public NewsFrame() {

		setLayout(new BorderLayout());
		timeField.setBackground(Color.GREEN);
		add(timeField, BorderLayout.NORTH);
		timeField.setHorizontalAlignment(JTextField.CENTER);

		JPanel tempPanel = new JPanel();
		tempPanel.setLayout(new GridLayout(2, 1));
		tempPanel.add(wetherField);
		tempPanel.add(tempField);
		tempPanel.setBackground(Color.GREEN);
		wetherField.setBackground(Color.GREEN);
		tempField.setBackground(Color.GREEN);
		
		add(tempPanel, BorderLayout.EAST);
		
		JList<String> messages = new JList<>(listModel);
		JScrollPane scrollPane = new JScrollPane(messages);
		add(scrollPane, BorderLayout.CENTER);
		
		getContentPane().setBackground(Color.GREEN);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(false);
		
	}
	

	public void setTemperature(String temperature) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				tempField.setText(temperature + DEGREE);
				setVisible(true);
	
			}
		});
	}

	public void setTime(String time) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				timeField.setText(time);
				repaint();

			}
		});
	}

	public void setWetherDescription(String description) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				wetherField.setText(description);
				setVisible(true);
			}
		});
	}
	
	public void setMessages(String[] messages) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				listModel.removeAllElements();
				for(String message : messages) {
					if(message != null || message != "") {
						listModel.addElement(message);				
					}
				}
				
				setVisible(true);
				
			}
		});
	}




}
