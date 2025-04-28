package OOP;

public class Animal {

    public String name = "loulou";
    public int age;
    public String color;
    private String owner;
    private  static int countOfObjects = 0;

    public Animal(String owner){
        this.owner = owner;
        countOfObjects++;
    }

    public Animal(){
        System.out.println("Animal constructor");
    }

    public String getOwner(){
        return owner;
    }

    public static int getCount(){
        return countOfObjects;
    }

    public void makeVoice(){
        System.out.println("Animal makes some voice");
    }


    public static void main(String[] args) {
        Animal animal1 = new Animal("John");
        Animal animal2 = new Animal("Dave");
        Animal animal3 = new Animal("Stev");
        System.out.println("Created objects are: " + Animal.getCount());
        System.out.println("Owner is: " + animal1.getOwner());
        System.out.println("Owner is: " + animal2.getOwner());
    }
    
}
