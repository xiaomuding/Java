package org.wyzc.entity;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

import org.wyzc.util.Global;

public class Ground {
	private int[][] rocks = new int[Global.WIDTH][Global.HEIGHT];
	public Ground() {
		for(int y =0;y<Global.HEIGHT;y++) {
			for(int x = 0;x < Global.WIDTH;x++) {
				if(y==0 || y == Global.HEIGHT-1 || x==0 ||x == Global.WIDTH-1) {
					rocks[x][y] = 1;
				}
			}
		}
			
	}
	public void drawMe( Graphics g) {
		
		System.out.println("groud is drawing it self");
		for(int y =0;y<Global.HEIGHT;y++) {
			for(int x = 0;x < Global.WIDTH;x++) {
				if(rocks[x][y] == 1) {
					g.setColor(Color.YELLOW);
					g.fill3DRect(x*Global.CELL_SIZE, y*Global.CELL_SIZE, Global.WIDTH, Global.HEIGHT, true);
				}
			}
		}
		
	}
	public boolean isEatBySnack(Snack snack) {
		Point head = snack.getHeader();
		for(int x = 0;x < Global.WIDTH; x++) {
			for(int y = 0; y < Global.HEIGHT; y++) {
				if(rocks[x][y] == 1 && head.x == x && head.y == y) {
					return true;
				}
			}
		}
		
		return false;
	}
	public Point getPoint() {
		int x,y;
		do{
			 x = new Random().nextInt(Global.WIDTH);
			 y = new Random().nextInt(Global.HEIGHT);
			 return new Point(x,y);
		}while(rocks[x][x] == 1);

	}
}




