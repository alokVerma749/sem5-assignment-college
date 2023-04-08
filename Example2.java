// 2. write a program in java iluustrating overloading and overriding.
public class Example2{
    public static void main(String[] args){
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
        dog.makeSound("loud");
    }
}
class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog is barking");
    }
    // overloading
    public void makeSound(String barkType){
        System.out.println("Dog is barking with "+barkType+" bark");
    }
}
class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Cat is meowing");
    }
}
/**
 * OUTPUT:
 * Animal is making a sound
 *  Dog is barking
 *  Cat is meowing
 *  Dog is barking with loud bark
 */