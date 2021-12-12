package _00_Intro_To_ArrayLists;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	/*
	 * Create a GUI with two buttons. One button reads "Add Name" and the other
	 * button reads "View Names". When the add name button is clicked, display an
	 * input dialog that asks the user to enter a name. Add that name to an
	 * ArrayList. When the "View Names" button is clicked, display a message dialog
	 * that displays all the names added to the list. Format the list as follows:
	 * Guest #1: Bob Banders Guest #2: Sandy Summers Guest #3: Greg Ganders Guest
	 * #4: Donny Doners
	 */

	// framework
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addbutton = new JButton("Add Name");
	JButton viewbutton = new JButton("View Names");
    ArrayList<String> gbook = new ArrayList<String>();

	// main
	public static void main(String[] args) {

		_02_GuestBook gb = new _02_GuestBook();
		gb.setup();

	}

	// set up
	private void setup() {
		frame.add(panel);
		panel.add(addbutton);
		panel.add(viewbutton);

		frame.setVisible(true);
		panel.setVisible(true);
		addbutton.setVisible(true);
		viewbutton.setVisible(true);

		frame.pack();

		addbutton.addActionListener(this);
		viewbutton.addActionListener(this);
	}

	// button pressed
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (addbutton == e.getSource()) {
			gbook.add(JOptionPane.showInputDialog("Please enter a name into the Guestbook:"));
		}
		
		else if (viewbutton == e.getSource()) {
			for (int i = 0; i < gbook.size(); i++) {
				System.out.println("Guest #" + (i+1) + ": " + gbook.get(i));
			}
		}
	}
}
