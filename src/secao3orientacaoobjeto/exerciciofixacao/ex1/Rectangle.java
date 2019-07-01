package secao3orientacaoobjeto.exerciciofixacao.ex1;

public class Rectangle {
	
	private double width;
	private double height;
	
	
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return width*height;
	}
	
	public double getPerimeter(){
		return 2*(width+height);
	}
	
	public double getDiagonal() {	
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	public String getInfo() {
		return "Area: " + getArea() + "\nPerimeter: " + getPerimeter() + "\nDiagonal: " + getDiagonal() + "\n\n";
	}

}
