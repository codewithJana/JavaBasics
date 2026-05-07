# **JAVA INHERITANCE — Complete Beginner's Guide**

---

## **AGENDA**

Follow this sequence to master Inheritance:

1. [What is Inheritance?](#1-what-is-inheritance)
2. [Why Do We Need Inheritance?](#2-why-do-we-need-inheritance)
3. [The `extends` Keyword](#3-the-extends-keyword)
4. [Types of Inheritance in Java](#4-types-of-inheritance-in-java)
5. [Single Inheritance](#5-single-inheritance)
6. [Multilevel Inheritance](#6-multilevel-inheritance)
7. [Hierarchical Inheritance](#7-hierarchical-inheritance)
8. [Multiple Inheritance (Why Java Says No)](#8-multiple-inheritance)
9. [Hybrid Inheritance](#9-hybrid-inheritance)
10. [The `super` Keyword](#10-the-super-keyword)
11. [Method Overriding](#11-method-overriding)
12. [What Gets Inherited? (Access Modifiers)](#12-what-gets-inherited)
13. [Complete Real-World Example](#13-complete-real-world-example)
14. [Interview Tips & Tricks](#14-interview-tips--tricks)

---

## **1. What is Inheritance?**

### **Definition**
Inheritance is an OOP concept where one class (child/subclass) acquires the properties (variables) and behaviors (methods) of another class (parent/superclass).

### **Real-World Analogy**
Think of a **family tree**:
- You inherit your **surname** from your father.
- You inherit **eye color** from your mother.
- But you also have your **own unique traits** (your hobbies, your job).

Similarly in Java:
- **Parent Class** = The one that gives features.
- **Child Class** = The one that receives features + adds its own.

### **Key Terminology**
| Term | Meaning |
|------|---------|
| Parent / Super / Base | The class that gives properties |
| Child / Sub / Derived | The class that receives properties |
| `extends` | Keyword to establish inheritance |
| `IS-A` | Relationship test (Dog IS-A Animal) |

---

## **2. Why Do We Need Inheritance?**

### **The Problem (Without Inheritance)**

Imagine you are building a **School Management App**. You need to manage **Students**, **Teachers**, and **Principals**.

Every person has:
- `name`
- `age`
- `eat()`
- `sleep()`

**Without Inheritance, you write the same code again and again:**

```java
class Student {
    String name;
    int age;

    void eat() { System.out.println(name + " is eating"); }
    void sleep() { System.out.println(name + " is sleeping"); }
    void study() { System.out.println(name + " is studying"); }
}

class Teacher {
    String name;
    int age;

    void eat() { System.out.println(name + " is eating"); }
    void sleep() { System.out.println(name + " is sleeping"); }
    void teach() { System.out.println(name + " is teaching"); }
}

class Principal {
    String name;
    int age;

    void eat() { System.out.println(name + " is eating"); }
    void sleep() { System.out.println(name + " is sleeping"); }
    void manage() { System.out.println(name + " is managing school"); }
}
```

**Problems:**
1. `name`, `age`, `eat()`, `sleep()` are **duplicated** in 3 classes.
2. If you want to add `address` to everyone, you must edit **all 3 classes**.
3. If you fix a bug in `eat()`, you must fix it in **all 3 classes**.
4. This violates the **DRY Principle** — Don't Repeat Yourself.

### **The Solution (With Inheritance)**

Create **one common class** and let others **inherit** from it.

```java
class Person {
    String name;
    int age;

    void eat() { System.out.println(name + " is eating"); }
    void sleep() { System.out.println(name + " is sleeping"); }
}

class Student extends Person {
    void study() { System.out.println(name + " is studying"); }
}

class Teacher extends Person {
    void teach() { System.out.println(name + " is teaching"); }
}

class Principal extends Person {
    void manage() { System.out.println(name + " is managing school"); }
}
```

**Benefits:**
1. `name`, `age`, `eat()`, `sleep()` written **only once**.
2. Add `address` to `Person` → all children get it **automatically**.
3. Fix `eat()` in `Person` → all children are **fixed automatically**.

> **📝 NOTE:** Inheritance = Write Once, Use Everywhere.

---

## **3. The `extends` Keyword**

### **Syntax**
```java
class Child extends Parent {
    // Child gets everything from Parent
}
```

### **Complete Working Example**

```java
// Parent class
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking");
    }
}

// Main class
public class ExtendsDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Tommy";    // Inherited from Animal
        d.eat();             // Inherited method
        d.bark();            // Own method
    }
}
```

**Output:**
```
Tommy is eating
Tommy is barking
```

**Explanation:**
- `Dog` did not declare `name` or `eat()`, but it can use them because it `extends Animal`.
- This is the power of inheritance — code reuse without rewriting.

---

## **4. Types of Inheritance in Java**

There are **5 types** of inheritance in OOP theory. But Java supports only **3 directly with classes**. The other 2 require **interfaces**.

| Type | Structure | Java Support |
|------|-----------|-------------|
| **Single** | Parent → Child | ✅ Yes |
| **Multilevel** | GrandParent → Parent → Child | ✅ Yes |
| **Hierarchical** | One Parent → Many Children | ✅ Yes |
| **Multiple** | Two Parents → One Child | ❌ No (with classes) |
| **Hybrid** | Mix of above | ✅ Yes (with interfaces) |

> **📝 INTERVIEW TIP:** Java does not support Multiple Inheritance with classes to avoid the **Diamond Problem**.

---

## **5. Single Inheritance**

### **Definition**
One class inherits from one parent class.

```
    Animal
      ↑
     Dog
```

### **Real-World Example**
A `SmartPhone` IS-A `Phone`. It has all features of a phone + extra features.

```java
class Phone {
    void call() {
        System.out.println("Calling...");
    }

    void receiveCall() {
        System.out.println("Receiving call...");
    }
}

class SmartPhone extends Phone {
    void browseInternet() {
        System.out.println("Browsing internet...");
    }

    void takePhoto() {
        System.out.println("Taking photo...");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();

        // Inherited methods
        sp.call();
        sp.receiveCall();

        // Own methods
        sp.browseInternet();
        sp.takePhoto();
    }
}
```

**Output:**
```
Calling...
Receiving call...
Browsing internet...
Taking photo...
```

**When to Use:** When there is a clear parent-child relationship and the child is a specialized version of the parent.

---

## **6. Multilevel Inheritance**

### **Definition**
A class is derived from a class which is also derived from another class.

```
    Animal
      ↑
    Mammal
      ↑
     Dog
```

### **Real-World Example**
- `Vehicle` → `Car` → `ElectricCar`
- `Animal` → `Mammal` → `Dog`

```java
class Animal {
    void breathe() {
        System.out.println("Breathing...");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Walking...");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Barking...");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.breathe();  // From Animal
        d.walk();     // From Mammal
        d.bark();     // From Dog
    }
}
```

**Output:**
```
Breathing...
Walking...
Barking...
```

### **Constructor Chaining in Multilevel**

When you create a child object, constructors run from **top to bottom** automatically.

```java
class GrandFather {
    GrandFather() {
        System.out.println("GrandFather constructor");
    }
}

class Father extends GrandFather {
    Father() {
        System.out.println("Father constructor");
    }
}

class Son extends Father {
    Son() {
        System.out.println("Son constructor");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Son s = new Son();
    }
}
```

**Output:**
```
GrandFather constructor
Father constructor
Son constructor
```

**Why this order?**
- Java secretly inserts `super()` as the **first line** of every constructor.
- `Son()` calls `Father()` → `Father()` calls `GrandFather()` → `GrandFather()` finishes first.

> **📝 MEMORY TRICK:** Think of construction like building a house. You cannot build the roof before the foundation.

### **Parameterized Constructors in Multilevel**

If the parent has a constructor with parameters, you **must** call it explicitly using `super(...)`.

```java
class GrandFather {
    String surname;

    GrandFather(String s) {
        surname = s;
        System.out.println("GrandFather surname: " + s);
    }
}

class Father extends GrandFather {
    String firstName;

    Father(String s, String f) {
        super(s);        // MUST call parent's constructor
        firstName = f;
        System.out.println("Father name: " + f + " " + surname);
    }
}

class Son extends Father {
    int age;

    Son(String s, String f, int a) {
        super(s, f);     // MUST call parent's constructor
        age = a;
        System.out.println("Son age: " + a);
    }
}

public class ParamChaining {
    public static void main(String[] args) {
        Son s = new Son("Sharma", "Ravi", 20);
        System.out.println("Final: " + s.firstName + " " + s.surname + ", Age: " + s.age);
    }
}
```

**Output:**
```
GrandFather surname: Sharma
Father name: Ravi Sharma
Son age: 20
Final: Ravi Sharma, Age: 20
```

**Explanation:**
- `Son` receives 3 values.
- It keeps `age` and passes `surname` and `firstName` upward using `super(s, f)`.
- Each level keeps what it needs and passes the rest up.

---

## **7. Hierarchical Inheritance**

### **Definition**
Multiple classes inherit from a single parent class.

```
       Animal
      ↗  ↑  ↖
    Dog Cat Cow
```

### **Real-World Example**
One `Vehicle` class. Many children: `Car`, `Bike`, `Truck`.

```java
class Vehicle {
    String brand = "Toyota";

    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void playMusic() {
        System.out.println(brand + " car playing music");
    }
}

class Bike extends Vehicle {
    void doWheelie() {
        System.out.println(brand + " bike doing wheelie");
    }
}

class Truck extends Vehicle {
    void loadCargo() {
        System.out.println(brand + " truck loading cargo");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();
        Truck t = new Truck();

        c.start();       // Inherited
        c.playMusic();   // Own

        b.start();       // Inherited
        b.doWheelie();   // Own

        t.start();       // Inherited
        t.loadCargo();   // Own
    }
}
```

**Output:**
```
Vehicle started
Toyota car playing music
Vehicle started
Toyota bike doing wheelie
Vehicle started
Toyota truck loading cargo
```

**When to Use:** When one general category has many specialized subcategories.

---

## **8. Multiple Inheritance**

### **Definition**
One class inherits from two or more parent classes.

```
   Father   Mother
      ↘    ↙
       Child
```

### **Why Java Does NOT Support This with Classes**

Consider this scenario (called the **Diamond Problem**):

```
      Person
     ↗     ↖
  Father   Mother
     ↘     ↙
       Child
```

If both `Father` and `Mother` have a method `speak()`, and `Child` inherits from both, which `speak()` should `Child` use? Java avoids this confusion by **not allowing** multiple class inheritance.

### **The Solution: Interfaces**

Java says: *"You can extend only ONE class, but you can implement MANY interfaces."*

```java
interface Father {
    void strong();
}

interface Mother {
    void caring();
}

class Child implements Father, Mother {
    @Override
    public void strong() {
        System.out.println("Child is strong like father");
    }

    @Override
    public void caring() {
        System.out.println("Child is caring like mother");
    }

    void ownTrait() {
        System.out.println("Child has own unique trait");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.strong();     // From Father interface
        c.caring();     // From Mother interface
        c.ownTrait();   // Own method
    }
}
```

**Output:**
```
Child is strong like father
Child is caring like mother
Child has own unique trait
```

**Clarification:**
- An **interface** is a contract. It says *"any class that implements me MUST have these methods."*
- Interfaces have no confusion because they don't contain code (until Java 8 default methods, which have clear rules).
- This is how Java achieves Multiple Inheritance safely.

---

## **9. Hybrid Inheritance**

### **Definition**
A combination of two or more types of inheritance.

### **Real-World Example**
A `TeachingAssistant` IS-A `Student` but also DOES a `Job`.

```java
class Person {
    String name;
    void speak() {
        System.out.println(name + " is speaking");
    }
}

class Student extends Person {
    int rollNo;
    void study() {
        System.out.println(name + " is studying");
    }
}

interface Job {
    void doJob();
}

class TeachingAssistant extends Student implements Job {
    @Override
    public void doJob() {
        System.out.println(name + " is assisting professor");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        TeachingAssistant ta = new TeachingAssistant();
        ta.name = "Priya";
        ta.speak();    // From Person
        ta.study();    // From Student
        ta.doJob();    // From Job interface
    }
}
```

**Output:**
```
Priya is speaking
Priya is studying
Priya is assisting professor
```

---

## **10. The `super` Keyword**

`super` has **three jobs** in Java:

### **Job 1: Call Parent Constructor**

```java
class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        super();  // Calls Parent constructor
        System.out.println("Child constructor");
    }
}
```

> **📝 NOTE:** If you don't write `super()`, Java adds it automatically. But if parent has parameters, you MUST write `super(value)`.

### **Job 2: Call Parent Method**

When child overrides a method but still wants parent's version:

```java
class Parent {
    void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    @Override
    void show() {
        super.show();  // Calls Parent's show()
        System.out.println("Child show");
    }
}
```

### **Job 3: Access Parent Variable**

When child and parent have the same variable name:

```java
class Parent {
    int x = 100;
}

class Child extends Parent {
    int x = 200;

    void print() {
        System.out.println(x);       // 200 (Child's x)
        System.out.println(super.x); // 100 (Parent's x)
    }
}
```

---

## **11. Method Overriding**

### **Definition**
When a child class provides its own implementation of a method that already exists in the parent class.

### **Why Override?**
The parent gives a **generic** behavior. The child makes it **specific**.

### **Example**

```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat says Meow");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog says Woof");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat();
        Dog d = new Dog();

        a.sound();  // Animal's version
        c.sound();  // Cat's version
        d.sound();  // Dog's version

        // Polymorphism
        Animal ref;
        ref = c;
        ref.sound();  // Calls Cat's version!
    }
}
```

**Output:**
```
Animal makes sound
Cat says Meow
Dog says Woof
Cat says Meow
```

### **Rules for Overriding**
1. Method name must be **same**.
2. Parameters must be **same**.
3. Return type must be **same** (or subclass in Java 5+).
4. Access modifier cannot be **more restrictive**.
5. Use `@Override` annotation (best practice).

> **📝 INTERVIEW TIP:** Overriding = Same signature, different body. Overloading = Same name, different parameters.

---

## **12. What Gets Inherited?**

### **Access Modifiers and Inheritance**

| Modifier | Same Class | Same Package | Subclass (Different Package) | Anywhere |
|----------|-----------|-------------|------------------------------|----------|
| `public` | ✅ | ✅ | ✅ | ✅ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| `default` | ✅ | ✅ | ❌ | ❌ |
| `private` | ✅ | ❌ | ❌ | ❌ |

### **What is Inherited?**

| Member | Inherited? | How to Access |
|--------|-----------|--------------|
| `public` fields/methods | ✅ Yes | Directly |
| `protected` fields/methods | ✅ Yes | Directly |
| `default` fields/methods | ✅ Only if same package | Directly |
| `private` fields/methods | ❌ No | Via public getters |
| Constructors | ❌ No | Via `super()` |
| Static members | ✅ Yes | Via class name |

### **Example**

```java
class Parent {
    public int a = 10;      // Inherited
    protected int b = 20;   // Inherited
    int c = 30;             // Inherited (same package)
    private int d = 40;     // NOT inherited

    public int getD() {     // But getter is inherited
        return d;
    }
}

class Child extends Parent {
    void show() {
        System.out.println(a);        // OK
        System.out.println(b);        // OK
        System.out.println(c);        // OK (same package)
        // System.out.println(d);   // ERROR! d is private
        System.out.println(getD());   // OK
    }
}
```

---

## **13. Complete Real-World Example**

### **Problem: Bank Account System**

A bank has different account types:
- **Savings Account** — has interest, withdrawal limits
- **Current Account** — has overdraft facility
- **Fixed Deposit** — has lock-in period

All accounts share: `accountNumber`, `holderName`, `balance`, `deposit()`, `checkBalance()`.

### **Solution with Inheritance**

```java
// Parent class
class BankAccount {
    String accountNumber;
    String holderName;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    void displayInfo() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Holder: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

// Child 1
class SavingsAccount extends BankAccount {
    double interestRate = 4.0;

    void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
}

// Child 2
class CurrentAccount extends BankAccount {
    double overdraftLimit = 10000;

    void useOverdraft(double amount) {
        System.out.println("Using overdraft: " + amount);
    }
}

// Main
public class BankDemo {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.accountNumber = "SAV123";
        sa.holderName = "Ravi";
        sa.deposit(5000);
        sa.addInterest();
        sa.displayInfo();

        System.out.println();

        CurrentAccount ca = new CurrentAccount();
        ca.accountNumber = "CUR456";
        ca.holderName = "Priya";
        ca.deposit(10000);
        ca.useOverdraft(2000);
        ca.displayInfo();
    }
}
```

**Output:**
```
Deposited: 5000.0
Interest added: 200.0
Account: SAV123
Holder: Ravi
Balance: 5200.0

Deposited: 10000.0
Using overdraft: 2000.0
Account: CUR456
Holder: Priya
Balance: 10000.0
```

**Why this design is good:**
1. `deposit()` and `checkBalance()` written **once** in `BankAccount`.
2. Each account type adds only its **unique** behavior.
3. Easy to add new account types without touching existing code.

---

## **14. Interview Tips & Tricks**

### **Common Interview Questions**

**Q1. Does Java support multiple inheritance?**
> No, not with classes. It creates the Diamond Problem. But Java supports multiple inheritance using interfaces.

**Q2. Can we override a static method?**
> No. Static methods belong to the class, not the object. If you write the same static method in a child, it is called **method hiding**, not overriding.

**Q3. Can we inherit constructors?**
> No. Constructors have the same name as the class. But we can call the parent constructor using `super()`.

**Q4. What is the difference between `this` and `super`?**
> `this` refers to the current object. `super` refers to the parent object.

**Q5. What happens if you don't write `super()` in a child constructor?**
> Java automatically inserts `super()` as the first line. But if the parent has a parameterized constructor, you MUST write `super(...)` yourself.

**Q6. Can a child class access private members of the parent?**
> No. Private members are not inherited. But if the parent provides public getters/setters, the child can use them.

### **Quick Memory Chart**

| Concept | Remember As |
|---------|------------|
| `extends` | IS-A relationship |
| `implements` | CAN-DO relationship |
| `super()` | Call parent's constructor |
| `super.method()` | Call parent's method |
| `@Override` | I am rewriting parent's method |
| Constructor Chain | Top to Bottom |

### **Golden Rules**
1. Use inheritance only for **IS-A** relationships.
2. Prefer **composition** (HAS-A) over inheritance when relationship is weak.
3. Always use `@Override` annotation.
4. Keep parent classes focused and generic.
5. Don't make everything inherit from everything — it creates tight coupling.

---

> **End of Guide — Practice each example in your IDE to build confidence!**
