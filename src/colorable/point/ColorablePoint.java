package colorable.point;

public class ColorablePoint extends Point{
	private Color color;
	public ColorablePoint(int x, int y, Color color){
		super(x,y);
		this.color=color;
	}
	public String toString() {
		return "ColorablePoint [color=" + color + "]";
	}
	

}
