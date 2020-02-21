package sprites;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import main.Game;

public class Paddle extends JPanel{
	private Game game;
	
	private int x, y, dx = 0, length = 50, height = 20;
	
	public Paddle(Game g) {
		game = g;
		x = (game.getWidth() - length)/2;
		y = (game.getHeight() - (height + 10));
	}
	
	public void paint(Graphics2D g) {
		g.setColor(Color.WHITE);
		g.fillRect(x, y, length, height);
	}
	
	public void move() {
		x += dx;
	}
	
	
	public void press(KeyEvent e) {
		dx = e.getKeyCode() == KeyEvent.VK_A ? -1 : (e.getKeyCode() == KeyEvent.VK_D ? 1 : 0);
	}
	public void release() {
		dx = 0;
	}
}
