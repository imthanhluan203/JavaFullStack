package car.example.constructor.injection;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }
    public void displayDetails(){
        System.out.println("The detail of car:");
        System.out.println("=".repeat(30));
        System.out.println(specification);
        System.out.println("=".repeat(30));
    }
}
