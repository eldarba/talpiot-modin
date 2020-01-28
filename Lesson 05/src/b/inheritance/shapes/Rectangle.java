package b.inheritance.shapes;

public class Rectangle extends Shape {
	
	private double length;
	private double width;
	
	public double getArea(){
		return length * width;
	}
	
	// using the getLength method we get the length value
	public double getLength() {
		return length;
	}
	
	// using the setLength method we set (change) the length value
	public void setLength(double length) {
		if(length >= 0) {
			this.length = length;
		}
		
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if(width >= 0) {
			this.width = width;
		}
	}

	
	

}
