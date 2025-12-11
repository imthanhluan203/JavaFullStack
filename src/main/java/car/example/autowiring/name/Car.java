package car.example.autowiring.name;

public class Car {
    private Specification specification2;

    public void setSpecification2(Specification specification) {
        System.out.println("Setter Car is called");
        this.specification2 = specification;
    }

    public void displayDetails(){
        System.out.println("The detail of car:");
        System.out.println("=".repeat(30));
        System.out.println(specification2);
        System.out.println("=".repeat(30));
    }
}
