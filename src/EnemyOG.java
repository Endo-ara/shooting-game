
public class EnemyOG extends Enemy{
	int life=1;
	int score=10;
	public EnemyOG(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
}
	public void move() {
		super.move();
		vy = vy + 0.1;
	}
	
	public void draw(MyFrame f) {
		f.setColor(235, 51, 36);
		f.fillRect(x + 13, y, 15, 32);
		f.setColor(235, 51, 36);
		f.fillRect(x, y, 40, 10);
		f.setColor(235, 51, 36);
		f.fillRect(x, y+25, 40, 10);
	}
}
