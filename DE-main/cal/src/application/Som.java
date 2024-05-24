package application;

public class Som {
	public Som() {
		// TODO Auto-generated constructor stub
	}
	public Som(Integer id, Integer cost, String discription) {
		super();
		this.id = id;
		this.cost = cost;
		this.discription = discription;
	}
	@Override
	public String toString() {
		return "Идентификатор: " + id + ", Цена: " + cost + ", Описание: " + discription;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	Integer id;
	Integer cost;
	String discription;
}
