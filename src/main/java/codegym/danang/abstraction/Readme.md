Implementations<br>
+ Solution 1 - A Single Concrete Class<br>
  If we simply created a concrete class for Order, it would quickly become convoluted for a couple reasons:<br>
  Some of our class fields don't make sense for certain orders (an online order doesn't need a store ID or store rep)<br>
  The validate() and process() methods need to check the order type before executing any business logic. <br>
  
+ Solution 2 - Single Base Abstract class with Subclasses for Each Type<br>
   A cleaner solution is to implement a base abstract class called Order and subclass the different types.  <br>
   When it's time to add a new order type, we don't need to touch the Order class at all.    <br>
   We would simply create a new subclass that extends Order.
