package me.alexandmike.com;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Main extends JFrame {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		Main game = new Main();
		JFrame frame = new JFrame("Alex and Michael's Game");

		frame.setMaximumSize(new Dimension(800, 600));
		frame.setPreferredSize(new Dimension(800, 600));
		frame.setMinimumSize(new Dimension(800, 600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.pack();
		game.add(game);
		
	}

}
