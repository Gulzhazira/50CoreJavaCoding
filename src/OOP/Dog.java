package OOP;

public class Dog extends Animal{

    public String breed;
    public double  weightInKg;

    @Override
    public void makeVoice(){
        System.out.println("wof-wof");
    }

    public void favoriteFood(String food){
        System.out.println(name + " loves " + food);
    }

    //overloading
    public void favoriteFood(double  calorie){
        double rer = 70 * Math.pow(weightInKg, 0.75);
        double mer = rer * 1.6;
        if(mer>calorie){
            System.out.println(name + " eats a lot");
        } else if(mer < calorie){
            System.out.println(name + " needs more food");
        } else {
            System.out.println(name + " eats enough");
        }
    }
    
}
