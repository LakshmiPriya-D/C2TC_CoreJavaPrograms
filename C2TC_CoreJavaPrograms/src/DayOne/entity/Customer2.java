package DayOne.entity;

public class Customer2 {
	private int cid;
	private String name;
	private String city;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer2 [cid=" + cid + ", name=" + name + ", city=" + city + "]";
	}
	

}
