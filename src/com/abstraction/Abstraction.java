package com.abstraction;

abstract class Animal
{
	abstract public void makeSound();
}

class Dog extends Animal
{
	public void makeSound()
	{
		System.out.println("Bow");
	}
}

class Cat extends Animal
{
	public void makeSound()
	{
		System.out.println("Meow");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		Cat c = new Cat();
		d.makeSound();
		c.makeSound();

	}

}
