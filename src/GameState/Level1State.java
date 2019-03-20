package GameState;



import TileMap.*;
import Entity.*;

import java.awt.Color;
import java.awt.Graphics2D;


public class Level1State extends GameState
{
	
	private TileMap tileMap;
	private Background bg;
	private Player player;
	
	
	public Level1State(GameStateManager gsm)
	{
		this.gsm = gsm;
		init();
	}
	
	public void init()
	{
		tileMap = new TileMap(30);
		tileMap.loadTiles("/TileSets/grasstileset.gif");
		tileMap.loadMap("/Maps/level1-1.map");
		tileMap.setPostion(0,0);
		bg = new Background ("/Backgrounds/grassbg1.gif", 0.1);
		player = new Player (tileMap);
	}
	
	public void update()
	{
		player.update();
	}
	
	public void draw (Graphics2D g)
	{
		//draw tilemap
		bg.draw(g);
		
		//draw player
		player.draw(g);
		
		tileMap.draw(g);
	}
	
	public void keyPressed (int k)
	{
		
	}
	
	public void keyReleased (int k)
	{
		
	}
}













