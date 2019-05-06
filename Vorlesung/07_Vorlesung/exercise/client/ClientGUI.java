package exercise.client;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.Scrollable;
import javax.swing.SwingUtilities;
import javax.swing.plaf.synth.SynthSpinnerUI;

public class ClientGUI extends JFrame{

	/*
	 * Finger weg von dieser Klasse, es sei denn du weiﬂt was du tust ;)
	 */

	private JTextField textField = new JTextField();
	private DefaultListModel<String> model = new DefaultListModel<>();
	
	
	public ClientGUI() {

		setLayout(new BorderLayout());
		
		add(textField, BorderLayout.SOUTH);
		
		JList<String> list = new JList<>(model);
		JScrollPane scrollPane = new JScrollPane(list);
		add(scrollPane, BorderLayout.CENTER);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 500);
		setVisible(true);
	}
	
	public void setListener(ActionListener l) {
		textField.addActionListener(l);
	}
	
	public synchronized void addMessage(String message) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				model.addElement(message);
				
				setVisible(true);
			}
		});
	}
	
	public String getUserInput() {
		return textField.getText();
	}

	public void clearField() {
		textField.setText("");
		
	}
	
	public void setName(String name) {
		setTitle(name);
	}
}
