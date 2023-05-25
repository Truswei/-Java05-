package exer2;

public class Student extends Person {
	long number;
	int math;
	int english;
	int computer;

	public Student() {
		

	}

	public Student(String n, char s, long number,int  math , int english, int computer) {
		
		
		this.name = n;
		this.sex = s;
		
		this.number = number;
		this.math = math;
		this.english = english;
		this.computer = computer;

	}

	public double aver() {
		double aver;
		aver = (math + english + computer) / 2;
		return aver;

	}

	public int max() {
		int max1, max;
		max1 = (math > english) ? math : english;
		max = (max1 > computer) ? max1 : computer;
		return max;
	}

	public int min() {
		int min1, min;
		min1 = (math > english) ? english : math;
		min = (min1 > computer) ? min1 : computer;
		return min;

	}

	public String toString() {
		String str;
	
		
		str = "姓名: " + name + "\n性别: " + sex  + "\n学号：" + number+"\nMath:"+math+"\nEnglishi"+english+"\nComputer"+computer;
		return str;
	}

}
