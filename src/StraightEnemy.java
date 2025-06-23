
public class StraightEnemy extends Enemy {
	int life=5;
	public StraightEnemy(double x,double y,double vx,double vy) {
		super(x,y,vx,vy);
	}
	public void draw(MyFrame f) {
		f.setColor(0, 18, 154);
		//f.fillOval(x, y, 32, 32);
		f.fillRect(x+2, y+2, 20, 20);
		f.fillRect(x+7, y+2, 10, 40);
}
}
