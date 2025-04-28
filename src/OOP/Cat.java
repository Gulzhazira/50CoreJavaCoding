package OOP;

public class Cat extends Animal {
    public Cat(){
        super();
        System.out.println("Cat constructor");
    }

    public void makeVoice(){
        super.makeVoice();
        System.out.println("Meow, meow");
    }

    public void printName(){
        System.out.println("Animal's name: " + super.name);
        System.out.println("Cat's name: " + name);
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Lisa";
        cat.makeVoice();
        cat.printName();
    }
    
}
