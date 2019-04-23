package org.wyzc.control;

import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JOptionPane;

import org.wyzc.entity.Food;
import org.wyzc.entity.Ground;
import org.wyzc.entity.Snack;
import org.wyzc.listener.SnackListenner;
import org.wyzc.util.Global;
import org.wyzc.view.GamePanel;

public class Controller extends KeyAdapter implements SnackListenner{
	private Snack snack;
	private Food food;
	private Ground ground;
	private GamePanel gamePanel;
	public Controller(Snack snack, Food food, Ground ground, GamePanel gamePanel) {
		super();
		this.snack = snack;
		this.food = food;
		this.ground = ground;
		this.gamePanel = gamePanel;
	}
	/*public Controller() {
		
	}*/
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//super.keyPressed(e);
		int keycode = e.getKeyCode();
		switch(keycode) {
		case KeyEvent.VK_UP:
			snack.changDirection(Snack.UP);
			break;
		case KeyEvent.VK_DOWN:
			snack.changDirection(Snack.DOWN);
			break;
		case KeyEvent.VK_LEFT:
			snack.changDirection(Snack.LEFT);
			break;
		case KeyEvent.VK_RIGHT:
			snack.changDirection(Snack.RIGHT);
			break;
		}
		
	}
	@Override
	public void snakeMoved(Snack snack) {
		// TODO Auto-generated method stub
		System.out.println("judge snack if contact itself, food, ground");
		if(this.food.isEatBySnack(snack)) {
			snack.eatFood(food);
			food.addFood(ground.getPoint());
		}
		if(ground.isEatBySnack(snack)) {
			snack.setLife(false);
			JOptionPane.showConfirmDialog(null, "Game Over");		
			System.exit(0);
		}
		if(snack.isEatSelf()) {
			snack.setLife(false);
			JOptionPane.showConfirmDialog(null, "Game Over");		
			System.exit(0);
		}
		
		
		gamePanel.disPlay(snack, food, ground);
		
	}
	public void startGame() {
		snack.start();
		food.addFood(ground.getPoint());
	}
	
	
	
	
}
