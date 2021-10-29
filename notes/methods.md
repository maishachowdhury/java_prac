# Calling Methods

When we add a non-static method to a class, it becomes available to use on an object of that class. In order to have our methods get executed, we must call the method on the object we created.

class BankAccount {
 
  // instance fields
  Double balance;
  
  // constructor method
  public BankAccount(Double checkBalance) {
    balance = checkBalance;
  }
 
  // viewingAccount method non static can use on objects 

  public void viewingAccount() {
    System.out.println("Viewing bank account!");
  }
 
  // main method

  public static void main(String[] args){

    // create instance of BankAccount in main method it is static so not an object method but a class method 

    BankAccount myAccount = new BankAccount(1000);
    // Call a method on an object 
    myAccount.viewingAccount();
    System.out.println("I viewed my account!");
  }
}

So the output this would show is ...
Viewing bank account!
I viewed my account!

# Scope 

A method is a task that an object of a class performs.

We mark the domain of this task using curly braces: {, and }. Everything inside the curly braces is part of the task. This domain is called the scope of a method.

We can’t access variables that are declared inside a method in code that is outside the scope of that method.

class BankAccouny {
  Double balance;
  Double moneyOut;
 
  public BankAccount(Double checkBalance) {
    balance = checkBalance;
    moneyOut = 0;         
  }
 
  public void pay() {
     String message = "Money out: " + moneyOut;
     System.out.println(message);
  }
 
  public static void main(String[] args){
     BankAccount myAccount = new BankAccount(1000);
     myAccount.pay();
  }
}

The variable message, which is declared and initialized inside of pay, cannot be used inside of main()! It only exists within the scope of the pay() method.

However, moneyOut, which is declared at the top of the class, can be used inside all methods in the class, since it is in the scope of the whole class.

# Adding Parameters
We saw how a method’s scope prevents us from using variables declared in one method in another method. What if we had some information in one method that we needed to pass into another method?

Similar to how we added parameters to constructors, we can customize all other methods to accept parameters. For example, in the following code, we create a startRadio() method that accepts a Double parameter, stationNum, and a String parameter called stationName:

class Car {
 
  String color;
 
  public Car(String carColor) {
    color = carColor;         
  }
 
  public void startRadio(double stationNum, String stationName) {
    System.out.println("Turning on the radio to " + stationNum + ", " + stationName + "!");
    System.out.println("Enjoy!");
  }
 
  public static void main(String[] args){
    Car myCar = new Car("red");
    myCar.startRadio(103.7, "Meditation Station");
  }
}

Adding parameter values impacts our method’s signature. Like constructor signatures, the method signature includes the method name as well as the parameter types of the method. The signature of the above method is startRadio(double, String).

In the main() method, we call the startRadio() method on the myCar object and provide a double argument of 103.7 and String argument of "Meditation Station", resulting in the following output:

Turning on the radio to 103.7, Meditation Station!
Enjoy!

Note that when we call on a method with multiple parameters, the arguments given in the call must be placed in the same order as the parameters appear in the signature. If the argument types do not match the parameter types, we’ll receive an error.

Through method overloading, our Java programs can contain multiple methods with the same name as long as each method’s parameter list is unique. For example, we can recreate our above program to contain two startRadio() methods:

// Method 1
public void startRadio(double stationNum, String stationName) {
  System.out.println("Turning on the radio to " + stationNum + ", " + station + "!");
  System.out.println("Enjoy!");
}
 
// Method 2
public void startRadio(double stationNum) {
  System.out.println("Turning on the radio to " + stationNum + "!");
}
 
public static void main(String[] args){
  Car myCar = new Car("red");
  // Calls the first startRadio() method
  myCar.startRadio(103.7, "Meditation Station");
 
  // Calls the second startRadio() method
  myCar.startRadio(98.2);
}
 
# Reassigning Instance Fields

Earlier, we thought about a Savings Account as a type of object we could represent in Java.

Two of the methods we need are depositing and withdrawing:

public class SavingsAccount{
  // instance fields
  double balance;
  // constructor method 
  public SavingsAccount(double startingBalance){
    balance = startingBalance;
  }
  // deposit method 
  public void deposit(double amountToDeposit){
     //Add amountToDeposit to the balance
  }
  // withdraw method 
  public void withdraw(double amountToWithdraw){
     //Subtract amountToWithdraw from the balance
  }
  // main method what actually executes 
  public static void main(String[] args){
 
  }
}

These methods would change the value of the variable balance. We can reassign balance to be a new value by using our assignment operator, =, again.

We first need to create a new variable that will hold the current balance variable because if you try to change balance first to = a new balance variable Java would not understand that it is a new variable. 

public void deposit(double amountToDeposit){
  double updatedBalance = balance + amountToDeposit;
  balance = updatedBalance;
}

Now, when we call deposit(), it should change the value of the instance field balance:

