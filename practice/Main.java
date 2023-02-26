package practice;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("初めてのSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);

		frame.setLayout(new FlowLayout());
		JLabel label = new JLabel("Hello World!!");
		frame.add(label);
		JButton button = new JButton("押してね");
		frame.add(button);

		frame.setVisible(true);
		System.out.println("フレームを表示");
	}
}
