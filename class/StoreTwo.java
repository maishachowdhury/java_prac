public class StoreTwo {
  // instance fields
  String productType;
  // The state tells us what a savings account should know:

  // constructor method
  public StoreTwo(String product) {
    productType = product;
  }
  
// The behavior tells us what tasks a savings account should be able to perform:
// Depositing - increasing the amount available
// Withdrawing - decreasing the amount available
// Checking the balance - displaying the amount available.

// Methods are repeatable, modular blocks of code used to accomplish specific tasks.
// We have the ability to define our own methods that will take input, do something 
// with it, and return the kind of output we want.

// How can one program tackle such a large problem? This is where methods and
// their ability to accomplish smaller, specific tasks comes in handy. 
// Through method decomposition, we can use methods to break down a large problem 
// into smaller, more manageable problems.

// advertise method
  
  // main method
  public static void main(String[] args) {
    
  }
}

// example bank account

/*
public void checkBalance(){
  System.out.println("Hello!");
  System.out.println("Your balance is " + balance);
}
*/ 

/*
The first line, public void checkBalance(), is the method declaration. 
It gives the program some information about the method:

public means that other classes can access this method. 
We will learn more about that later in the course.
The void keyword means that there is no specific output 
from the method. We will see methods that are not void later in this lesson, 
but for now, all of our methods will be void.
checkBalance() is the name of the method.

*/ 

/*
Every method has its own unique method signature which is
comprised of the method’s name and its parameter type. In this example,
 the method signature is checkBalance()

 The two print statements are inside the body of the method, which is defined 
 by the curly braces: { and }.

Anything we can do in our main() method, we can do in other methods!
 All of the Java tools you know, like the math and comparison operators, 
 can be used to make interesting and useful methods.


*/ 