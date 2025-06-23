
public class RandomEnemy extends Enemy {
	int life=2;
	public RandomEnemy(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
	}

	public void move() {
		super.move();
		vx = Math.random() * 4 - 2;
	}

	public void draw(MyFrame f) {
		f.setColor(57, 16, 123);
		//f.fillOval(x, y, 32, 32);
		f.fillRect(x - 28, y + 30, 30, 30);
		f.fillRect(x, y, 5, 30);
		f.fillRect(x - 29, y, 5, 30);
	}
}
