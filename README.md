# Singleton Design Pattern

	1.	Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine.
	2.	The singleton class must provide a global access point to get the instance of the class.
	3.	Singleton pattern is mostly used in multi-threaded and database applications. It is used in logging, caching, thread pools, configuration settings etc.

# When to use what
	1.	Eager initialization is easy to implement but it may cause resource and CPU time 	wastage. Use it only if cost of initializing a class is less in terms of resources or 	your program will always need the instance of class.
	2.	By using Static block in Eager initialization we can provide exception handling and 	also can control over instance.
	3.	Using synchronized we can create singleton class in multi-threading environment also 	but it can cause slow performance, so we can use Double check locking mechanism.
	4.	Bill Pugh implementation is most widely used approach for singleton classes. Most 	developers prefer it because of its simplicity and advantages.

# Different approach to achieve Singleton Design Pattern
	1.	Eager initialization
	2.	Static block initialization
	3.	Lazy Initialization
	4.	Thread Safe Singleton
	5. 	Bill Pugh Singleton Implementation
	6.	Using Reflection to destroy Singleton Pattern
	7.	Enum Singleton
	8.	Serialization and Singleton

