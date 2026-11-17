
// Parent class
class Animal {

    void eat() {
        System.out.println("Animal is eating.");
    }
}

// Child class
class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking.");
    }
}

public class Exercise3_Inheritance {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.eat();  // Inherited method
        dog.bark(); // Child class method
    }
}
