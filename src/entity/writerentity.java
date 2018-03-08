package entity;

public class writerentity {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public writerentity(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public writerentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
