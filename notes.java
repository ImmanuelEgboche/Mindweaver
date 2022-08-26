package com.org.phase1;
/*Functional Interface is additionally recognized as Single Abstract Method Interfaces. In short, 
 * they are also known as SAM interfaces. 
 * 
 * Functional interfaces are interfaces that ensure that they include precisely only one abstract method. Functional interfaces are 
 * used and executed by representing the interface with an annotation called @FunctionalInterface.
 * 
 * @FunctionalInterface annotation is used to ensure that the functional interface can’t have more than one abstract method. In case more than one abstract methods are present, 
 * the compiler flags an ‘Unexpected @FunctionalInterface annotation’ message.
 * Here are some significant points regarding Functional interfaces in Java:
In 1)functional interfaces, there is only one abstract method supported. If the annotation of a functional interface, i.e.,
 @FunctionalInterface is not implemented or written with a function interface, more than one abstract method can be declare
from Nishi Verma to All Attendees:
In 1)functional interfaces, there is only one abstract method supported. If the annotation of a functional interface, i.e.,
 @FunctionalInterface is not implemented or written with a function interface, more than one abstract method can be declared inside it. However, in this situation with more than one functional interface, that interface will not be called a functional interface. It is called a non-functional interface.
2)There is no such need for the @FunctionalInterface annotation as it is voluntary only. This is written because it helps in 
checking the compiler level. Besides this, it is optional.
3)An infinite number of methods (whether static or default) can be added to the functional interface. In simple words, there is
 no limit to a functional interface containing static and default methods.
4)Overriding methods from the parent class do not violate the rules of a functional interface in Java.
static method- Interfaces can also have methods that can have definitions
from Nishi Verma to All Attendees:
static method- Interfaces can also have methods that can have definitions. These are the static methods in the interface.
 The static methods are defined inside the interface and they cannot be overridden or changed by the classes that implement 
 this interface.
 
 default method -The default methods in a way provide backward compatibility to the existing interfaces and we need not alter 
 the implementation class. The default methods are also known as “virtual extension method” or “defender methods”.
Default methods are declared by using the keyword “default” in the declaration. The declaration is followed by the definition 
of the method. We can override the default method as it is available to the class that implements the interface.
*/
@FunctionalInterface
public interface Java8Interface {
//one single abstract method 
	public void cubeNumber(int num);
	
	//default method 
	default void print() {
		System.out.println(" This is java 8 default method in interface")
    }
@FunctionalInterface
public interface Java8Interface {
//one single abstract method 
	public void cubeNumber(int num);
	
	//default method 
	default void print() {
		System.out.println(" This is java 8 default method in interface ....");
	}
	
	static void static_print() {
		System.out.println("This is java 8 static method in interface .....");
	}
}
@FunctionalInterface
public interface Java8Interface {
//one single abstract method 
	public void cubeNumber(int num);
	
	//default method 
	default void print() {
		System.out.println(" This is java 8 default method in interface ....");
	}
	
	static void static_print() {
		System.out.println("This is java 8 static method in interface .....");
	}
}
