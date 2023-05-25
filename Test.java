package exer2;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		
	// TODO Auto-generated method stub
		Student s1 = new Student();
		while(true) {
			System.out.println("请输入你的姓名：");
			Scanner scan = new Scanner(System.in);
			s1.name = scan.next();
			break;
		}
		while(true) {
			System.out.println("请输入你的性别：（0代表女性1代表男性）");
			Scanner scan = new Scanner(System.in);
			
			s1.sex = scan.next().charAt(0);
			break;
		}
		while(true) {
			System.out.println("请输入你的学号：");
			Scanner scan = new Scanner(System.in);
			s1.number= scan.nextInt();
			break;
		}
		while(true) {
			System.out.println("请输入你的数学成绩：");
			Scanner scan = new Scanner(System.in);
			s1.math = scan.nextInt();
			break;
		}
		while(true) {
			System.out.println("请输入你的英语成绩：");
			Scanner scan = new Scanner(System.in);
			s1.english = scan.nextInt();
			break;
		}
		while(true) {
			System.out.println("请输入你的计算机成绩：");
			Scanner scan = new Scanner(System.in);
			s1.computer= scan.nextInt();
			break;
		}
			
			Student s = new Student(s1.name,s1.sex,s1.number,s1.math,s1.english,s1.computer);
			s.aver();
			s.max();
			s.min();
			String str1 = s.toString();
			System.out.println(str1);
			
	}
	
}

