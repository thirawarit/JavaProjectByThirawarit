public class AssignProperty extends RentalProperty {
    // instance variables.
    private RentalProperty propertyOne;
    private RentalProperty propertyTwo;

    // constructor method.
    public AssignProperty() {
        super();
        this.propertyOne = new RentalProperty("AstonAsoke", 3500000, 30000);
        this.propertyTwo = new RentalProperty("Centric Tiwanon", 4000000, 8500);

    }

    // main method.
    public static void main(String[] args) {
        AssignProperty assign = new AssignProperty();

        System.out.println("\n====== 1 ======");
        assign.propertyOne.getInformation();
        System.out.print("\n");
        assign.propertyOne.calculateYield(11, 3000);
        assign.propertyOne.getInformation();

        System.out.println("\n====== 2 ======");
        assign.propertyTwo.getInformation();
        System.out.print("\n");
        assign.propertyTwo.calculateYield(12, 2500);
        assign.propertyTwo.getInformation();

    }
}
