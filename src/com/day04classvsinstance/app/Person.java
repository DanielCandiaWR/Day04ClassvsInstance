package com.day04classvsinstance.app;
import java.util.Scanner;
/*
* HackerRank 30 Days of Code
* ========== Day 04 Class vs. Instance ===========
* Write a Person class with an instance variable, age, and a constructor that takes an integer, initialAge, as a parameter.
* The constructor must assign initialAge to age after confirming the argument passed as initialAge is not negative; if a negative
* argument is passed as initialAge, the constructor should set age to 0 and print Age is not valid, setting age to 0...
* In addition, you must write the following instance methods:
* 	1. yearPasses() should increase the age instance variable by 1.
* 	2. amIOld() should perform the following conditional actions:
* 		- if age < 13, print You are young..
* 		- if age >= 13 and age < 18, print You are a teenager..
* 		- Otherwise, print You are old..
*/
public class Person {
	
	private int age;
	
	public Person(int initialAge) {
		if(initialAge<0)
			System.out.println("Age is not valid, setting age to 0.");
		else
			this.age = initialAge;
	}
	
	public String amIOld() {
		String message = "";
		message = (this.age<13)?"You are young.":(this.age>=13 && this.age<18)?"You are a teenager":"You are old";
		return message;
	}
	
	public void yearPasses() {
		this.age += 1;
	}
	
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Input how many loops: ");
		int loops = scanner.nextInt();
		for(int i=0;i<loops;i++) {
			System.out.print("\nInput your age: ");
			int age = scanner.nextInt();
			Person person = new Person(age);
			System.out.println(person.amIOld());
			for(int j=0;j<3;j++) {
				person.yearPasses();
			}
			System.out.println(person.amIOld());
			System.out.println();
		}
		scanner.close();
	}

}
