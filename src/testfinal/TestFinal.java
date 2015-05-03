package testfinal;

public class TestFinal {
	public static void main(String[] args) {
		final Person p =new Person("ss");
		p.setName("dsad");
		p = new Person("sss");
		System.out.println(p.getName());
	}
}

class Person {
	private String name;
	
	 public Person(String name) {
		 this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}