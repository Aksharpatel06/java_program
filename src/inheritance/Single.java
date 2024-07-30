class Animal {
    public String aAnimal = "Dog";
}

class Dog extends Animal { // Dog class extends Animal class
    public void getData() {
        System.out.print("Animal name is: " + aAnimal); // aAnimal is accessible because of inheritance
    }
}

public class Single {
    public static void main(String[] args) {
        Dog dog = new Dog(); // Create an instance of Dog
        dog.getData(); // Call getData method
    }
}
