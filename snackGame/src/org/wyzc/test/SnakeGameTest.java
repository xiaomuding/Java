package org.wyzc.test;

import javax.swing.JFrame;

import org.wyzc.control.Controller;
import org.wyzc.entity.Food;
import org.wyzc.entity.Ground;
import org.wyzc.entity.Snack;
import org.wyzc.util.Global;
import org.wyzc.view.GamePanel;

public class SnakeGameTest {
	public static void main(String[] args) {
		Snack snack = new Snack();
		Food food = new Food();
		Ground ground = new Ground();
		
		GamePanel gamePanel = new GamePanel();
		Controller c = new Controller(snack, food, ground, gamePanel);
		//Controller controller = new Controller();
		snack.addSnackListenner(c);
		gamePanel.addKeyListener(c);
		JFrame frame = new JFrame("snack 1.0");
		frame.setSize(Global.CELL_SIZE * Global.WIDTH+100, Global.CELL_SIZE * Global.HEIGHT+100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		gamePanel.setFocusable(true);
		frame.add(gamePanel);
		
		c.startGame();
		frame.setVisible(true);
		
		
	}
}
