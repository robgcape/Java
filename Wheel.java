/* Written By Grant Capers
 * 
 */
package BikeBuilder;

public class Wheel {
	//Adding variables, diameter, width
	private double diameter;
	private double width;
	
	//Need default constructor and values
	public Wheel() {
		this.diameter = 16;
		this.width = 1;
	}
	
	//Have to add parameterized constructor
	public Wheel(double diameter, double width) {
		setDiameter(diameter);
		setWidth(width);
	}
	
	//Need Accessors and the Mutators
	public double getDiameter() {
		return diameter;
	}
	
	public void setDiameter(double diameter) {
		if (diameter >= 16 && diameter <= 55) {
			this.diameter = 16;
		}
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if (width >= 1 && width <= 2.5) {
			this.width = width;
		} else {
			this.width = 1;
		}
	}
	//Must apply Equals
	public boolean equals(Wheel other) {
		return this.diameter == other.diameter && this.width == other.width;
	}
	//string
	public String toString() {
		return "[Wheel] Diameter: " + this.diameter + " Width: " + this.width;
	}

}