public static void main(String[] args){
  SavingsAccount myAccount = new SavingsAccount(2000);
  System.out.println(myAccount.balance);
  myAccount.deposit(100);
  System.out.println(myAccount.balance);
}

This code first prints 2000, the initial value of myAccount.balance, and then prints 2100, which is the value of myAccount.balance after the deposit() method has run.

Changing instance fields is how we change the state of an object and make our objects more flexible and realistic.

Store example ...  

public class Store {
  // instance fields how an instance of a store is described we can call these on objects and see what's returned. 
  String productType;
  double price;
  
  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){    
     
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
 
 lemonadeStand.increasePrice(1.5);
 System.out.println(lemonadeStand.price);
    
  }
}

# Returns
Remember, variables can only exist in the scope that they were declared in. We can use a value outside of the method it was created in if we return it from the method.

We return a value by using the keyword return:

public int numberOfTires() {
   int tires = 4;
   // return statement
   return tires;
}

This method, called numberOfTires(), returns 4. Once the return statement is executed, the compiler exits the function. Any code that exists after the return statement in a function is ignored.

In past exercises, when creating new methods, we used the keyword void. Here, we are replacing void with int, to signify that the return type is an int.

The void keyword (which means “completely empty”) indicates that no value is returned after calling that method.

A non-void method, like numberOfTires() returns a value when it is called. We can use datatype keywords (such as int, char, etc.) to specify the type of value the method should return. The return value’s type must match the return type of the method. If the return expression is compatible with the return type, a copy of that value gets returned in a process known as return by value.

Unlike void methods, non-void methods can be used as either a variable value or as part of an expression like so:

public static void main(String[] args){
    Car myCar = new Car("red");
    int numTires = myCar.numberOfTires();
}

Within main(), we called the numberOfTires() method on myCar. Since the method returns an int value of 4, we store the value in an integer variable called numTires. If we printed numTires, we would see 4.

We learned how to return primitive values from a method, but what if we wanted our method to return an object? Returning an object works a little differently than returning a primitive value. When we return a primitive value, a copy of the value is returned; however, when we return an object, we return a reference to the object instead of a copy of it.

Let’s create a second class, carLot, that takes in a Car as a parameter and contains a method which returns a Car object.

class CarLot {
    Car carInLot;
    public CarLot(Car givenCar) {
        carInLot = givenCar;
    }
 
    public Car returnACar() {
        // return Car object
        return carInLot;
    }
 
    public static void main(String[] args) {
        Car myCar = new Car("red", 70);
        System.out.println(myCar); 
        CarLot myCarLot = new CarLot(myCar);
        System.out.println(myCarLot.returnACar());
    }
}

This code outputs the same memory address because myCar and carInLot have the same reference value:

Car@2f333739
Car@2f333739

Store example...
public class Store {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // get price with tax method
  public double getPriceWithTax(){
    double tax = 0.08;
  double totalPrice = price + price * tax; 
  return totalPrice;
  }

  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
    
    double lemonadePrice = lemonadeStand.getPriceWithTax();
  System.out.println(lemonadePrice);
  }
}

# The toString() Method

When we print out Objects, we often see a String that is not very helpful in determining what the Object represents. In the last lesson, we saw that when we printed our Store objects, we would see output like:

Store@6bc7c054

where Store is the name of the object and 6bc7c054 is its position in memory.

This doesn’t tell us anything about what the Store sells, the price, or the other instance fields we’ve defined. We can add a method to our classes that makes this printout more descriptive.

When we define a toString() method for a class, we can return a String that will print when we print the object:

class Car {
 
    String color;
 
    public Car(String carColor) {
        color = carColor;
    }
 
    public static void main(String[] args){
        Car myCar = new Car("red");
        System.out.println(myCar);
    }
 
   public String toString(){
       return "This is a " + color + " car!";
   }
}

When this runs, the command System.out.println(myCar) will print This is a red car!, which tells us about the Object myCar.

Store example...

public class Store {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // get price with tax method
  public double getPriceWithTax(){
    double tax = 0.08;
    double totalPrice = price + price*tax;
    return totalPrice;
  }
  
  public String toString(){
    return "This store sells " + productType + " at a price of " + price + ".";
  }

  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
    Store cookieShop = new Store("Cookies", 5);

    System.out.println(lemonadeStand);
    System.out.println(cookieShop);
  }
}

# Review

Great work! Methods are a powerful way to abstract tasks away and make them repeatable. They allow us to define behavior for classes, so that the Objects we create can do the things we expect them to. Let’s review everything we have learned about methods so far.

Defining a method : Methods have a method signature that declares their return type, name, and parameters
Calling a method : Methods are invoked with a . and ()
Parameters : Inputs to the method and their types are declared in parentheses in the method signature
Changing Instance Fields : Methods can be used to change the value of an instance field
Scope : Variables only exist within the domain that they are created in
Return : The type of the variables that are output are declared in the method signature
As you move through more Java material, it will be helpful to frame the tasks you create in terms of methods. This will help you think about what inputs you might need and what output you expect.