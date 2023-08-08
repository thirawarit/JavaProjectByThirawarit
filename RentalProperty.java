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
    public RentalProperty(String nameProperty, double priceProperty, double rental) {
        this.nameProperty = nameProperty;
        this.price = priceProperty;
        this.rental = rental;
    }

    // instance methods.
    public void calculateYield(int inPeriodOfMonths, int allFixCosts) {
        this.numberOfMonth = inPeriodOfMonths;
        this.otherCosts = allFixCosts;
        this.grossRentalYield = calculateGrossRentalYield();
        this.netRentalYield = calculateNetRentalYield();
    }

    private double calculateGrossRentalYield() {
        return (this.rental*this.numberOfMonth / this.price) * 100;
    }

    private double calculateNetRentalYield() {
        return ((this.rental*this.numberOfMonth - this.otherCosts*12) / this.price) * 100;
    }

    public String getNameProperty() {
        return this.nameProperty;
    }

    public double getPriceProperty() {
        return this.price;
    }

    public double getRental() {
        return this.rental;
    }

    public void getInformation() {
        System.out.printf("The name of property is \"%s\". %s",this.getNameProperty(), "\n");
        System.out.printf("Its price is %,3.2f BAHT. %s", this.getPriceProperty(),"\n");
        System.out.printf("Ratal for a renter is %,3.2f BAHT/month. %s", this.getRental(), "\n");
        if (this.grossRentalYield != 0 && this.netRentalYield != 0) {
            System.out.print("   Calculating yield... \n");
            System.out.printf("A renter live over a period of %d months \n", this.numberOfMonth);
            System.out.printf("Fixed costs you have to pay is %,3.2f BAHT \n", this.otherCosts);
            System.out.print("Gross Rental Yield = " + this.grossRentalYield + "%" + " \n");
            System.out.println("Net Rental Yield = " + this.netRentalYield + "%");
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
