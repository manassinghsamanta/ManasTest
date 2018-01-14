class Demo4{
	private String name;
	private int age;
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}
class AccesserAndMutator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo4 d = new Demo4();
		d.setName("Manas");
		d.setAge(29);
		String name = d.getName();
		System.out.println("name is: "+name);
		int age = d.getAge();
		System.out.println("age is: "+ age );
	}

}
