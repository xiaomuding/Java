package org.wyzc.entity;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import org.wyzc.util.Global;

public class Food extends Point{
	public void drawMe(Graphics g) {
		System.out.println("food is drawing itself");
		g.setColor(Color.RED);
		g.fill3DRect(x*Global.CELL_SIZE, y*Global.CELL_SIZE, Global.CELL_SIZE, Global.CELL_SIZE, true);
		
	}
	public boolean isEatBySnack(Snack snack) {
		Point header = snack.getHeader();
		if (this.equals(header)) {
			return true;
		}
				
		return false;
	}
	public void addFood(Point p) {
		this.x = p.x;
		this.y = p.y;
	}
}
