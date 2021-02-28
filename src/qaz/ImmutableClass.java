package qaz;

public final class ImmutableClass {
	private String name;
	private String address;
	private int age;
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int getAge() {
		return age;
	}
	public ImmutableClass(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
}
