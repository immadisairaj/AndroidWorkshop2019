public class Fruit {

	private String shape;
	private String color;
	private String name;

	public Fruit () {
		// Default
	}

	public Fruit(String fruitShape, String color, String name) {
		shape = fruitShape;
		this.color = color;
		this.name = name;
	}
	
	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getShape() {
		return shape;
	}

	@Override
	public String toString() {
		return shape + " " + color + " " + name; 
	}
}