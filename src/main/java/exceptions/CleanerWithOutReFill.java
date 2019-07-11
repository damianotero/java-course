package exceptions;

public class CleanerWithOutReFill {

    private Bottle bottle;

    public CleanerWithOutReFill() {
        this.bottle = new Bottle();
    }

    public void clean() throws OutOfLiquidException {

        System.out.println("Sprays a dose. " + bottle.getQuantity() + " remains.");
        bottle.spray();

    }

    public Bottle getBottle() {
        return bottle;
    }
}
