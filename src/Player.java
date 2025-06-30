import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player extends Character implements KeyListener {
	public Player(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void draw(MyFrame f) {
		f.setColor(0, 128, 0);
		f.fillRect(x, y+20, 30, 10);
		f.setColor(200, 200, 200);
		f.fillRect(x+10,y,10,30);
	}

	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_D) {
			vx=0;
		}
		if(e.getKeyCode()==KeyEvent.VK_A) {
			vx=0;
		}
	}
	public void keyTyped(KeyEvent e) {
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ

		if(e.getKeyCode()==KeyEvent.VK_A) {
			vx=-5;
		}
		if(e.getKeyCode()==KeyEvent.VK_D) {
			vx=5;
		}
		if(e.getKeyCode()==KeyEvent.VK_Q) {
			GameWorld.playerBullets.add(new PlayerBullet(x,y,0-10,-30));
			System.out.println("弾の数="+GameWorld.playerBullets.size());	
		}
		if(e.getKeyCode()==KeyEvent.VK_E) {
			GameWorld.playerBullets.add(new PlayerBullet(x,y,0+10,-30));
			System.out.println("弾の数="+GameWorld.playerBullets.size());	
		}
		if(e.getKeyCode()==KeyEvent.VK_W) {
			GameWorld.playerBullets.add(new PlayerBullet(x,y,0,-30));
			System.out.println("弾の数="+GameWorld.playerBullets.size());
		}
		if(e.getKeyCode()==KeyEvent.VK_S) {
			GameWorld.playerBullets.add(new PlayerBullet(x+5,y,0,-80));
			System.out.println("弾の数="+GameWorld.playerBullets.size());
		}
		if(e.getKeyCode()==KeyEvent.VK_S) {
			GameWorld.playerBullets.add(new PlayerBullet(x+20,y,0,-80));
			System.out.println("弾の数="+GameWorld.playerBullets.size());
		}
		if(e.getKeyCode()==KeyEvent.VK_S) {
			GameWorld.playerBullets.add(new PlayerBullet(x,y,0-10,-80));
			System.out.println("弾の数="+GameWorld.playerBullets.size());
		}
		if(e.getKeyCode()==KeyEvent.VK_S) {
			GameWorld.playerBullets.add(new PlayerBullet(x+25,y,0+10,-80));
			System.out.println("弾の数="+GameWorld.playerBullets.size());
		}
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			System.out.println("ENTERキーが押されました");
			GameWorld.enterPressed=true;
		}
	}
	public void move() {
		super.move();
		if(x<0) x=0;
		if(x>370) x=370;
	}

}
