package exer2;

public class Person {
	 String name;
	 char sex;
	 int  age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person() {

	}

	public Person(String name, char sex, int age) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String toString(String name) {
		this.name = name;
		return name;
	}

	

}
