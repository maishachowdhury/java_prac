Class methods and instance methods.

Class methods for example using self. You can think of class methods being used in
situations that require macro procedures and that you do not want to alter individual 
instances of that class. For example for a BankAccount class you may have self.delete
which will delete all the bank accounts in this situation making an instance method
is not needed because we are not altering specific bank accounts. We can also use class methods to alter databases. 

Instance methods first make instances of that class. Once you make an instance
for example my_account = BankAccount.new you can use the methods from that instance.
So for example, my_account.check_balance This will check the balance of that specific
instance of that bank account. The method would give you the balance of my_account. 