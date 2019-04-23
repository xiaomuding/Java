package org.wyzc.entity;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.LinkedList;

import org.wyzc.listener.SnackListenner;
import org.wyzc.util.Global;

public class Snack {
	
	private SnackListenner snackListenner ;
	private boolean life = true;
	private LinkedList<Point> body = new LinkedList<Point>();
	public static final int UP = 1;
	public static final int DOWN = -1;
	public static final int LEFT = 3;
	public static final int RIGHT = -3;
	//private int direction ;
	private int oldDirection, newDirection;
	private Point tail;
	
	public Snack() {
		init();
	}
	private void init() {
		int x = Global.WIDTH/2;
		int y = Global.HEIGHT/2;
		for(int i =0; i<3;i++) {
			body.add(new Point(x-i,y));
		}
		this.oldDirection= this.newDirection = RIGHT;
	}
	
	public void addSnackListenner(SnackListenner snackListenner) {
		if(snackListenner != null) {
			this.snackListenner = snackListenner;
		}
	}
	public void move() {
		System.out.println("snack is moving");
		tail = body.removeLast();
		int x = body.getFirst().x;
		int y = body.getFirst().y;
		if(this.oldDirection + this.newDirection != 0 )
			this.oldDirection = this.newDirection;
		switch(oldDirection) {
		case UP:
			y--;
			if(y<0) {
				y = Global.HEIGHT-1;
			}
			break;
		case DOWN:
			y++;
			if(y == Global.HEIGHT-1) y=0;
			break;
		case LEFT:
			x--;
			if(x == 0) x=Global.WIDTH-1;
			break;
		case RIGHT:
			x++;
			if(x == Global.WIDTH-1) x = 0;
			break;
		}
		body.addFirst(new Point(x,y));
		
	}
	public void eatFood(Food food) {
		System.out.println("snack is eating food");
		body.addLast(tail);
	}
	public Point getHeader() {
		return body.getFirst();
	}
	public void setLife(boolean life) {
		this.life = life;
	}
	public void changDirection( int direction) {
		/*if(this.oldDirection + direction != 0) {
			System.out.println("snack is changing direction");
			this.oldDirection = direction; 
		}*/
		System.out.println("snack is changing direction");
		this.newDirection = direction;
		
	}
	public void drawMe(Graphics g) {
		System.out.println("snack is drawing itself");
		for(Point p : body) {
			g.setColor(Color.blue);
			g.fill3DRect(p.x*Global.CELL_SIZE, p.y*Global.CELL_SIZE, Global.CELL_SIZE, Global.CELL_SIZE, true);
		}
		
	}
	public boolean isEatSelf() {
		for(int i = 1;i< body.size();i++) {
			if(body.get(i).equals(this.getHeader())) {
				return true;
			}
		}
		return false;
	}
	
	public void start() {
		new SnackDriver().start();
	}
	private class SnackDriver extends Thread {

		@Override
		public void run() {
			while(life) {
				move();
				snackListenner.snakeMoved(Snack.this);
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	
	
	
	
	
}
