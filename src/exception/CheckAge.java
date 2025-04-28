package exception;

public class CheckAge {
    public int ageLimit;

    public CheckAge(int ageLimit){
        this.ageLimit = ageLimit;
    }

    public void checkAge(int age) throws InvalidAgeException{
        if(age<ageLimit){
            throw new InvalidAgeException("You are underage!");
        }
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        CheckAge obj = new CheckAge(18);
        try {
            obj.checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
