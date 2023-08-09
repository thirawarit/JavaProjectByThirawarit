public class RentalProperty{
    // instance variables.
    private String nameProperty;
    private double price;
    private double rental;
    private int numberOfMonth;
    private double otherCosts;
    private double grossRentalYield;
    private double netRentalYield;

    // constructor method.

    /* The super constructor */
    /*  MUST be the first statement inside the constructor. */
    /* Implicit way to call in children classes invisibly. */
    public RentalProperty() { }

    public RentalProperty(String nameProperty, double priceProperty, double rental) {
        this.nameProperty = nameProperty;
        price = priceProperty;
        this.rental = rental;
    }

    // instance methods.
    public void calculateYield(int inPeriodOfMonths, int allFixCosts) {
        numberOfMonth = inPeriodOfMonths;
        otherCosts = allFixCosts;
        grossRentalYield = calculateGrossRentalYield();
        netRentalYield = calculateNetRentalYield();
    }

    private double calculateGrossRentalYield() {
        return (rental*numberOfMonth / price) * 100;
    }

    private double calculateNetRentalYield() {
        return ((rental*numberOfMonth - otherCosts*12) / price) * 100;
    }

    public String getNameProperty() {
        return nameProperty;
    }

    public double getPriceProperty() {
        return price;
    }

    public double getRental() {
        return rental;
    }

    public void getInformation() {
        System.out.printf("The name of property is \"%s\". %s", getNameProperty(), "\n");
        System.out.printf("Its price is %,3.2f BAHT. %s", getPriceProperty(),"\n");
        System.out.printf("Ratal for a renter is %,3.2f BAHT/month. %s", getRental(), "\n");
        if (grossRentalYield != 0 && netRentalYield != 0) {
            System.out.print("   Calculating yield... \n");
            System.out.printf("A renter live over a period of %d months \n", numberOfMonth);
            System.out.printf("Fixed costs you have to pay is %,3.2f BAHT \n", otherCosts);
            System.out.print("Gross Rental Yield = " + grossRentalYield + "%" + " \n");
            System.out.println("Net Rental Yield = " + netRentalYield + "%");
        }
    }

    // main method.
    public static void main(String[] args) {
        RentalProperty propertyOne = new RentalProperty("AstonAsoke", 3500000, 30000);
        propertyOne.getInformation();
        propertyOne.calculateYield(11, 3000);
        propertyOne.getInformation();
        // System.out.print("Gross Rental Yield = " + propertyOne.grossRentalYield + "%" + " \n");
        // System.out.println("Net Rental Yield = " + propertyOne.netRentalYield + "%");
    }
}
