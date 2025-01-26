package MPP_Labs.Lab5.task1.code;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	AddrWindow addressWindow = new AddrWindow();
	ProfileWindow profileWindow = new ProfileWindow();
	public MainFrame() {
		JPanel mainPanel = new JPanel();
		JButton addrButton = new JButton("Go to Address Window");
		addrButton.addActionListener(new AddressWindowListener());
		JButton profileButton = new JButton("Go to Profile Window");
		profileButton.addActionListener(new ProfileWindowListener());
		mainPanel.add(addrButton);
		mainPanel.add(profileButton);
		getContentPane().add(mainPanel);
		pack();
		
	}
	
	class AddressWindowListener implements ActionListener {
		public void actionPerformed(ActionEvent evt){
			addressWindow.setVisible(true);
			profileWindow.setVisible(false);
		}
	}
	class ProfileWindowListener implements ActionListener {
		public void actionPerformed(ActionEvent evt){
			addressWindow.setVisible(false);
			profileWindow.setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		(new MainFrame()).setVisible(true);
	}

}