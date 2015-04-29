package goods;

public class Goods {
	
	private String name; //캡슐화
	private int price;
	private int countStock;
	private int countSold;
	
	public Goods(String name, int price, int countStock, int countSold){
		this.name=name;
		this.price=price;
		this.countStock=countStock;
		this.countSold=countSold;
	}
	public Goods() {	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
}

