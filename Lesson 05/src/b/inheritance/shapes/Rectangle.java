package b.inheritance.shapes;

public class Rectangle extends Shape {
	
	double length;
	double width;
	
	double getArea(){
		return length * width;
	}

}
