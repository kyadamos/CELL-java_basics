# CELL-java_basics

## iteration 1

Codeblock below demonstrates the **main function** -- it is the entry point to a java program. Java conventions require the file name of the class to match the class name, so this code is saved in our project folder as `HelloWorld.java`.

```java
public class HelloWorld {
    
    public static void main(String[] args) {
        System.out.println ("Hello World!")
    }
}
```

Before this code can be run, we must first compile the Java file. From the terminal, we can do this by navigating to the directory of the file to compile, and then entering `javac HelloWorld.java`. This command will compile the .java file and create a .class file, `HelloWorld.class`.

We can now run our program by entering `java HelloWorld` in the directory of the .class file.

## iteration 2

### Data Types

#### Primitive Data Types

Most basic yet foundational data types in Java: `Boolean`, `Int`, `Double`, `Char`.

Ex:

```java
int studentAge = 24;
double studentGpa = 0.123;
char studentFirstInitial = 'K';
char studentLastInitial = 'A';
boolean hasPerfectAttendance = false;
```

### Reference Data Types

#### Strings in Java

Strings are a sequence of ordered characters. String variables are assigned using quotation marks.

Ex:

```java
String someText = "A String Variable";
```

##### Indexes with Strings

`charAt`: A string operation to access characters at a given index.

We can use `charAt` by calling it after the string that we are referring to.

Ex:

```java
char someChar = someText.charAt(0);
```

### Input and Output in Java

To output to the console, we use `System.out.println(<text>);`

To read input from the user, we create a `Scanner` data type with `System.in`

### Program Control Flow

Order in which a program's instructions are executed.


## iteration 3

### Functions in Java

Functions are a set of instructions that complete a certain task. When implemented correctly, functions reduce the effort required to write a program and can improve readability of the code. If a task or similar enough tasks need to be performed multiple times within a program, we can define a function that will carry out that task, and then call the function whenever needed in the program.


Ex 1: Function that prints "... hello!"
```java
public static void sayHello() {
    System.out.println(".");
    System.out.println("..");
    System.out.println("...");
    System.out.println("hello!");
}
```

#### Built-in Functions in Java
Java has some functions that are already built-in to Java, like `System.out.println`. Math is part of the Java standard library, and it also has many built-in functions, like `.pow`, `.abs`, `.atan`, etc.

### Parameters in Java
Parameters are inputs that are passed into a function for the function to use.

Ex 2: Function that accepts a number to square as an input, and then displays its square
```java
public static void square(double numberToSquare) {
    double squaredNumber = numberToSquare * numberToSquare;
    System.out.println(squaredNumber);
}
```

### Return Types in Java
We can return the output of our function to the main program for further use.

Ex 3: Function that changes the volume by an increment and returns it as an integer
```java
public class Main {
    public static int changeVolume(int oldVolume, int increment) {
        int newVolume = oldVolume + increment ;
        return newVolume;
    }

    public static void main(String[] args) {
        int currentVolume = 50;
        int loweredVolume = changeVolume(currentVolume, -2);
        System.out.println(loweredVolume);
    }
```

## iteration 4

### Classes in Java

Essentially, classes are pieces of code that represent a group of related objects. These objects are related to each other by a set of shared attributes and behaviors. For instance, if we were to create a dog class, then some attributes we could assign to the class are: its breed, fur color, age, etc. Barking or running would be some behaviors that it may have.

Ex 1:
```java
public Dog (double age, String color, String breed)
    this.age = age;
    this.color = color;
    this.breed = breed;

    public String bark() {
        System.out.println("woof");
    }
```

#### Constructors in Java
Instances are objects created from a class. Constructors are functions of a class used to create instances of that class. 

Ex 2:
```java
Dog myDog = new Dog(2.5, "blonde", "border terrier")
Dog yourDog = new Dog(3, "black", "husky")
```

In example 2, we instantiate two dogs and initialize their attributes with their respective values.

### Instance vs. Class

#### Instance Methods vs. Class Methods
To call methods of an instance, use the dot operator on the instance, followed by the desired method to call and parentheses.

Ex 3:
```java
myDog.bark();
```

#### Instance Variables vs. Class Variables
Instance variables are also accessed using the dot operator on the instance.

Ex 4:
```java
myDog.breed
```

In `.\iteration_work\final_demo`, we have a `StudentProfile` class with the `expectedYearToGraduate` attribute. The class also has a `incrementExpectedYearToGraduate` method, which reassigns the instance's `expectedYearToGraduate` to its value incremented by 1.