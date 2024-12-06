/*
 * Written By Grant Capers
 */
package Apple;

public class Applee {
	private String type;
	private double weight;
	private double price;
	
	//need to create the constructor
	public Applee() {
		type = "Gala";
		weight = 0.5;
		price = 0.89;
	}
	
	//have to paramatertized the constructor
	public Applee(String type, double weight, double price) {
		setType(type);
		setWeight(weight);
		setPrice(price);
	}
	
	//create the acessors
	public String getType() {
		return type;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setType(String type) {
		if (isValidType(type)) {
			this.type = type;
		} else {
			System.out.println("Invalid Name");
			//Will set it back to default value if name is invalid
			this.type = "Gala";
		}
	}
	public void setWeight(double weight) {
		if (isValidWeight(weight)) {
			this.weight = weight;
		} else {
			System.out.println("Invalid Weight");
			//repeat/sets back to default
			this.weight = 0.5;
		}
	}
	
	public void setPrice(double price) {
		if (isValidPrice(price)) {
			this.price = price;
		} else {
			System.out.println("Invalid Price");
			this.price = 0.89;
		}
	}
	
	public boolean equals(Applee otherApplee) {
		return this.type.equals(otherApplee.getType()) && 
				this.weight == otherApplee.getWeight() &&
				this.price == otherApplee.getPrice();
	}
	//have to add string
	public String toString() {
		return "Name: " + type + " Weight: " + weight + " Price: " + price;
	}
	//Have to add validations
	private boolean isValidType(String type) {
		return type.equals("Red Delicious") || type.equals("Golden Delicious") ||
				type.equals("Gala") || type.equals("Granny Smith");
	}
	
	private boolean isValidWeight(double weight) {
		return weight >= 0 && weight <= 2;
	}
	
	private boolean isValidPrice(double price) {
		return price >= 0;
	}

}


