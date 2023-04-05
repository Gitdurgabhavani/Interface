1. What is an interface in Java?
Ans: An interface in Java is a mechanism that is used to achieve complete abstraction. It is basically a kind of
class that contains only constants and abstract methods.

2. Which modifiers are allowed for methods in an Interface?Explain with an example
Ans: Only abstract and public modifiers are allowed for methods in interfaces.

3. What is the use of interface in Java?
Ans: There are many reasons to use interfaces in java. They are as follows:
a. An interface is used to achieve full abstraction.
b. Using interfaces is the best way to expose our project’s API to some other project.
c. Programmers use interfaces to customise features of software differently for different objects.
d. By using interface, we can achieve the functionality of multiple inheritance.

4. What is the difference between abstract class and interface in Java?
Ans:Abstract class	                                                        Interface
1) Abstract class can have abstract and non-abstract methods.   --Interface can have only abstract methods. Since Java 8, it can have default and static methods also.
2) Abstract class doesn't support multiple inheritance. 	--Interface supports multiple inheritance.
3) Abstract class can have final, non-final, static and         --Interface has only static and final variables
non-static variables.	                                         .
4) Abstract class can provide the implementation of interface.  --Interface can't provide the implementation of abstract class.