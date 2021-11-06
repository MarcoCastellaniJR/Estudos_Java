package entities;
// estudo para teste obj 05

public class Products {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueinStock() {
		return price * quantity;
	}
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+ ", " + price
				+ ", " + quantity
				+ " units, Total R$:"
				+ totalValueinStock();
				
	}
}
