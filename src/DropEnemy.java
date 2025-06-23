
public class DropEnemy extends Enemy {
	int life=1;
	public DropEnemy(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
	}

	public void move() {
		super.move();
		vy = vy + 0.1;
	}

	public void draw(MyFrame f) {
		f.setColor(126, 132, 247);
		f.fillRect(x + 13, y, 15, 32);
		f.fillRect(x, y, 40, 10);
	}
}
