package collection;

public class Pen {
	private String brand;
	private int price;
	private boolean isBluepen;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isBluepen() {
		return isBluepen;
	}
	public void setBluepen(boolean isBluepen) {
		this.isBluepen = isBluepen;
	}
	public Pen(String brand, int price, boolean isBluepen) {
		super();
		this.brand = brand;
		this.price = price;
		this.isBluepen = isBluepen;
	}
	@Override
	public String toString() {
		return "Pen [brand=" + brand + ", price=" + price + ", isBluepen=" + isBluepen + "]";
	}
	

}
