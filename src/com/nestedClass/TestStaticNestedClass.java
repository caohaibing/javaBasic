package com.nestedClass;

public class TestStaticNestedClass {
	private String name;
	private Home home;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Home getHome() {
		return home;
	}
	public void setHome(Home home) {
		this.home = home;
	}
	
	public static class Home{
		private String address;
		private String tel;
		
		public Home(String address, String tel) {
			this.address = address;
			this.tel = tel;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		
	}
	
	public static void main(String[] args) {
		TestStaticNestedClass testStaticNestedClass = new TestStaticNestedClass();
		testStaticNestedClass.setName("ss");
		testStaticNestedClass.setHome(new Home("es", "15"));
	}
	
}
