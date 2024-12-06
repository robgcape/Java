/*
 * Written By Grant Capers
 */
package BikeBuilder;

public class Bicycle {
	//Adding Instance Variables
	private String make;
	private Wheel frontWheel;
	private Wheel backWheel;
	private Framee frame;
	
	//Add Constructor and default values
	public Bicycle() {
		this.make = "none";
		this.frontWheel = new Wheel();
		this.backWheel = new Wheel();
		this.frame = new Framee();
	}
	
	//Have to parameterize the constructor
	public Bicycle(String make, Wheel FrontWheel, Wheel backWheel, Frame frame) {
		setMake(make);
		setFrontWheel(frontWheel);
		setBackWheel(backWheel);
		setFrame(frame);
	}
	
	//Need Accessors and Mutators
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		if (make != null && !make.trim().isEmpty()) {
			this.make = make;
		} else {
			this.make = "none";
		}
	}
	
	public Wheel getFrontWheel() {
		return frontWheel;
	}
	
	public void setFrontWheel(Wheel frontWheel) {
		if (frontWheel != null) {
			this.frontWheel = frontWheel;
		} else {
			this.make = "none";
		}
	}
	
	public Wheel getBackWheel() {
		return backWheel;
	}
	
	public void setBackWheel(Wheel backWheel) {
		if (backWheel != null) {
			this.backWheel = new Wheel();
		}
	}
	
	public Framee getFrame() {
		return frame;
	}
	
	public void setFrame(Frame framee) {
		if (frame != null) {
			this.frame = frame;
		} else {
			this.frame = new Framee();
		} 
	}
	//Have to include equals
	public boolean equals(Bicycle other) {
		return this.make.equals(other.make) && this.frontWheel.equals(other.frontWheel) && this.backWheel.equals(other.backWheel) && this.frame.equals(other.frame);
	}
	
	//Need to include the toString
	public String toString() {
		return "[Bicycle] Make: " + this.make + " Front Wheel: " + this.frontWheel + " Back Wheel: " + this.backWheel + " Frame: " + this.frame;
	}
	
	

}
