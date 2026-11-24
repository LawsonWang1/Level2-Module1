package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton first = new JButton("Add Name");
	JButton second = new JButton("View Names");
	ArrayList<String> list = new ArrayList<String>();
	String nameList = "";
	String nextList = "";
	
	void run() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(first);
		first.addActionListener(this);
		panel.add(second);
		second.addActionListener(this);
		frame.pack();
	}

	public static void main(String[] args) {
		new GuestBook().run();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == first) {
			String name = JOptionPane.showInputDialog("Enter a name");
			list.add(name);
		} else if (arg0.getSource() == second) {
				for(int x = 0; x < list.size(); x++) {
					nextList = nameList + "\nGuest #" + (x+1) + ": " + list.get(x);
					nameList = nextList;
			}
				JOptionPane.showMessageDialog(frame, nextList);
		}
	}
}
