public class Store {
  // instance fields
  // you add data to an object by introducing 
  // instance variables, or instance fields.
  // We want Store instances of different product types, so we declare a String
  // productType
  // instance field. Often times, instance variables are described as a “has-a” 
  // relationship with the object. For example, a Store “has-a” products. Another way 
  // to think of this is that instance variables are the nouns and adjectives associated
  // with an object. What qualities other than products might a store have?

  /*
  declare fields inside the class
  by specifying the type and name
  String productType;
  int inventoryCount;
  double inventoryPrice;
  */

  // Fields are a type of state each instance will possess. One instance of Store may
  // have "lemonade" as its product, another "bread", etc. It’s the job of the constructor
  // to give these instance fields initial value. 

  // State comes from instance fields declared inside the class
  
  String productType;
  int inventoryCount;
  double inventoryPrice;
  
  // constructor method
  // instructions for creating a Store instance
  // the constructor has the same name as the class 
  // When an object is created, the constructor sets the initial state
  // of the object. The state is made up of associated data that represents 
  // the characteristics of an object.

  /* 
  instance fields available in
  scope of constructor method
  */

  // In order to assign a value to an instance variable, 
  // we need to alter our constructor method to include parameters 
  // so that it can access the data we want to assign to an instance.
  // (String product, int count, double price) are the parameters 
  // Our method also has a signature which defines the name and parameters of the method. 
  // Store(String product, int count, double price)

  // A formal parameter specifies the type and name of data that 
  // can be passed into a method. In our example below, String product
  // is a formal parameter; productType will represent whatever String 
  // value is passed into the constructor.

  // In Java, because of constructor overloading, a class can 
  // have multiple constructors as long as they have different parameter values. 
  // The signature is useful in that it helps the compiler differentiate between 
  // the different methods.

  // If we do not define a constructor, the Java compiler will generate a default 
  // constructor that contains no arguments and assigns the object default values. 
  // Default values can be created by assigning values to the instance fields during 
  // their declaration:

  // example of default values 
  /* public class Car {
    String color = "red";
    boolean isElectric = false;
    int cupHolders = 4;
   
    public static void main(String[] args) {
      Car myCar = new Car();
      System.out.println(myCar.color); // Prints: red
    }
  }
  */ 

  public Store(String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }
  
  // main method
  // main method is where we create instances
  //Behavior comes from methods defined in the class.
  public static void main(String[] args) {
    // body of main method

    // Invoke the constructor
    Store lemonadeStand = new Store("lemonade", 42, .99);
    Store cookieShop = new Store("cookies", 12, 3.75);
    
    // printing productType from the lemonadeStand object which is lemonade 
    System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");
    
    System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
  }
}

// This is a class for Store 

// This example defines a class named Store. public is an access level modifier 
// that allows other classes to interact with this class. 

// This class has a main() method, which lists the tasks performed by 
// the program. main() runs when we execute the compiled Store.class file

