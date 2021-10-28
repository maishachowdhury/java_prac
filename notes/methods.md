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
 