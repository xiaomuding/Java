package org.wyzc.view;

import java.awt.Graphics;

import javax.swing.JPanel;

import org.wyzc.entity.Food;
import org.wyzc.entity.Ground;
import org.wyzc.entity.Snack;

public class GamePanel extends JPanel{
	private Snack snack;
	private Food food;
	private Ground ground;
	public void disPlay(Snack snack,Food food,Ground ground) {
		this.snack = snack;
		this.food = food;
		this.ground = ground;
		System.out.println("Panel is displaying");
		repaint();
		/*if(snack != null && food != null && ground != null) {
		snack.drawMe();
		food.drawMe();
		ground.drawMe();
		}*/
	}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			if(snack != null && food != null && ground != null) {
				snack.drawMe(g);
				food.drawMe(g);
				ground.drawMe(g);
				}
		}
	
	
	
	
	
	}
	
