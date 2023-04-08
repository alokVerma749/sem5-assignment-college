// 6.Write a program in Java to show various types of inheritance.

public class Example6 {
    public static void main(String[] args) {
        // creating objects of each class
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        GermanShepherd germanShepherd = new GermanShepherd();
        Siamese siamese = new Siamese();
        Lion lion = new Lion();

        // calling the methods of each object
        animal.makeSound();         // output: Animal is making a sound
        dog.makeSound();            // output: Dog is barking
        cat.makeSound();            // output: Cat is meowing
        germanShepherd.makeSound(); // output: Dog is barking
        siamese.makeSound();        // output: Cat is meowing
        lion.makeSound();           // output: Lion is roaring
    }
}

// Single inheritance: Animal is the superclass and Dog and Cat are the subclasses
class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat is meowing");
    }
}

// Multi-level inheritance: GermanShepherd is the subclass of Dog which is the subclass of Animal
class GermanShepherd extends Dog {
    // no need to override makeSound() method as it's inherited from Dog
}

class Siamese extends Cat {
    // no need to override makeSound() method as it's inherited from Cat
}

// Hierarchical inheritance: Lion, Tiger and Leopard are the subclasses of Animal
class Lion extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Lion is roaring");
    }
}

class Tiger extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Tiger is growling");
    }
}

class Leopard extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Leopard is snarling");
    }
}

// Multiple inheritance: Animal and Pet are the superclasses of PetDog
interface Pet {
    void cuddle();
}

class PetDog extends Animal implements Pet {
    @Override
    public void makeSound() {
        System.out.println("Pet dog is barking");
    }

    @Override
    public void cuddle() {
        System.out.println("Pet dog is cuddling");
    }
}

