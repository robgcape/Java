/*
 * Written By Grant Capers
 */
package BikeBuilder;

public class Framee {
	//Adding Instance Variables
	private double size;
	private String type;
	
	//Need a default constructor and default value
	public Framee() {
		this.size = 18.5;
		this.type = "Diamond";
	}
//Have to parameterize the constructor
	public Framee(double size, String type) {
		setSize(size);
		setType(type);
	}
	
	//Add accessors and mutators
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		if (size >= 18.5 && size <= 60) {
			this.size = size;
		} else {
			this.size = 18.5;
		}
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		if (type != null && (type.equals("Diamond") || type.equals("Step-Through") || type.equals("Truss") || type.equals("Penny-Farthing"))) {
			this.type = type;
		} else {
			this.type = "Diamond";
		}
	}
	//Need to include Equals
	public boolean equals(Frame other) {
		return this.size == other.getSize() && this.type.equals(other.getType());
	}
	//Add ToString
	public String toString() {
		return "[Frame] Size: " + this.size + " Type: " + this.type;
	}
}
